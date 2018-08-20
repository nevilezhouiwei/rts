/**  
* @Title: InputIOBytes.java
* @Package com.nevile.rts.java.io.io_byte
* @Description: TODO
* @author Nevile  
* @date 2018年6月3日 下午7:05:49
* @version V1.0  
*/
package com.nevile.rts.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

/**
 * ClassName: InputIOBytes
 * 
 * @Description: 字节流方式写数据到文本
 */
public class IOBytes {
	public static void main(String[] args) throws FileNotFoundException {
		// memeryToDisk();
		// txt2txt();
		// test();
		// filterIO();
		// 这涉及到一个反序列化的内容暂时不考虑
		// objectIO();
		// dataInputStream读取文本中的数据，比较麻烦，因为无法确定文件中的数据是否为java类型
		dataInputStream();
		// bufferIO();
		//printIO();
		
	}

	public static void printIO() throws FileNotFoundException {
		/**
		 * PrintOutStream是以流的方式数据数据到底层流。以Print 开头的流是输出流。
		 * PrintOutStream是一个包装流。使用自动刷新机制，但是在构造其中要设置。否则还是要手动设置
		 */
		String isName = "C:\\Users\\Administrator\\Desktop\\testIO\\test.txt";
		FileInputStream is = new FileInputStream(isName);
		BufferedInputStream bis = new BufferedInputStream(is);

		String osName = "C:\\Users\\Administrator\\Desktop\\testIO\\test2.txt";
		FileOutputStream os = new FileOutputStream(osName);
		//设置自动刷新
		PrintStream ps = new PrintStream(os,true);
		ps.println("PrintStream");
		ps.append("a");
		ps.println(true);

		int i = 0;
		byte[] buffer = new byte[32];
		try {
			while ((i = bis.read(buffer)) != -1) {
				ps.write(buffer, 0, i);
				ps.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ps.close();
	}

	public static void bufferIO() throws FileNotFoundException {
		/**
		 * Buffer 处理流中使用了缓冲技术。这个缓冲技术是数据和底层操作系统之间、硬盘之间的缓存。Buffer中缓存数据后 在程序内部使用程序员在应用层中使用
		 * byte[]数据处理应用层的数据。这样的好处是应用层在频繁的操作数据的时候是直接从缓存中 取得数据，而不是每次都要和操作系统和IO设备之间读取数据。
		 */
		String isName = "C:\\Users\\Administrator\\Desktop\\testIO\\test.txt";
		FileInputStream is = new FileInputStream(isName);
		BufferedInputStream bis = new BufferedInputStream(is);

		String osName = "C:\\Users\\Administrator\\Desktop\\testIO\\test1.txt";
		FileOutputStream os = new FileOutputStream(osName);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		int i = 0;
		byte[] buffer = new byte[32];
		try {
			while ((i = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, i);
				bos.flush();
				System.out.println(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void dataInputStream() throws FileNotFoundException {
		/**
		 * 使用字节流转GBK编码会造成乱码，因为各个字符的GBK编码中字符的编码长度可能不一样，缓冲字节数组中无法保证取出来的 字节完整的表示一个字符。
		 * dataInputStream 中只是对字节流数据转换为字符流才来些许方便。
		 */
		String isName = "C:\\Users\\Administrator\\Desktop\\testIO\\test.txt";
		FileInputStream is = new FileInputStream(isName);
		DataInputStream dis = new DataInputStream(is);
		byte[] b = new byte[32];
		int i = 0;

		try {
			while ((i = dis.read(b)) != -1) {
				String string = new String(b, 0, i, "GBK");
				System.out.print(string);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void objectIO() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("t.tmp");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void filterIO() throws FileNotFoundException {
		String isName = "C:\\Users\\Administrator\\Desktop\\testIO\\test1.txt";
		FileInputStream is = new FileInputStream(isName);
		FilterInputStream fis = new FilterInputStream(is) {
		};
		StringBuffer sBuffer = new StringBuffer();
		int b = 0;
		int total = 0;
		byte[] buffer = new byte[100];
		try {
			// 从流开始时直接跳过前一百个字节出开始读数据
			fis.skip(100);
			while ((b = fis.read(buffer)) != -1) {
				total += b;

				sBuffer.append(buffer);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("字节数量：" + total);
		System.out.println("sBuffer:" + sBuffer.toString());
	}

	public static void test() {
		String str = "你好hello";
		int byte_len = str.getBytes().length;
		int len = str.length();
		System.out.println("字节长度为：" + byte_len);
		System.out.println("字符长度为：" + len);
		System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
	}

	public static void txt2txt() throws FileNotFoundException {
		String isName = "C:\\Users\\Administrator\\Desktop\\testIO\\随笔.txt";
		FileInputStream is = new FileInputStream(isName);

		String osName = "C:\\Users\\Administrator\\Desktop\\testIO\\test.txt";
		FileOutputStream os = new FileOutputStream(osName);

		byte[] buffer = new byte[512];

		int size = -1;

		try {
			while ((size = is.read(buffer)) != -1) {
				System.err.println(size);
				os.write(buffer, 0, size);
			}
			os.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void memeryToDisk() {
		// 1、创建文件
		File file = null;
		String fname = "C:\\Users\\Administrator\\Desktop\\testIO";
		file = new File(fname);
		while (!file.exists())
			file.mkdirs();
		file = new File(file.toPath() + "\\test1.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.err.println("创建文件失败。");
			e.printStackTrace();
		}

		// 2、创建内存中的数据
		StringBuffer sBuffer = new StringBuffer();

		for (int i = 0; i < 500; i++) {
			sBuffer.append(i + "\t\n");
		}

		// 3、向文件中写入数据，使用基础的字节流方式
		try {
			FileOutputStream os = new FileOutputStream(file);
			byte[] bs = sBuffer.toString().getBytes();
			os.write(bs);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
