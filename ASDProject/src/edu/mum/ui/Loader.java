package edu.mum.ui;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Loader implements LoadMediator {
	
	private static Loader instance = new Loader();
	private String appname = "";
	private boolean windowresizable = false;
	private String loginBGImage = "";
	private String loginBGHeaderImage = "";
	
	
	private Loader(){
		loadConfig();
	}
	
	public static Loader getInstance() {
		return instance;
	}
	
	public void loadInit() throws ParserConfigurationException, SAXException, IOException {
		File file = new File("bin/edu/mum/framework/ui/UIConfig.xml");
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
		        .newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse(file);
		
		this.appname = document.getElementsByTagName("appname").item(0).getTextContent();
		this.windowresizable = document.getElementsByTagName("windowresizable").item(0).getTextContent().equals("true") ? true : false;
		this.loginBGImage = document.getElementsByTagName("loginbackground").item(0).getTextContent().isEmpty() ?
				"bin/edu/mum/framework/ui/images/librarybg.jpg" : document.getElementsByTagName("loginbackground").item(0).getTextContent();
		
		this.loginBGHeaderImage = document.getElementsByTagName("headerbackground").item(0).getTextContent().isEmpty() ?
				"bin/edu/mum/framework/ui/images/libraryTitle.jpg" : document.getElementsByTagName("headerbackground").item(0).getTextContent();

	}

	

	@Override
	public void loadConfig() {
		// TODO Auto-generated method stub
		try {
			loadInit();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getAppname() {
		return appname;
	}
	
	public String getLoginBGImage() {
		return loginBGImage;
	}

	public boolean getWindowResizable(){
		return windowresizable;
	}
	public String getLoginBGHeaderImage() {
		return loginBGHeaderImage;
	}
	
}
