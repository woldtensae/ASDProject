package edu.mum.dao;

import java.util.List;

public interface Dao<T> {
	public void add(T t);
	public void remove(T t);
	public List<T> findAll();
	//public T update(T t);
	public void write();
}
