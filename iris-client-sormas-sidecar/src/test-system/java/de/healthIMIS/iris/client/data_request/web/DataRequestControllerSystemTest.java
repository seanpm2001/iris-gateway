package de.healthIMIS.iris.client.data_request.web;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

import de.healthIMIS.iris.client.IrisWebIntegrationTest;
import de.healthIMIS.iris.client.data_request.DataRequest;
import de.healthIMIS.iris.client.data_request.DataRequestManagement;
import de.healthIMIS.iris.client.data_request.Location;
import de.healthIMIS.iris.client.data_request.web.dto.ExistingDataRequestClientWithLocationList;

import java.time.Instant;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.util.collections.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

@IrisWebIntegrationTest
class DataRequestControllerSystemTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper om;

	@MockBean
	private DataRequestManagement dataRequestManagement;

	@Test
	public void endpointShouldBeProtected() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/data-requests-client/locations"))
				.andExpect(MockMvcResultMatchers.status().isForbidden()).andReturn();
	}

	@Test
	@WithMockUser()
	public void getDataRequests() throws Exception {
		var res = mockMvc.perform(
				MockMvcRequestBuilders
						.get("/data-requests-client/locations"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

		var dataRequests = om.readValue(res.getResponse().getContentAsString(),
				ExistingDataRequestClientWithLocationList.class);

		assertEquals(0, dataRequests.getDataRequests().size());

	}

	@Test
	@WithMockUser()
	public void getDataRequestByCode() throws Exception {
		postNewDataRequest();

		mockMvc.perform(
				MockMvcRequestBuilders
						.get("/data-requests-client/locations/123"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
	}

	@Test
	@WithMockUser()
	public void createDataRequest() throws Exception {
		postNewDataRequest();
	}

	private void postNewDataRequest() throws Exception {
		var dataRequest = Mockito.spy(new DataRequest("refId", "name", Instant.now(),
				Instant.now(), "requestDetails",
				"", new Location(), Sets.newSet(DataRequest.Feature.Guests)));

		// set by JPA on live calls, needs to be mocked here
		Mockito.doReturn(Instant.now()).when(dataRequest).getCreatedAt();
		Mockito.doReturn(Instant.now()).when(dataRequest).getLastModifiedAt();

		Mockito.when(
				dataRequestManagement.createLocationRequest(any(), any(), any(), any(), any(), any(), any()))
				.thenReturn(dataRequest);

		Mockito.when(
				dataRequestManagement.findById(anyString())).thenReturn(Optional.of(dataRequest));

		mockMvc.perform(
				MockMvcRequestBuilders.post("/data-requests-client/locations")
						.content(TestData.DATA_REQUEST)
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
	}
}
