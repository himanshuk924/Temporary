package com.cg.modelresume;

public class ResumeModel {
private String firstName;
private String lastName;
private String Gender;
private String HighQualification;
private String DOB;
private String Hobbies[];
private String Address;
private String Skills[];
private String Email;
private String Website;
private String Summary;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getHighQualification() {
	return HighQualification;
}
public void setHighQualification(String highQualification) {
	HighQualification = highQualification;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public String[] getHobbies() {
	return Hobbies;
}
public void setHobbies(String[] hobbies) {
	Hobbies = hobbies;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String[] getSkills() {
	return Skills;
}
public void setSkills(String[] skills) {
	Skills = skills;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getWebsite() {
	return Website;
}
public void setWebsite(String website) {
	Website = website;
}
public String getSummary() {
	return Summary;
}
public void setSummary(String summary) {
	Summary = summary;
}


}
