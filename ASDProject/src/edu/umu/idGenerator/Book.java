package edu.umu.idGenerator;



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
