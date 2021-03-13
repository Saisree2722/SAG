package com.ust.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Book_Id")
	private int bookid;
	@Column(name="Book_Name")
	private String bookname;
	@Column(name="Author")
	private String author;
	@Column(name="Price")
	private int price;
	

	public Book()
	{}
	
	
	
	public int getBookid() {
		return bookid;
	}



	public void setBookid(int bookid) {
		this.bookid = bookid;
	}



	public String getBookname() {
		return bookname;
	}



	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
	}
	
	
	

}
