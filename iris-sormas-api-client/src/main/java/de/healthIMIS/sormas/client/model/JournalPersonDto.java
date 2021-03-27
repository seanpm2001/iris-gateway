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

package de.healthIMIS.sormas.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.healthIMIS.sormas.client.model.FollowUpStatus;
import de.healthIMIS.sormas.client.model.Sex;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.time.Instant;

/**
 * JournalPersonDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class JournalPersonDto {
	@JsonProperty("uuid")
	private String uuid = null;

	@JsonProperty("pseudonymized")
	private Boolean pseudonymized = null;

	@JsonProperty("firstName")
	private String firstName = null;

	@JsonProperty("lastName")
	private String lastName = null;

	@JsonProperty("emailAddress")
	private String emailAddress = null;

	@JsonProperty("phone")
	private String phone = null;

	@JsonProperty("birthdateDD")
	private Integer birthdateDD = null;

	@JsonProperty("birthdateMM")
	private Integer birthdateMM = null;

	@JsonProperty("birthdateYYYY")
	private Integer birthdateYYYY = null;

	@JsonProperty("sex")
	private Sex sex = null;

	@JsonProperty("latestFollowUpEndDate")
	private Instant latestFollowUpEndDate = null;

	@JsonProperty("followUpStatus")
	private FollowUpStatus followUpStatus = null;

	public JournalPersonDto uuid(String uuid) {
		this.uuid = uuid;
		return this;
	}

	/**
	 * Get uuid
	 * 
	 * @return uuid
	 **/
	@Schema(description = "")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public JournalPersonDto pseudonymized(Boolean pseudonymized) {
		this.pseudonymized = pseudonymized;
		return this;
	}

	/**
	 * Get pseudonymized
	 * 
	 * @return pseudonymized
	 **/
	@Schema(description = "")
	public Boolean isPseudonymized() {
		return pseudonymized;
	}

	public void setPseudonymized(Boolean pseudonymized) {
		this.pseudonymized = pseudonymized;
	}

	public JournalPersonDto firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Get firstName
	 * 
	 * @return firstName
	 **/
	@Schema(description = "")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public JournalPersonDto lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Get lastName
	 * 
	 * @return lastName
	 **/
	@Schema(description = "")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public JournalPersonDto emailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	/**
	 * Get emailAddress
	 * 
	 * @return emailAddress
	 **/
	@Schema(description = "")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public JournalPersonDto phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * Get phone
	 * 
	 * @return phone
	 **/
	@Schema(description = "")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public JournalPersonDto birthdateDD(Integer birthdateDD) {
		this.birthdateDD = birthdateDD;
		return this;
	}

	/**
	 * Get birthdateDD
	 * 
	 * @return birthdateDD
	 **/
	@Schema(description = "")
	public Integer getBirthdateDD() {
		return birthdateDD;
	}

	public void setBirthdateDD(Integer birthdateDD) {
		this.birthdateDD = birthdateDD;
	}

	public JournalPersonDto birthdateMM(Integer birthdateMM) {
		this.birthdateMM = birthdateMM;
		return this;
	}

	/**
	 * Get birthdateMM
	 * 
	 * @return birthdateMM
	 **/
	@Schema(description = "")
	public Integer getBirthdateMM() {
		return birthdateMM;
	}

	public void setBirthdateMM(Integer birthdateMM) {
		this.birthdateMM = birthdateMM;
	}

	public JournalPersonDto birthdateYYYY(Integer birthdateYYYY) {
		this.birthdateYYYY = birthdateYYYY;
		return this;
	}

	/**
	 * Get birthdateYYYY
	 * 
	 * @return birthdateYYYY
	 **/
	@Schema(description = "")
	public Integer getBirthdateYYYY() {
		return birthdateYYYY;
	}

	public void setBirthdateYYYY(Integer birthdateYYYY) {
		this.birthdateYYYY = birthdateYYYY;
	}

	public JournalPersonDto sex(Sex sex) {
		this.sex = sex;
		return this;
	}

	/**
	 * Get sex
	 * 
	 * @return sex
	 **/
	@Schema(description = "")
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public JournalPersonDto latestFollowUpEndDate(Instant latestFollowUpEndDate) {
		this.latestFollowUpEndDate = latestFollowUpEndDate;
		return this;
	}

	/**
	 * Get latestFollowUpEndDate
	 * 
	 * @return latestFollowUpEndDate
	 **/
	@Schema(description = "")
	public Instant getLatestFollowUpEndDate() {
		return latestFollowUpEndDate;
	}

	public void setLatestFollowUpEndDate(Instant latestFollowUpEndDate) {
		this.latestFollowUpEndDate = latestFollowUpEndDate;
	}

	public JournalPersonDto followUpStatus(FollowUpStatus followUpStatus) {
		this.followUpStatus = followUpStatus;
		return this;
	}

	/**
	 * Get followUpStatus
	 * 
	 * @return followUpStatus
	 **/
	@Schema(description = "")
	public FollowUpStatus getFollowUpStatus() {
		return followUpStatus;
	}

	public void setFollowUpStatus(FollowUpStatus followUpStatus) {
		this.followUpStatus = followUpStatus;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JournalPersonDto journalPersonDto = (JournalPersonDto) o;
		return Objects.equals(this.uuid, journalPersonDto.uuid)
				&& Objects.equals(this.pseudonymized, journalPersonDto.pseudonymized)
				&& Objects.equals(this.firstName, journalPersonDto.firstName)
				&& Objects.equals(this.lastName, journalPersonDto.lastName)
				&& Objects.equals(this.emailAddress, journalPersonDto.emailAddress)
				&& Objects.equals(this.phone, journalPersonDto.phone)
				&& Objects.equals(this.birthdateDD, journalPersonDto.birthdateDD)
				&& Objects.equals(this.birthdateMM, journalPersonDto.birthdateMM)
				&& Objects.equals(this.birthdateYYYY, journalPersonDto.birthdateYYYY)
				&& Objects.equals(this.sex, journalPersonDto.sex)
				&& Objects.equals(this.latestFollowUpEndDate, journalPersonDto.latestFollowUpEndDate)
				&& Objects.equals(this.followUpStatus, journalPersonDto.followUpStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(uuid, pseudonymized, firstName, lastName, emailAddress, phone, birthdateDD, birthdateMM,
				birthdateYYYY, sex, latestFollowUpEndDate, followUpStatus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JournalPersonDto {\n");

		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("    pseudonymized: ").append(toIndentedString(pseudonymized)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    birthdateDD: ").append(toIndentedString(birthdateDD)).append("\n");
		sb.append("    birthdateMM: ").append(toIndentedString(birthdateMM)).append("\n");
		sb.append("    birthdateYYYY: ").append(toIndentedString(birthdateYYYY)).append("\n");
		sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
		sb.append("    latestFollowUpEndDate: ").append(toIndentedString(latestFollowUpEndDate)).append("\n");
		sb.append("    followUpStatus: ").append(toIndentedString(followUpStatus)).append("\n");
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
