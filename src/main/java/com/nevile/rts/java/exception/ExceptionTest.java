/**  
* @Title: ExceptionTest.java
* @Package com.nevile.rts.java.exception
* @Description: TODO
* @author Nevile  
* @date 2018年5月21日 下午5:26:31
* @version V1.0  
*/ 
package com.nevile.rts.java.exception;

import org.junit.Test;

/**
 * ClassName: ExceptionTest
 * @Description: 自定义异常测试
 */
public class ExceptionTest {
	//在方法中使用运行时异常
	public Integer sub(int i,int j) {
		int n=i-j;
		if (n<0) {
			throw new NotNegativeException("结果为负数");
		}
		return n;
	}
	//在方法中使用受检查异常
	public Integer div(int i,int j) throws DivException {
		if (j==0) {
			throw new DivException("除数为零");
		}
		int n=i/j;
		
		return n;
	}

	@Test
	public void test1()  {
		//运行时异常测试
		//System.out.println(sub(5, 10));
		//检查时异常测试
		try {
			div(10, 0);
		} catch (DivException e) {
			e.printStackTrace();
		}
	}

}
