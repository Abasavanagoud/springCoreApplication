package com.bf.beans;

public class LanguageTranslater {
	private LanguageDefination defination;

	

	public LanguageTranslater(LanguageDefination defination) {
		super();
		this.defination = defination;
	}
	public void setDefination(LanguageDefination defination) {
		this.defination = defination;
	}
	public String translate(String inText) {
		StringBuffer buffer = new StringBuffer();
		String[] words =null;
		words = inText.split(" ");
		for (String word : words) {
			String translatorWord = defination.getTranslatorWord(word);
			buffer.append(translatorWord).append(" ");
			return buffer.toString();
		}
		return null;
	}
}
