package com.mitroimariana.hospital.form;



import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.mitroimariana.hospital.dto.BaseDTO;
import com.mitroimariana.hospital.dto.UserDTO;
import com.mitroimariana.hospital.util.DataUtility;



public class MyProfileForm extends BaseForm {

	@NotEmpty
	@Pattern(regexp = "^([A-Za-z ]*)*$")
	private String firstName;
	
	@NotEmpty
	@Pattern(regexp = "^([A-Za-z ]*)*$")
	private String lastName;

	@NotEmpty
	private String userName;
	@NotEmpty
	private String gender;

	@NotEmpty
	@Pattern(regexp="(^[7-9][0-9]{9})*$")
	private String phoneNo;

	@NotEmpty
	private String dob;
	
	

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
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	
	public BaseDTO getDto() {
		UserDTO dto = new UserDTO();
		dto.setPhoneNo(phoneNo);
		dto.setUserName(userName);
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setDob(DataUtility.getDate(dob));
		dto.setGender(gender);
		return dto;
	}

	
	public void populate(BaseDTO bDto) {
		UserDTO dto = (UserDTO) bDto;
		phoneNo = dto.getPhoneNo();
		userName = dto.getUserName();
		firstName = dto.getFirstName();
		lastName = dto.getLastName();
		dob = DataUtility.getStringDate(dto.getDob());
		gender = dto.getGender();

	}

}
