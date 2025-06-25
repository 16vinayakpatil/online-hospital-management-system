package com.mitroimariana.hospital.form;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.mitroimariana.hospital.dto.BaseDTO;
import com.mitroimariana.hospital.dto.PatientDTO;
import com.mitroimariana.hospital.dto.UserDTO;
import com.mitroimariana.hospital.util.DataUtility;

public class PatientForm extends BaseForm {
	
	@NotEmpty
	@Pattern(regexp = "(^[A-Za-z ]*)*$")
	private String firstName;
	
	@NotEmpty
	@Pattern(regexp = "(^[A-Za-z ]*)*$")
	private String lastName;

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
	private String age;
	
	@NotEmpty
	private String city;
	
	
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public BaseDTO getDto() {
		PatientDTO dto=new PatientDTO();
		dto.setId(id);
		dto.setCreatedBy(createdBy);
		dto.setModifiedBy(modifiedBy);
		dto.setCreatedDatetime(createdDateTime);
		dto.setModifiedDatetime(modifiedDateTime);
		
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		
		dto.setEmailId(email);
		dto.setGender(gender);
		dto.setPhoneNo(phoneNo);
		dto.setCNP(CNP);
		dto.setCity(city);
		dto.setAddress(address);
		dto.setAge(age);
		dto.setDob(DataUtility.getDate(dob));
		
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {
		PatientDTO dto = (PatientDTO) bDto;
		
		id = dto.getId();
		createdBy = dto.getCreatedBy();
		modifiedBy = dto.getModifiedBy();
		createdDateTime = dto.getCreatedDatetime();
		modifiedDateTime = dto.getModifiedDatetime();
		firstName = dto.getFirstName();
		lastName =dto.getLastName();
		
		email=dto.getEmailId();
		gender=dto.getGender();
		phoneNo =dto.getPhoneNo();
		CNP =dto.getCNP();
		city =dto.getCity();
		address =dto.getAddress();
		age=dto.getAge();
		dob=DataUtility.getStringDate(dto.getDob());
		
	}

}
