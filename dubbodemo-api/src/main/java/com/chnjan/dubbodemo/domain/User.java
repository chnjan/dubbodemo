/**
 * 
 */
package com.chnjan.dubbodemo.domain;

import java.io.Serializable;

/**
 * @author chenjian
 * @date 2018年7月22日
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	

}
