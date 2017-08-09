package edu.umu.idGenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConnection {
	private static FileConnection fileConnection= new FileConnection();
	
	private FileConnection(){}
	
	public static FileConnection getInstance(){
		return fileConnection;
	}
	
	private void writeUniqueId(String nextId){
		BufferedWriter br = null;
		try{
			File file = new File("fileId.txt");
			br = new BufferedWriter(new FileWriter(file));	
		        br.write(nextId);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
		    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int  readUniqueId(){
		BufferedReader br = null;
		String line = null, everything = "";
		int num =0, num1=0;
		try{
			File file = new File("fileId.txt");
			if(file.createNewFile())
				writeUniqueId(String.valueOf(100));
			br = new BufferedReader(new FileReader(file));	
			StringBuilder sb = new StringBuilder();
		    line = br.readLine();
	
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		    try{
		    	num = Integer.parseInt(everything.trim());
		    	num1 = num+1;
		    	writeUniqueId(String.valueOf(num1));
		    }catch(NumberFormatException e){ e.printStackTrace();}	
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
		    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return num;
	}	
}
