package edu.mum.dao.impl;

import edu.mum.dao.UserDao;
import edu.mum.framework.domain.User;

public class UserDaoImpl extends DaoImpl<User> implements UserDao{

	public UserDaoImpl() {
		super(User.class, User.class.getSimpleName());
	}

	@Override
	public void remove(String id) {
		for(User u : this.findAll()){
			if(u.getId().equals(id))
				this.findAll().remove(u);
		}
		
	}

	@Override
	public User update(User user) {
		for(User u : this.findAll()){
			if(u.getId().equals(user.getId())){
				this.findAll().remove(u);
				this.add(user);
			}
		}
		
		return user;
	}

	@Override
	public User findOne(String id) {
		for(User u : this.findAll()){
			if(u.getId().equals(id))
				return u;
		}
		return new User() {
			private static final long serialVersionUID = 1L;
		};
	}

	@Override
	public User findByUserName(String name) {
		for(User u : this.findAll()){
			if(u.getFirstName().equals(name))
				return u;
		}
		return new User() {
			private static final long serialVersionUID = 1L;
		};
	}

}
