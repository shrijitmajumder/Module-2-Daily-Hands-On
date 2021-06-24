package com.capgemini.bookmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@Column(name = "bookId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "book_Sequence")
    @SequenceGenerator(name = "book_Sequence", sequenceName = "book_SEQ", initialValue = 201)
	private Integer bookId;
	
	@Column(name = "bookName")
	private String bookName;
	
	@Column(name = "bookPrice")
	private float bookPrice;
	
	@Column(name = "bookCategory")
	private String bookCategory;
	
	@Column(name = "bookAvlQty")
	private int bookAvlQty;
	
	@Column(name = "bookDescription")
	private String bookDescription;

	public Book() {
		super();
	}

	public Book(Integer bookId, String bookName, float bookPrice, String bookCategory, int bookAvlQty,
			String bookDescription) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookCategory = bookCategory;
		this.bookAvlQty = bookAvlQty;
		this.bookDescription = bookDescription;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public int getBookAvlQty() {
		return bookAvlQty;
	}

	public void setBookAvlQty(int bookAvlQty) {
		this.bookAvlQty = bookAvlQty;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
}
