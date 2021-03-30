package com.bf.beans;

public class WordGame {
	private LanguageTranslater languageTranslater;
	public String scrambleMessage(String inMessage ) {
		String scramble=null;
		
		scramble=languageTranslater.translate(inMessage);
		return scramble;
		
	}
	public LanguageTranslater getLanguageTranslater() {
		return languageTranslater;
	}
	public void setLanguageTranslater(LanguageTranslater languageTranslater) {
		this.languageTranslater = languageTranslater;
	}
	
}
