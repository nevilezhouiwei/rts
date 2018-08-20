/**  
* @Title: Account.java
* @Package com.nevile.rts.spring.jdbctemplate.transaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月27日 上午9:58:30
* @version V1.0  
*/ 
package com.nevile.rts.spring.jdbctemplate.transaction;

/**
 * ClassName: Account
 * @Description: TODO
 */
public class Account {
	private int id;
	private String name;
	private int money;
	private int sid;
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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", money=" + money + ", sid=" + sid + "]";
	}
	
	

}
