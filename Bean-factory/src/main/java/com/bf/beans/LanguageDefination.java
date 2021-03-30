package com.bf.beans;

import java.util.Properties;

public class LanguageDefination {
 private Properties definations;
 	public String getTranslatorWord(String inWord) {
		return definations.getProperty(inWord);
	}
	public LanguageDefination(Properties definations) {
		super();
		this.definations = definations;
	}

 
}
