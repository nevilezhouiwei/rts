/**  
* @Title: ListenLog.java
* @Package com.nevile.rts.base.aop.aspect
* @Description: TODO
* @author Nevile  
* @date 2018年4月14日 下午10:14:57
* @version V1.0  
*/ 
package com.nevile.rts.spring.aop.anotation.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ClassName: ListenLog
 * @Description: 监听日志
 */
@Aspect
@Component
public class ListenLog {
	/**
	 * @Description: JoinPoint 变量参数可以获得切点的方法名称和传入参数等相关信息。 
	 * @throws
	 */
	@Before("execution(* com.nevile.rts.spring.aop.anotation.dao.*.*(..))")
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("--->监听日志开始,方法："+methodName+" 开始...");
		System.out.println("请求参数："+args);
	}
	
	
	public void after() {
		System.out.println("--->监听日志结束");
	}

}
