package com.autostoping.dao;

import com.autostoping.model.User;

import java.util.List;

public interface UserDAO {
	List<User> list();
	
	User get(int id);
	
	void saveOrUpdate(User user);
	
	void delete(int id);
}