/*
 * SORMAS REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.55.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.healthIMIS.sormas.client.api;

import de.healthIMIS.sormas.client.model.PersonDto;
import de.healthIMIS.sormas.client.model.PushResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonControllerApi
 */
@Ignore
public class PersonControllerApiTest {

	private final PersonControllerApi api = new PersonControllerApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllPersonsTest() {
		Long since = null;
		List<PersonDto> response = api.getAllPersons(since);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllUuids12Test() {
		List<String> response = api.getAllUuids12();

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getByUuids18Test() {
		List<String> body = null;
		List<PersonDto> response = api.getByUuids18(body);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void postPersonsTest() {
		List<PersonDto> body = null;
		List<PushResult> response = api.postPersons(body);

		// TODO: test validations
	}
}
