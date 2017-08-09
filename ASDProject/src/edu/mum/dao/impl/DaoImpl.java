package edu.mum.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import edu.mum.dao.Dao;
import edu.mum.dao.impl.proxy.ReadWrite;
import edu.mum.dao.impl.proxy.ReadWriteProxy;

public abstract class DaoImpl<T> extends TimerTask implements Dao<T>{
    
	protected Class<T> daoType;
	private volatile List<T>  list = new ArrayList<>();
	private String className;
	private ReadWrite<T> readWrite = new ReadWriteProxy<>(this.daoType);
	
	public DaoImpl(Class<T> daoType, String className) {
		this.daoType = daoType;
		this.className = className;
		Timer timer = new Timer();
		timer.schedule(this, 0, 50000);
	}

	public void write(){
		readWrite.write(className);
	}
	
	public void setDaoType(Class<T> daoType) {
		this.daoType = daoType;
	}
	
	@Override
	public void add(T t) {
		list.add(t);		
	}

	@Override
	public void remove(T t) {
		list.remove(t);		
	}

	@Override
	public List<T> findAll() {
		if(null != list){
			return list;
		}
		this.readWrite = new ReadWriteProxy<>(daoType);
		this.list = readWrite.read(className);
		return list;
	}
	
	@Override
	public void run() {
		this.write();		
	}
}
