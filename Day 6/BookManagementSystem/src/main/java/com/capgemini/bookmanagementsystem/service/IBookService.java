package com.capgemini.bookmanagementsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.capgemini.bookmanagementsystem.entity.Book;

public interface IBookService {
	
	public List<Book> showAllBooks();
	public Book showBookById(int id);
	public Book addBook(Book book);
	public ResponseEntity<Book> deleteBook(int bookId);
	public List<Book> showBooksByCategory(String category);
	public Book showBookByName(String name);
	public List<Book> showAllBooksByQty(int qty);
	public String showBookDescriptionById(int id);
	public Book updateBook(Book book,int bookId);
	public int showBookQtyByName(String name);
	public float showBookPriceByName(String name);
	public float showBookPriceById(int id);
	

}
