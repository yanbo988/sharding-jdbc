package com.cxytiandi.sharding.controller;

import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public Object list() {
		return userService.list();
	}
	
	@GetMapping("/add")
	public Object add() {
		for (long i = 0; i < 100; i++) {
			User user = new User();
			user.setId(i);
			user.setCity("深圳");
			user.setName("李四");
			userService.add(user);
		}
		return "success";
	}

	/**
	 * 根据特定id查询，几张分区表都会扫描到
	 * @param id
	 * @return
	 */
	@GetMapping("/users/{id}")
	public Object get(@PathVariable Long id) {
		return userService.findById(id);
	}

	/**
	 * 根据name查询，几张分区表都会扫描到
	 * @param name
	 * @return
	 */
	@GetMapping("/users/query")
	public List<User> get(String name) {
		return userService.findByName(name);
	}


	/**
	 * id范围查询，几张分区表都会扫描到
	 * @param id
	 * @return
	 */
	@GetMapping("/users/range/{id}")
	public List<User> getRange(@PathVariable Long id) {
		return userService.findByIdRange(id);
	}
}
