package com.raj.mvcApp.dto.register;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.servlet.DispatcherServlet;

@Entity
@Table(name = "usertable")
public class RegisterDTO implements Serializable {
	public RegisterDTO() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Id
	@GenericGenerator(name = "myId", strategy = "increment")
	@GeneratedValue(generator = "myId")
	@Column(name = "r_id")
	private int id;
	@Column(name = "r_name")
	private String name;
	@Column(name = "r_enamil")
	private String emailId;
	@Column(name = "r_phone")
	private long phoneNum;
	@Column(name = "r_password")
	private String password;
	@Column(name = "r_confirmpwd")
	private String confirmPwd;
	@Column(name = "r_country")
	private String country;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "RegisterDTO [id=" + id + ", name=" + name + ", emailId="
				+ emailId + ", phoneNum=" + phoneNum + ", password=" + password
				+ ", confirmPwd=" + confirmPwd + ", country=" + country + "]";
	}

}
