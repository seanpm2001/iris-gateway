package de.healthIMIS.iris.client.data_submission.model;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A collection of guests who attended a queried event or location in the queried time. This data must be encrypted with
 * the key of health department from DataRequest.keyOfHealthDepartment!
 */
@Schema(
		description = "A collection of guests who attended a queried event or location in the queried time. This data must be encrypted with the key of health department from DataRequest.keyOfHealthDepartment!")
@Valid
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
		date = "2021-02-18T08:11:24.698Z[GMT]")

public class GuestList {

	@JsonProperty("guests") @Valid
	private List<Guest> guests = new ArrayList<Guest>();

	@JsonProperty("dataProvider")
	private GuestListDataProvider dataProvider = null;

	@JsonProperty("additionalInformation")
	private String additionalInformation = null;

	@JsonProperty("startDate")
	private OffsetDateTime startDate = null;

	@JsonProperty("endDate")
	private OffsetDateTime endDate = null;

	public GuestList guests(List<Guest> guests) {
		this.guests = guests;
		return this;
	}

	public GuestList addGuestsItem(Guest guestsItem) {
		this.guests.add(guestsItem);
		return this;
	}

	/**
	 * Get guests
	 * 
	 * @return guests
	 **/
	@Schema(required = true, description = "")
	@NotNull
	@Valid
	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	public GuestList dataProvider(GuestListDataProvider dataProvider) {
		this.dataProvider = dataProvider;
		return this;
	}

	/**
	 * Get dataProvider
	 * 
	 * @return dataProvider
	 **/
	@Schema(description = "")

	@Valid
	public GuestListDataProvider getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(GuestListDataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}

	public GuestList additionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	/**
	 * Additional informations about the guest list and the event or location.
	 * 
	 * @return additionalInformation
	 **/
	@Schema(description = "Additional informations about the guest list and the event or location.")

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public GuestList startDate(OffsetDateTime startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * Start date/time of attendance for this guest list.
	 * 
	 * @return startDate
	 **/
	@Schema(description = "Start date/time of attendance for this guest list.")

	@Valid
	public OffsetDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}

	public GuestList endDate(OffsetDateTime endDate) {
		this.endDate = endDate;
		return this;
	}

	/**
	 * End date/time of attendance for this guest list.
	 * 
	 * @return endDate
	 **/
	@Schema(description = "End date/time of attendance for this guest list.")

	@Valid
	public OffsetDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(OffsetDateTime endDate) {
		this.endDate = endDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GuestList guestList = (GuestList) o;
		return Objects.equals(this.guests, guestList.guests) && Objects.equals(this.dataProvider, guestList.dataProvider)
				&& Objects.equals(this.additionalInformation, guestList.additionalInformation)
				&& Objects.equals(this.startDate, guestList.startDate) && Objects.equals(this.endDate, guestList.endDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(guests, dataProvider, additionalInformation, startDate, endDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GuestList {\n");

		sb.append("    guests: ").append(toIndentedString(guests)).append("\n");
		sb.append("    dataProvider: ").append(toIndentedString(dataProvider)).append("\n");
		sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
