package edu.mum.framework.service;


import java.util.List;

import edu.mum.framework.domain.User;
public interface UserService {
	public void saveUser(User user);
	public void deletUser(User user);
	public void updateUserById(String id);
	public void updateUser(User user);
	public User findOneUser(String id);
	public User findUserByName(String name);
	public List<User> findAllUser();
}
