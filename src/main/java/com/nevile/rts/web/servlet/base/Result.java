package com.nevile.rts.web.servlet.base;

public class Result {
	private String code;
	private String message;
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Result [code=" + code + ", message=" + message + ", obj=" + obj + "]";
	}
	
	

}
