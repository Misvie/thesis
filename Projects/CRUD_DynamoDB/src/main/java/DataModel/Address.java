package DataModel;


import DateUtil.DateFormatting;
import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.time.LocalDateTime;


@DynamoDBTable(tableName="Addresses")
public class Address {

	private String ID;

	private LocalDateTime creationDate;

	private String street1;

	private String street2;

	private String city;

	private String zipCode;

	private String state;

	private String country;



	@DynamoDBHashKey(attributeName="ID")
	@DynamoDBAutoGeneratedKey()
	public String getID() {
		return ID;
	}

	public void setID(String id) {
		this.ID  = id;
	}


	@DynamoDBAttribute(attributeName="CreationDate")
	public String getCreationDate() {
		return DateFormatting.getFormattedDate(creationDate);
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = DateFormatting.setToFormattedDate(creationDate);
	}

	@DynamoDBAttribute(attributeName="Street1")
	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	@DynamoDBAttribute(attributeName="Street2")
	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	@DynamoDBAttribute(attributeName="City")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@DynamoDBAttribute(attributeName="ZipCode")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@DynamoDBAttribute(attributeName="State")
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

	@DynamoDBAttribute(attributeName="Country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address()
	{
		creationDate = LocalDateTime.now();
	}

	public Address( String street1, String street2, String city, String zipCode, String state, String country) {
		//setID();
		this.creationDate = LocalDateTime.now();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.country = country;
	}
}
