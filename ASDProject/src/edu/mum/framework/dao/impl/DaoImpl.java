package edu.mum.framework.dao.impl;

import java.util.List;

import edu.mum.framework.dao.Dao;

public class DaoImpl<T> implements Dao<T>{
    
	protected Class<T> daoType;
	
	List<T>  list = read();
	
	
	private static <T> List<T> read(){
		
		
		return null;
	}
	
	public void setDaoType(Class<T> daoType) {
		this.daoType = daoType;
	}
	
	
  
	
	@Override
	public void add(T t) {
	
		
	}

	@Override
	public void remove(T t) {
		
		
	}

	@Override
	public void remove(String id) {
		
		
	}

	

	@Override
	public T findOne(String id) {
		
		return null;
	}

	@Override
	public List<T> findAll() {
		
		return null;
	}
	public String className(T t)
	{
		return null ;
		
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

}
