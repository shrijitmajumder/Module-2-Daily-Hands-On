package com.capgemini.bookmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookmanagementsystem.entity.Book;
import com.capgemini.bookmanagementsystem.service.IBookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	@GetMapping("/showallbooks")
	public List<Book> showAllBooks() {
		// TODO Auto-generated method stub
		return this.bookService.showAllBooks();
	}

	@GetMapping("/showbookbyid/{id}")
	public Book showBookById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return this.bookService.showBookById(id);
	}

	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		// TODO Auto-generated method stub
		return this.bookService.addBook(book);
	}

	@DeleteMapping("/deletebookbyid/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable("id") int bookId) {
		// TODO Auto-generated method stub
		return this.bookService.deleteBook(bookId);
	}

	@GetMapping("/showbookbycategory/{category}")
	public List<Book> showBooksByCategory(@PathVariable("category") String category) {
		// TODO Auto-generated method stub
		return this.bookService.showBooksByCategory(category);
	}

	@GetMapping("/showbookbyname/{name}")
	public Book showBookByName(@PathVariable("name") String name) {
		// TODO Auto-generated method stub
		return this.bookService.showBookByName(name);
	}

	@GetMapping("/showallbooksbyqty/{qty}")
	public List<Book> showAllBooksByQty(@PathVariable("qty") int qty) {
		// TODO Auto-generated method stub
		return this.bookService.showAllBooksByQty(qty);
	}

	@GetMapping("/showbookdescriptionbyid/{id}")
	public String showBookDescriptionById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return this.bookService.showBookDescriptionById(id);
	}

	@PutMapping("/updatebookbyid/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable("id") int bookId) {
		// TODO Auto-generated method stub
		
		return this.bookService.updateBook(book,bookId);
	}

	@GetMapping("/showbookqtybyname/{name}")
	public int showBookQtyByName(@PathVariable("name") String name) {
		// TODO Auto-generated method stub
		return this.bookService.showBookQtyByName(name);
	}

	@GetMapping("/showbookpricebyname/{name}")
	public float showBookPriceByName(@PathVariable("name") String name) {
		// TODO Auto-generated method stub
		return this.bookService.showBookPriceByName(name);
	}

	@GetMapping("/showbookpricebyid/{id}")
	public float showBookPriceById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return this.bookService.showBookPriceById(id);
	}

}
