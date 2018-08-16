/**
 * 
 */
package com.chnjan.dubbodemo.service;

import java.util.List;
import java.util.Map;

import com.chnjan.dubbodemo.domain.User;

/**
 * @author chenjian
 * @date 2018年7月22日
 */
public interface DemoApiService {
	
	String demo1();
	
	String demo2(String i);
	
	/**
	 * 返回对象实体
	 * */
	User demo3(String name,Integer age);
	
	/**
	 * 返回list
	 * */
	List<User> demo4();
	
	/**
	 * 返回map
	 * */
	Map<String, User> demo5();

}
