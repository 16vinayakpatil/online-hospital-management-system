package com.mitroimariana.hospital.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class AppointmentDTO extends BaseDTO {

	@Column(name="First_Name", length=225)
	private String firstName;
	@Column(name = "LAST_NAME", length = 225)
	private String lastName;
	@Column(name = "DOCTOR_NAME", length = 225)
	private String doctorName;
	@Column(name = "APP_TIME", length = 225)
	private String time;
	@Column(name = "APP_DATE")
	private Date appDate;
	@Column(name = "PHONE_NO", length = 225)
	private String phoneNo;
	
	@Column(name = "CNP", length = 225)
	private String CNP;
	
	
	
	
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


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public Date getAppDate() {
		return appDate;
	}


	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	

	public String getCNP() {
		return CNP;
	}


	public void setCNP(String cNP) {
		CNP = cNP;
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
