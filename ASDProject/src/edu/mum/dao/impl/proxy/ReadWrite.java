package edu.mum.dao.impl.proxy;

import java.util.List;

public abstract class ReadWrite<T> {
	public abstract List<T> read(String className);
	public abstract void write(String className);
}
