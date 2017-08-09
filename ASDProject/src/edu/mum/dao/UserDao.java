package edu.mum.dao;

import edu.mum.framework.domain.User;

public interface UserDao extends Dao<User> {
	public void remove(String id);
	public User update(User user);
	public User findOne(String id);	
	public User findByUserName(String userName);
	
}
