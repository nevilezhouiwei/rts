package com.nevile.rts.web.servlet.login.pojo;

public class User {
	private String id;
	private String userName;
	private String birthday;

	private String password;
	private String cerIDno;
	private String address;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
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
		return "User [id=" + id + ", userName=" + userName + ", birthday=" + birthday + ", password=" + password
				+ ", cerIDno=" + cerIDno + ", address=" + address + "]";
	}

	

}
