package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.po.User;

import java.util.List;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);

	List<User> findByName(String name);

	List<User> findByIdRange(Long id);
	
}
