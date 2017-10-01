package com.raj.mvcApp.dto.login;

import java.io.Serializable;

public class LoginDTO implements Serializable {
	private String emailId;
	private String password;
	
	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName()+"created....");
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDTO [emailId=" + emailId + ", password=" + password + "]";
	}
	
	

}
