package com.capg.flightmanagement.userms.entities;

import java.math.BigInteger;

import com.capg.flightmanagement.util.UserValidation;

public class User {
	// attributes
	private String UserType;
	private BigInteger id;
	private String userName;
	private Password password;
	private BigInteger Phone;
	private String email;
//constructor
	public User() {
		
		this("", null, " ", null, null, "");
	}
//constructor
	public User(String UserType, BigInteger id, String userName, Password password, BigInteger Phone, String email) {
		this.UserType = UserType;
		this.id = id;
		this.userName = userName;
		this.password = password;
		UserValidation.validatePhone(Phone);
		this.Phone = Phone;
		UserValidation.validateEmail(email);
		this.email = email;

	}
	//getter and setters

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public BigInteger getPhone() {
		return Phone;
	}

	public void setPhone(BigInteger phone) {
		Phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [UserType=" + UserType + ", id=" + id + ", userName=" + userName + ", password=" + password
				+ ", Phone=" + Phone + ", email=" + email + "]";
	}

}
