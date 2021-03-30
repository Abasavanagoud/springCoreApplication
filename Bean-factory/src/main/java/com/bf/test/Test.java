package com.bf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bf.beans.WordGame;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/bf/common/application-context.xml");
		WordGame wordGame = applicationContext.getBean(WordGame.class);
		String scrambleMessage = wordGame.scrambleMessage("good");
		System.out.println(scrambleMessage);
	}
}
