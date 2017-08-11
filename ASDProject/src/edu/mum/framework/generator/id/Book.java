package edu.mum.framework.generator.id;



public class Book {
	private int id;
	AutoGenerate autoGenerate;
	public Book(){
		autoGenerate = IDGenerator.getInstance();
		id = autoGenerate.getUniqueId(Book.class.getSimpleName());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
