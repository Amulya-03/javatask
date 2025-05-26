package com.manufacturer;

public class Manufacturer {
	private String manufacturerName;
	private String manufacturerAddress;
	private String registrationNumber;
	
	private Manufacturer(String manufacturerName,String manufacturerAddress, String registrationNumber) {
		this.manufacturerName=manufacturerName;
		this.manufacturerAddress=manufacturerAddress;
		this.registrationNumber=registrationNumber;
	}
	//getters
	public String getmanufacturerName() {
	  return manufacturerName;
    }
	public String getmanufacturerAddress() {
		  return manufacturerAddress;
		
	}
	public String getregistrationNumber() {
		  return registrationNumber;
	}
	public void setmanufacturerName(String manufacturerName) {
		this.manufacturerName=manufacturerName;
	}
	public void setmanufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress=manufacturerAddress;
	}
	public void setregistrationNumber(String registrationNumber) {
		this.registrationNumber=registrationNumber;
		

	}
	public String toString() {
		return "Manufacturer[manufacturerName="+manufacturerName+", manufacturerAddress="+ manufacturerAddress+", registrationNumber="+registrationNumber+"]";
	}
	
	  public static Manufacturer getManufacturerObject(String manufacturerName, String manufacturerAddress, String registrationNumber) {
		 if(registrationNumber.length()!=10) {
			 return null;
		 }
		 return new Manufacturer(manufacturerName, manufacturerAddress, registrationNumber); 
			 
		 }
	}

