package com.mto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mto.dto.Book;
import com.mto.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService service;
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book)
	{
		return service.saveBook(book);
	}
	@PostMapping("/save1")
	public Book saveBook1(@RequestBody Book book)
	{
		return service.saveBook1(book);
	}
	
	@GetMapping("/read")
	public List<Book> readBooks()
	{
		return service.readBooks();
	}
	
	@PatchMapping("/update")
	public Book updateBook(@RequestParam int id, @RequestBody Book book)
	{
		return service.updateBook(id, book);
	}
}
