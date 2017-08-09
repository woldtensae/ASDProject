package edu.mum.framework.dao;

import java.util.List;

public interface Dao<T> {
	public void add(T t);
	public void remove(T t);
	public void remove(String id);
	public void update(T t);
	public T findOne(String id);
	public List<T> findAll();
}
