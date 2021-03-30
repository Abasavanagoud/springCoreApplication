package com.bf.beans;

import java.io.IOException;
import java.util.Properties;

public class LanguageTranslatorBuild {
	
	private LanguageDefination languageDefination;
	public void loadDefinataion(String sourcelang,String targetlang) throws IOException {
		String fileName=sourcelang +"-"+ targetlang+".lang";
		Properties definations=null;
		definations=new Properties();
		definations.load(this.getClass().getClassLoader().getResourceAsStream(fileName));
	  languageDefination = new LanguageDefination(definations);		
	}
	public LanguageTranslater build() {
		LanguageTranslater languageTranslater = new LanguageTranslater(languageDefination);
		return languageTranslater;		
	}
}
