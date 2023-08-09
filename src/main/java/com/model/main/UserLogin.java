package com.model.main;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
  
@Entity
public class UserLogin {
	@Id
	@Column(name = "User_id")
	private int UserId;

	@Column(name = "User_Name")
	private String userName;

	@Column(name = "Email_Id" ,unique = true)
	private String emailId;
     private String userPassword;
	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public UserLogin(int userId, String userName, String emailId) {
		super();
		UserId = userId;
		this.userName = userName;
		this.emailId = emailId;
	}

	public UserLogin() {
		super();

	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
