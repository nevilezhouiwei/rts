/**  
* @Title: IOChar.java
* @Package com.nevile.rts.java.io.io_byte
* @Description: TODO
* @author Nevile  
* @date 2018年6月6日 下午8:57:45
* @version V1.0  
*/
package com.nevile.rts.java.io;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Test;

/**
 * ClassName: IOChar
 * 
 * @Description: TODO
 */
public class IOChar {
	/**
	 * 1、Reader是抽象类，规定了字符流操作的基本方法
	 * 
	 * InputStreamReader 是Reader子类
	 * 
	 * --------FileReader是 InputStreamReader子类
	 * 
	 * StringReader 是Reader子类
	 * 
	 * BufferReader 是Reader子类
	 * 
	 * FilterReader
	 * 
	 */

	@Test
	public void inputStreamReader() {
		/**
		 * 如果要处理
		 */
		String isName = "C:\\Users\\Administrator\\Desktop\\testIO\\test3.txt";
		Reader fReader = null;
		try {
			fReader = new InputStreamReader(new FileInputStream(new File(isName)), "GBK");
			int i = 0;
			char[] buffer = new char[6];

			// 文件的字符编码和文件流化后流采用的编码是两个概念。
			System.out.println(((InputStreamReader) fReader).getEncoding());

			while ((i = fReader.read(buffer)) != -1) {
				String string = null;
				// 字符数组不支持指定编码格式的构造器
				string = new String(buffer, 0, i);
				System.out.print(string);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fReader.close();
			} catch (IOException e) {
			}
		}
	}

	/**
	 * inputStreamReader 可以灵活的对底层的字符进行设置。
	 * 
	 * fileReader 这个方法无需创建底层流，十分方便，使用编程环境的编码方式对文件进行解码
	 */
	@Test
	public void fileReader() {
		String fileName = "C:\\Users\\Administrator\\Desktop\\testIO\\test3.txt";
		FileReader rf = null;
		try {
			rf = new FileReader(fileName);
			int i = 0;
			char[] buffer = new char[8];
			String string = null;
			while ((i = rf.read(buffer)) != -1) {
				string = new String(buffer, 0, i);
				System.out.print(string);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				rf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * 使用流技术把字符流化，再写出到其他的输出流
	 */
	@Test
	public void stringReader() throws IOException {
		String fileName = "C:\\Users\\Administrator\\Desktop\\testIO\\test3.txt";
		StringReader rf = null;
		try {
			rf = new StringReader(fileName);
			int i = 0;
			char[] buffer = new char[8];
			String string = null;
			while ((i = rf.read(buffer)) != -1) {
				string = new String(buffer, 0, i);
				System.out.println(string);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			rf.close();
		}

	}

	/**
	 * 提高读取底层流的速度
	 */
	@Test
	public void bufferedReader() {

		String fileName = "C:\\Users\\Administrator\\Desktop\\testIO\\test3.txt";
		BufferedReader rf = null;
		try {
			rf = new BufferedReader(new FileReader(fileName));
			int i = 0;
			char[] buffer = new char[8];
			String string = null;
			while ((i = rf.read(buffer)) != -1) {
				string = new String(buffer, 0, i);
				System.out.print(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				rf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void charArrayReader() {
		/**
		 * 从构造器 CarArrayReader() 中可以看出，此构造器是对字符数组进行流处理的工具。
		 * 被流处理后的字符数组可以按照流的思路对数据进行操作。
		 */
		

		//String fileName = "C:\\Users\\Administrator\\Desktop\\testIO\\test3.txt";
		CharArrayReader rf = null;
		int i = 10;
		char[] buffer = new char[i];
		while(i>=0) {
			buffer[i] = (char) i;
			i--;
		}
		rf = new CharArrayReader(buffer);
		
	
		
	
	
		
		
	}
}