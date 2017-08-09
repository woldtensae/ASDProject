package edu.mum.framework.service.impl;

import java.util.List;

import edu.mum.dao.UserDao;
import edu.mum.framework.domain.User;
import edu.mum.framework.service.UserService;

public class UserServiceImpl implements UserService{
     private UserDao userDao;
     public UserServiceImpl(UserDao userDao){
    	 this.userDao=userDao;
     }
	@Override
	public void saveUser(User user) {
		userDao.add(user);
		
	}
	@Override
	public void deletUser(User user) {
		userDao.remove(user);
		
	}
	public void updateUserById(String id) {
		userDao.remove(id);
		
	}
	@Override
	public void updateUser(User user) {
		userDao.update(user);
		
	}
	@Override
	public User findOneUser(String id) {
		return userDao.findOne(id);
	}
	
	@Override
	public List<User> findAllUser() {
		return userDao.findAll();
	}
	@Override
	public User findUserByName(String name) {
		return userDao.findByUserName(name);
	}

}
