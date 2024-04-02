package com.nagarro.Assignment_5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Book {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@javax.persistence.Id
	private Integer Id;
	private String bookName;
	private String Author;
	private String DateAdded;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookNames) {
		bookName = bookNames;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getDateAdded() {
		return DateAdded;
	}

	public void setDateAdded(String dateAdded) {
		DateAdded = dateAdded;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", BookName=" + bookName + ", Author=" + Author + ", DateAdded=" + DateAdded + "]";
	}

}
