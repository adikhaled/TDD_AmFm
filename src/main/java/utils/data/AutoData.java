package utils.data;

public class AutoData {

	private String zipCode;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String aptUnit;
	private String dob;


	public AutoData(String zipCode, String firstName, String lastName, String streetAddressString, String aptUnit, String dob ) {
		this.zipCode = zipCode;
		this.firstName =firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddressString;
		this.aptUnit =aptUnit;
		this.dob = dob;
	}
	public String getzipCode() {
		return zipCode;
	}
	public String getfirstName() {
		return firstName;

	}	public String getLastName() {
		return lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public String getAptUnit() {
		return aptUnit;
	}
	public String getDob() {
		return dob;
	}

}
