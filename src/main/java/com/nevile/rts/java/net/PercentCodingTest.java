package com.nevile.rts.java.net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.Test;

public class PercentCodingTest {
	/**
	 * 
	* @Description: HTTP协议的URL中字符串的百分号编码（percent encoding）,根据html 页面提交的数据，已经被浏览器中
	* 的编码工具编码后产生了百分号+字符编码的编码提交到服务端。
	* @Title: coding 
	* @Description: TODO  void
	 */
	@Test
	public void coding() {
		//可以在英文和中文之间切换，查看编码和解码结果
		String name = "ceshi";
		
		try {
			String encode = URLEncoder.encode(name, "UTF-8");
			System.out.println("encode:"+encode);
			String decode = URLDecoder.decode(encode,"UTF-8");
			System.out.println("decode"+decode);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
