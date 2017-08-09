package edu.umu.idGenerator;

public class Main {
	public static void main(String[] args){
		FileConnection fc = FileConnection.getInstance();
		System.out.println(fc.readUniqueId());
		System.out.println(fc.readUniqueId());
		System.out.println(fc.readUniqueId());
		System.out.println(fc.readUniqueId());
	}
}
