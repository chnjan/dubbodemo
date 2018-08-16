/**
 * 
 */
package com.chnjan.dobbodemo.consumer;

import java.util.List;
import java.util.Map;

import com.chnjan.dubbodemo.domain.User;
import com.chnjan.dubbodemo.service.DemoApiService;

/**
 * @author chenjian
 * @date 2018年7月22日
 */
public class DubboConsumer {
	
	private DemoApiService demoApiService;
	
	public void callDubboService1() {
		String rslt = demoApiService.demo1();
		System.out.println("demo1:"+rslt);
		
		rslt = demoApiService.demo2("一");
		System.out.println("demo2:"+rslt);
		
		User user = demoApiService.demo3("一",4);
		System.out.println("demo3:"+user);
		
		List<User> list = demoApiService.demo4();
		System.out.println("demo4:"+list);
		
		Map<String, User> map = demoApiService.demo5();
		System.out.println("demo5:"+map);
	}

	/**
	 * @return the demoApiService
	 */
	public DemoApiService getDemoApiService() {
		return demoApiService;
	}

	/**
	 * @param demoApiService the demoApiService to set
	 */
	public void setDemoApiService(DemoApiService demoApiService) {
		this.demoApiService = demoApiService;
	}

}
