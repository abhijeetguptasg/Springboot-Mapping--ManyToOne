package com.mto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mto.dto.Book;
import com.mto.dto.Library;
import com.mto.repository.BookRepo;
import com.mto.repository.LibraryRepo;

@Service
public class BookService {

	@Autowired
	BookRepo repo;
	
	@Autowired
	LibraryRepo lrepo;
	
	public Book saveBook(Book b)
	{
		repo.save(b);
		return b;
	}
	
	public Book saveBook1(Book b)
	{
		int id= b.getLibrary().getId();
		Optional<Library> lib= lrepo.findById(id);
		if(lib.isPresent())
		{
			b.setLibrary(lib.get());
			repo.save(b);
			return b;
		}
		return null;
	}
	
	public List<Book> readBooks()
	{
		List<Book> books= repo.findAll();
		return books;
	}
	
	public Book updateBook(int id, Book b)
	{
		Optional<Book> book= repo.findById(id);
		
		if(book.isPresent())
		{
			b.setId(id);
			b.setLibrary(book.get().getLibrary());
			repo.save(b);
			return b;
		}
		return null;
	}
	
}
