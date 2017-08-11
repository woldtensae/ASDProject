package edu.mum.framework.generator.id;

public class Category {
	private int id;
	AutoGenerate autoGenerate;
	public Category(){
		autoGenerate = IDGenerator.getInstance();
		id = autoGenerate.getUniqueId(Category.class.getSimpleName());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
