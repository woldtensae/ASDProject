package edu.mum.framework.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import edu.mum.framework.dao.UserDao;
import edu.mum.framework.domain.AUser;
import edu.mum.framework.domain.concrete.User;
import edu.mum.framework.service.UserService;

public class  UserServiceImpl<T> implements UserService<T>{
     private UserDao<T> userDao;
     
     public UserServiceImpl(UserDao<T> userDao){
    	 this.userDao=userDao;
     }

	@Override
	public boolean saveUser(T user) {
		if (userDao.findAll().stream().anyMatch(x -> ((AUser) x).getCredentialA().getPassword()
				.equals(((AUser) user).getCredentialA().getPassword())
				&& ((AUser) x).getCredentialA().getUserName().equals(((AUser) user).getCredentialA().getUserName())))
			return false;
		userDao.add(user);
		return true;
	}

	@Override
	public void deleteUser(T user) {
		userDao.remove(user);
	}

	@Override
	public void updateUserById(String id) {
		//userDao.update(id);
	}

	@Override
	public void updateUser(T user) {
		 
		userDao.update(user);
		
	}

	@Override
	public T findOneUser(String id) {
	    return  (T) userDao.findOne(id);
	}

	@Override
	public T findUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAllUser() {
		return (List<T>) userDao.findAll();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T login(String userName, String password) {
		List<AUser> list = (List<AUser>) findAllUser();
		for (AUser u : list) {
			if (u.getCredentialA().getUserName().equals(userName) && u.getCredentialA().getPassword().equals(password))
				return (T) u;
		}
		return null;
	}

}
