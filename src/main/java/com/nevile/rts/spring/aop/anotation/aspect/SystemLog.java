/**  
* @Title: SystemLog.java
* @Package com.nevile.rts.base.aop.aspect
* @Description: TODO
* @author Nevile  
* @date 2018年4月11日 下午10:51:06
* @version V1.0  
*/ 
package com.nevile.rts.spring.aop.anotation.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * ClassName: SystemLog
 * @Description: 
 */
public class SystemLog implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("保存开始");
		
		//手动执行目标方法
		Object obj = mi.proceed();
		
		System.out.println("保存结束");
		return obj;
	}

}
