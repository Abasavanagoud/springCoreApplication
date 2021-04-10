package com.pviJavaConfig.approuch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.sun.tools.doclint.Env;

@Configuration
@PropertySource("classpath:com/pviJavaConfig/approuch/book.properties")
public class PVIJavaConfig {

	/*
	 * @Bean public Book bookJava(@Value("${book.isdno}") int
	 * isdno, @Value("${book.auther}") String auther,
	 * 
	 * @Value("${book.bookTitle}") String bookTitle, @Value("${book.bookAim}")
	 * String bookAim,
	 * 
	 * @Value("${book.publishedYear}") String publishedYear) { Book book = new
	 * Book(); book.setIsdno(isdno); book.setAuther(auther);
	 * book.setBookTitle(bookTitle); book.setBookAim(bookAim);
	 * book.setPublishedYear(publishedYear); return book; }
	 */
	@Autowired
	Environment env;

	@Bean("book1")
	public Book bookJava() {
		Book book=new Book();
		book.setIsdno(Integer.parseInt(env.getProperty("book.isdno")));
		book.setAuther(env.getProperty("book.auther"));
		book.setBookAim(env.getProperty("book.bookAim"));
		book.setBookTitle(env.getProperty("book.bookTitle"));
		book.setPublishedYear(env.getProperty("book.publishedYear"));
		return book;
	}

}
