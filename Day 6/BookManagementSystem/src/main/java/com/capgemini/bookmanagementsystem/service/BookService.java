package com.capgemini.bookmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.bookmanagementsystem.entity.Book;
import com.capgemini.bookmanagementsystem.exception.BookNotFoundException;
import com.capgemini.bookmanagementsystem.repository.BookRepository;

@Service
public class BookService implements IBookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> showAllBooks() {
		// TODO Auto-generated method stub
		return this.bookRepository.findAll();
	}

	@Override
	public Book showBookById(int id) {
		// TODO Auto-generated method stub
		return this.bookRepository.findById(id)
				.orElseThrow(()->new BookNotFoundException("Book not found with id "+id));
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return this.bookRepository.save(book);
	}

	@Override
	public ResponseEntity<Book> deleteBook(int bookId) {
		// TODO Auto-generated method stub
		Book existingBook = this.bookRepository.findById(bookId)
				.orElseThrow(()->new BookNotFoundException("Book not found with id "+bookId));
		this.bookRepository.delete(existingBook);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<Book> showBooksByCategory(String category) {
		// TODO Auto-generated method stub
		return this.bookRepository.showBooksByCategory(category);
	}

	@Override
	public Book showBookByName(String name) {
		// TODO Auto-generated method stub
		return this.bookRepository.showBookByName(name);
	}

	@Override
	public List<Book> showAllBooksByQty(int qty) {
		// TODO Auto-generated method stub
		return this.bookRepository.showAllBooksByQty(qty);
	}

	@Override
	public String showBookDescriptionById(int id) {
		// TODO Auto-generated method stub
		return this.bookRepository.showBookDescriptionById(id);
	}

	@Override
	public Book updateBook(Book book, int bookId) {
		// TODO Auto-generated method stub
		Book existingBook = this.bookRepository.findById(bookId)
				.orElseThrow(()->new BookNotFoundException("Book not found with id "+bookId));
		existingBook.setBookAvlQty(book.getBookAvlQty());
		existingBook.setBookName(book.getBookName());
		existingBook.setBookPrice(book.getBookPrice());
		existingBook.setBookDescription(book.getBookDescription());
		existingBook.setBookCategory(book.getBookCategory());
		return this.bookRepository.save(existingBook);
	}

	@Override
	public int showBookQtyByName(String name) {
		// TODO Auto-generated method stub
		return this.bookRepository.showBookQtyByName(name);
	}

	@Override
	public float showBookPriceByName(String name) {
		// TODO Auto-generated method stub
		return this.bookRepository.showBookPriceByName(name);
	}

	@Override
	public float showBookPriceById(int id) {
		// TODO Auto-generated method stub
		return this.bookRepository.showBookPriceById(id);
	}

}
