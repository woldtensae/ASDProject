package edu.mum.framework.dao;

import edu.mum.framework.domain.User;

public interface UserDao extends Dao<User> {
	public User findByUserName(String name);
	
}
