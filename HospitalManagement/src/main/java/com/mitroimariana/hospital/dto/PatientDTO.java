package com.mitroimariana.hospital.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Patient")
public class PatientDTO extends BaseDTO implements DropdownList {

	
	@Column(name = "FIRST_NAME", length = 225)
	private String firstName;
	/**
	 * Last Name of User
	 */
	@Column(name = "LAST_NAME", length = 225)
	private String lastName;
	/**
	 
	
	/**
	 * Date of Birth of User
	 */
	@Column(name = "DOB")
	private Date dob;
	/**
	 * MobielNo of User
	 * 
	 */
	@Column(name = "PHONE_NO", length = 50)
	private String phoneNo;
	
	/**
	 * Gender of User
	 */
	@Column(name = "gender", length = 50)
	private String gender;
	
	@Column(name = "age", length = 50)
	private String age;
	
	@Column(name = "email_id", length = 225)
	private String emailId;
	
    @Column(name = "address", length = 225)
	private String address;
    
    @Column(name = "city", length = 225)
	private String city;
    
    @Column(name = "CNP", length = 225)
	private String CNP;
    
    
	
	
	
	
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return String.valueOf(id);
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName;
	}

}
