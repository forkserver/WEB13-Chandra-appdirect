package com.model;


public class Address 
{
	private String city;
	private String country;
	private String state;

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String street1;
	private String street2;
	private String zip;
	public Address(){}
	public Address(String city, String country, String street1, String street2, String zip) 
	{
		super();
		this.city = city;
		this.country = country;
		this.street1 = street1;
		this.street2 = street2;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	

}