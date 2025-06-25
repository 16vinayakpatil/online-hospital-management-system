package com.mitroimariana.hospital.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.mitroimariana.hospital.dto.BaseDTO;
import com.mitroimariana.hospital.dto.UserDTO;
import com.mitroimariana.hospital.util.DataUtility;

public class DoctorForm extends BaseForm {
	
	@NotEmpty
	@Pattern(regexp = "(^[A-Za-z ]*)*$")
	private String firstName;
	
	@NotEmpty
	@Pattern(regexp = "(^[A-Za-z ]*)*$")
	private String lastName;
	
	@NotEmpty
	private String userName;
	
	@NotEmpty
	@Pattern(regexp = "(^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\\S])[A-Za-z0-9\\S]{6,12})*$")
	private String password;
	
	@NotEmpty
	@Pattern(regexp = "(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}))*$")
	private String email;
	
	@NotEmpty
	private String gender;
	
	@NotEmpty
	private String phoneNo;
	
	@NotEmpty
	private String dob;
	
	@NotEmpty
	private String CNP;
	
	@NotEmpty
	private String qualification;
	
	@NotEmpty
	private String city;
	
	@NotEmpty
	private String specialization;
	
	@NotEmpty
	private String address;
	
	
	

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public BaseDTO getDto() {
		
		UserDTO dto=new UserDTO();
		dto.setId(id);
		dto.setCreatedBy(createdBy);
		dto.setModifiedBy(modifiedBy);
		dto.setCreatedDatetime(createdDateTime);
		dto.setModifiedDatetime(modifiedDateTime);
		
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setUserName(userName);
		dto.setPassword(password);
		dto.setEmailId(email);
		dto.setGender(gender);
		dto.setPhoneNo(phoneNo);
		dto.setCNP(CNP);
		dto.setCity(city);
		dto.setAddress(address);
		dto.setSpcialization(specialization);
		dto.setQualification(qualification);
		dto.setDob(DataUtility.getDate(dob));
		
		
		return dto;
		
		
	}

	@Override
	public void populate(BaseDTO bDto) {
		UserDTO dto = (UserDTO) bDto;
		
		id = dto.getId();
		createdBy = dto.getCreatedBy();
		modifiedBy = dto.getModifiedBy();
		createdDateTime = dto.getCreatedDatetime();
		modifiedDateTime = dto.getModifiedDatetime();
		firstName = dto.getFirstName();
		lastName =dto.getLastName();
		userName=dto.getUserName();
		password=dto.getPassword();
		email=dto.getEmailId();
		gender=dto.getGender();
		phoneNo =dto.getPhoneNo();
		CNP =dto.getCNP();
		city =dto.getCity();
		address =dto.getAddress();
		specialization=dto.getSpcialization();
		qualification=dto.getQualification();
		dob=DataUtility.getStringDate(dto.getDob());
		
	}

}
