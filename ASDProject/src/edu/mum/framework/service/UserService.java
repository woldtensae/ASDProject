package edu.mum.framework.service;


import java.util.List;


public interface UserService<T> {
	public boolean saveUser(T user);
	public void deleteUser(T user);
	public void updateUserById(String id);
	public void updateUser(T user);
	public T findOneUser(String id);
	public T findUserByName(String name);
	public List<T> findAllUser();
	public T login(String userName, String password);
}
