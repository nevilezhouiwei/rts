/**  
* @Title: BookInfor.java
* @Package com.nevile.rts.spring.jdbctemplate.transaction
* @Description: TODO
* @author Nevile  
* @date 2018年5月27日 上午7:53:25
* @version V1.0  
*/ 
package com.nevile.rts.spring.jdbctemplate.transaction;

/**
 * ClassName: BookInfor
 * @Description: TODO
 */
public class BookInfor {
	private int id;
	private String name;
	private int price;
	private int storage;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "BookInfor [id=" + id + ", name=" + name + ", price=" + price + ", storage=" + storage + "]";
	}
	
	
}
