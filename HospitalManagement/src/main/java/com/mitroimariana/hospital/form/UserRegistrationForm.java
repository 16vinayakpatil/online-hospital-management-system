package com.mitroimariana.hospital.form;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.mitroimariana.hospital.dto.BaseDTO;
import com.mitroimariana.hospital.dto.UserDTO;
import com.mitroimariana.hospital.util.DataUtility;



public class UserRegistrationForm extends BaseForm {

	@NotEmpty
	@Pattern(regexp = "(^[A-Za-z ]*)*$")
	private String firstName;
	/**
	 * Last Name of User
	 */
	@NotEmpty
	@Pattern(regexp = "(^[A-Za-z ]*)*$")
	private String lastName;

	@NotEmpty
	@Pattern(regexp="(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}))*$")
	private String userName;

	@NotEmpty
	private String gender;
	/**
	 * Password of User
	 */
	@NotEmpty
	@Pattern(regexp="(^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\\S])[A-Za-z0-9\\S]{6,12})*$",message="Pattern.form.password")

	private String password;

	@NotEmpty

	private String confirmPassword;

	/**
	 * Date of Birth of User
	 */
	@NotEmpty
	private String dob;

	/**
	 * MobielNo of User
	 */
	@NotEmpty
	@Pattern(regexp="(^[7-9][0-9]{9})*$")
	private String phoneNo;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	@Override
	public BaseDTO getDto() {
		UserDTO dto = new UserDTO();
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setUserName(userName);
		dto.setPassword(password);
		dto.setGender(gender);
		dto.setDob(DataUtility.getDate(dob));
		dto.setPhoneNo(phoneNo);
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {

	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
