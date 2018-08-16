/**
 * 
 */
package com.chnjan.dubbodemo.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.chnjan.dubbodemo.domain.User;
import com.chnjan.dubbodemo.service.DemoApiService;

/**
 * @author chenjian
 * @date 2018年7月22日
 */
@Service
public class DubboDemoProviderImpl implements DemoApiService {

	/* (non-Javadoc)
	 * @see com.chnjan.dubbodemo.service.DemoApiService#demo1()
	 */
	@Override
	public String demo1() {
		return "Hello String demo";
	}

	
	/* (non-Javadoc)
	 * @see com.chnjan.dubbodemo.service.DemoApiService#demo2(java.lang.String)
	 */
	@Override
	public String demo2(String i) {
		return i;
	}


	@Override
	public User demo3(String name, Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		return user;
	}


	@Override
	public List<User> demo4() {
		User user1 = new User();
		user1.setName("zs");
		user1.setAge(1);
		
		User user2 = new User();
		user2.setName("ls");
		user2.setAge(2);
		
		User user3 = new User();
		user3.setName("王五");
		user3.setAge(3);
		
		List<User> list = new ArrayList<>(3);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		return list;
	}


	@Override
	public Map<String, User> demo5() {
		User user1 = new User();
		user1.setName("赵六");
		user1.setAge(1);
		
		User user2 = new User();
		user2.setName("田七");
		user2.setAge(2);
		
		Map<String, User> map = new HashMap<>();
		map.put("1", user1);
		map.put("2", user2);
		return map;
	}

}
