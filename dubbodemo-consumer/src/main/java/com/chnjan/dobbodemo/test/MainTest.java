/**
 * 
 */
package com.chnjan.dobbodemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chnjan.dobbodemo.consumer.DubboConsumer;

/**
 * @author chenjian
 * @date 2018年7月22日
 */
public class MainTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		
		DubboConsumer consumer = (DubboConsumer) applicationContext.getBean("consumer");
		
		consumer.callDubboService1();
	}

}
