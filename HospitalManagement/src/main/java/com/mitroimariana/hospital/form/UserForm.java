package com.mitroimariana.hospital.form;

import javax.validation.constraints.Min;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.mitroimariana.hospital.dto.BaseDTO;
import com.mitroimariana.hospital.dto.UserDTO;
import com.mitroimariana.hospital.util.DataUtility;



public class UserForm extends BaseForm {

	@NotEmpty
	@Pattern(regexp = "(^[A-Za-z ]*)*$")
	private String firstName;
	
	
	@NotEmpty
	@Pattern(regexp = "(^[A-Za-z ]*)*$")
	private String lastName;

	@NotEmpty
	@Pattern(regexp = "(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}))*$")
	private String userName;

	@NotEmpty
	@Pattern(regexp = "(^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\\S])[A-Za-z0-9\\S]{6,12})*$")
	private String password;

	@NotEmpty
	private String confirmPassword;

	@NotEmpty
	private String dob;

	@NotEmpty
	@Pattern(regexp = "(^[7-9][0-9]{9})*$")
	private String phoneNo;

	@NotEmpty
	private String gender;

	@Min(value = 1)
	private long roleId;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public com.mitroimariana.hospital.dto.BaseDTO getDto() {
		UserDTO dto = new UserDTO();
		dto.setId(id);
		dto.setCreatedBy(createdBy);
		dto.setModifiedBy(modifiedBy);
		dto.setCreatedDatetime(createdDateTime);
		dto.setModifiedDatetime(modifiedDateTime);

		dto.setFirstName(firstName);
		dto.setLastName(lastName);

		dto.setDob(DataUtility.getDate(dob));

		dto.setUserName(userName);
		dto.setPassword(password);
		dto.setPhoneNo(phoneNo);
		dto.setGender(gender);
		dto.setRoleId(roleId);

		return dto;
	}

	public void populate(BaseDTO bDto) {
		UserDTO dto = (UserDTO) bDto;
		id = dto.getId();
		createdBy = dto.getCreatedBy();
		modifiedBy = dto.getModifiedBy();
		createdDateTime = dto.getCreatedDatetime();
		modifiedDateTime = dto.getModifiedDatetime();

		firstName = dto.getFirstName();
		lastName = dto.getLastName();
		dob = DataUtility.getStringDate(dto.getDob());
		userName = dto.getUserName();
		password = dto.getPassword();
		confirmPassword = dto.getPassword();
		phoneNo = dto.getPhoneNo();
		gender = dto.getGender();
		roleId = dto.getRoleId();

	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
