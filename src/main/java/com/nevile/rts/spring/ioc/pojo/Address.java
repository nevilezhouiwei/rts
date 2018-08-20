/**  
* @Title: Address.java
* @Package com.nevile.rts.base.logs.pojo
* @Description: TODO
* @author Nevile  
* @date 2018年4月2日 下午7:14:40
* @version V1.0  
*/ 
package com.nevile.rts.spring.ioc.pojo;

/**
 * ClassName: Address
 * @Description: 地址信息
 */
public class Address {
	
	private String uuid;
	private String addressName;
	private String addressNO;
	private Integer housePrice;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public String getAddressNO() {
		return addressNO;
	}
	public void setAddressNO(String addressNO) {
		this.addressNO = addressNO;
	}
	public Integer getHousePrice() {
		return housePrice;
	}
	public void setHousePrice(Integer housePrice) {
		this.housePrice = housePrice;
	}
	@Override
	public String toString() {
		return "Address [uuid=" + uuid + ", addressName=" + addressName + ", addressNO=" + addressNO + ", housePrice="
				+ housePrice + "]";
	}
	
	

}
