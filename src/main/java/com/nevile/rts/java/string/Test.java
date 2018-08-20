/**  
* @Title: Test.java
* @Package com.nevile.rts.java.string
* @Description: TODO
* @author Nevile  
* @date 2018年5月25日 上午9:20:13
* @version V1.0  
*/ 
package com.nevile.rts.java.string;

/**
 * ClassName: Test
 * @Description: TODO
 */
public class Test {
	
	public static void main(String[] args) {
		String string = null;
		string="a b c";
		System.out.println(string.trim());
		//String string1 = new String();
		//String string1 = "";两者效果一样
		String string1 = new String();
		string1="A B C";
		System.out.println(string1.trim());
	}

}
