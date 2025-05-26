package com.school;

public class School {
	private  String schoolName;
	private  String schoolAddress;
	private  String schoolMotto;
	
	private School(String schoolName, String schoolAddress, String schoolMotto) {
		this.schoolName=schoolName;
		this.schoolAddress=schoolAddress;
		this.schoolMotto=schoolMotto;
	}
	//getters
	public String getschoolName() {
		return schoolName;
		
	}
	public String getschoolAddress() {
		return schoolAddress;
	}
	public String getschoolMotto() {
		return schoolMotto;
	}
	
	//setters
	public void setSchoolName(String getschoolName) {
		this.schoolName=schoolName;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress=schoolAddress;
		
	}
	public void setSchoolMotto(String schoolMotto) {
		this.schoolMotto=schoolMotto;
	}
	public String toString() {
		return "School[schoolName="+schoolName+", schoolAddress= "+schoolAddress+", schoolMotto="+schoolMotto+"]";
	}
	public static School getSchoolObject(String schoolName, String schoolAddress, String schoolMotto) {
		if(schoolName==null||schoolAddress==null||schoolMotto==null||schoolName.isEmpty()||schoolAddress.isEmpty()||schoolMotto.isEmpty()) {
			return null;
		}
		return new School(schoolName, schoolAddress, schoolMotto);
		
	}
	
}
 