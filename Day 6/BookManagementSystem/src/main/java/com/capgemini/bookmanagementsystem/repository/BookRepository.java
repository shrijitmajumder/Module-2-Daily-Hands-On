package com.capgemini.bookmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.bookmanagementsystem.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	@Query("select b from Book b where b.bookCategory like %?1")
	public List<Book> showBooksByCategory(String category);
	
	@Query("select b from Book b where b.bookName like %?1")
	public Book showBookByName(String name);
	
	@Query("select b from Book b where b.bookAvlQty = ?1")
	public List<Book> showAllBooksByQty(int qty);
	
	@Query("select b.bookDescription from Book b where b.bookId = ?1")
	public String showBookDescriptionById(int id);
	
	@Query("select b.bookAvlQty from Book b where b.bookName like %?1")
	public int showBookQtyByName(String name);
	
	@Query("select b.bookPrice from Book b where b.bookName like %?1")
	public float showBookPriceByName(String name);
	
	@Query("select b.bookPrice from Book b where b.bookId = ?1")
	public float showBookPriceById(int id);
}
