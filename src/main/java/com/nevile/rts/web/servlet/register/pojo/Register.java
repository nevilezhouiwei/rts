package com.nevile.rts.web.servlet.register.pojo;

import java.io.Serializable;
import java.util.UUID;

public class Register implements Serializable{
	private String id;
	private String userName;
	private String birthday;


	private String password;
	private String cerIDno;
	private String address;

	public Register() {
		super();
		this.id = UUID.randomUUID().toString().replaceAll("-", "");

	}
	
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday() {
		return birthday;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getId() {
		return id;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCerIDno() {
		return cerIDno;
	}

	public void setCerIDno(String cerIDno) {
		this.cerIDno = cerIDno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", userName=" + userName + ", birthday=" + birthday + ", password=" + password
				+ ", cerIDno=" + cerIDno + ", address=" + address + "]";
	}

}
