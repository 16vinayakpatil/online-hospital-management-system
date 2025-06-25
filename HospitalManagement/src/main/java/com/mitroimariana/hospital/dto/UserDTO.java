package com.mitroimariana.hospital.dto;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User POJO class. It is persistent object.
 * 
 * @author Navigable Set
 * @version 1.0
 * @Copyright (c) Navigable Set
 */

@Entity
@Table(name = "USER")
public class UserDTO extends BaseDTO implements DropdownList {
    
    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;
    /**
     * Last Name of User
     */
    @Column(name = "LAST_NAME", length = 50)
    private String lastName;
    /**
     * Login of User
     */
    @Column(name = "USER_NAME", length = 50)
    private String userName;
    /**
     * Password of User
     */
    @Column(name = "PASSWORD", length = 50)
    private String password;
    /**
     * Date of Birth of User
     */
    @Column(name = "DOB")
    private Date dob;
    /**
     * MobielNo of User
     */
    @Column(name = "PHONE_NO", length = 15)
    private String phoneNo;
    /**
     * Role of User
     */
    @Column(name = "ROLE_ID")
    private long roleId;
    
    /**
     * Gender of User
     */
    @Column(name = "GENDER", length = 10)
    private String gender;
   
  
    @Column(name = "AGE", length = 10)
	private String age;
    
    @Column(name = "spcialization", length = 225)
	private String spcialization;
    
    @Column(name = "blood_Group", length = 225)
	private String bloodGroup;
    
    @Column(name = "address", length = 225)
	private String address;
    
    @Column(name = "city", length = 225)
	private String city;
    
    @Column(name = "CNP", length = 225)
	private String CNP;
    
    @Column(name = "maritial_Status", length = 225)
	private String maritialStatus;
    
    @Column(name = "joining_Date")
	private Date joiningDate;
    
    @Column(name = "qualification", length = 225)
	private String Qualification;
    
    @Column(name = "email_id", length = 225)
	private String emailId;
    
    
    
    
    

    
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSpcialization() {
		return spcialization;
	}

	public void setSpcialization(String spcialization) {
		this.spcialization = spcialization;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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

	public String getMaritialStatus() {
		return maritialStatus;
	}

	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

   

    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    public String getKey() {
        return id + "";
    }

    public String getValue() {
        return firstName + " " + lastName;
    }

}