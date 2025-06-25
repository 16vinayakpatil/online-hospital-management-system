package com.mitroimariana.hospital.form;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.mitroimariana.hospital.dto.BaseDTO;
import com.mitroimariana.hospital.dto.UserDTO;



public class ForgetPasswordForm extends BaseForm {

	@NotEmpty
	private String userName;
	
	
	
	
	
	
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public BaseDTO getDto() {
	
		UserDTO dto = new UserDTO();
		dto.setUserName(userName);
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {
		// TODO Auto-generated method stub
		
	}

}
