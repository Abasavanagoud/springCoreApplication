package com.pviJavaConfig.approuch;
/*assumption here no source code 
 * */
public class Book {
	private int isdno;
	private String auther;
	private String bookTitle;
	private String bookAim;
	private String publishedYear;
	public void setIsdno(int isdno) {
		this.isdno = isdno;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setBookAim(String bookAim) {
		this.bookAim = bookAim;
	}
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	@Override
	public String toString() {
		return "Book [isdno=" + isdno + ", auther=" + auther + ", bookTitle=" + bookTitle + ", bookAim=" + bookAim
				+ ", publishedYear=" + publishedYear + "]";
	}	
	
}
