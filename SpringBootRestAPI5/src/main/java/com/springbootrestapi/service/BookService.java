package com.springbootrestapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.springbootrestapi.entites.BookEntits;


@Component
public class BookService {
	 //here create ArrayList
	 private static  List<BookEntits> list=new ArrayList<>();
	 
	 //here create block
	static 
	 {
	     list.add(new BookEntits(12,"java developer","xyz"));
		 list.add(new BookEntits(13,"Paythen developer","xyb"));
		 list.add(new BookEntits(14,"Dot.net developer","xyc"));
	}
	 //here create method
	 //get all books 
	 //this method return all books 
	 //here is create Multiple books  
	 public  List<BookEntits> getAllBooks()
	 {
		 return list;
	 }
	 //here is create Single books
	 //get single book by id
	 public BookEntits getAllBookById(int id)
	 {
		 //here i am using StreemAPI
		 BookEntits books=null;
		books= list.stream().filter(e->e.getBook_id()==id ).findFirst().get();
			 
		 return books;
	 }
	 //create method /adding the BookEntits
	 public BookEntits addTestBook(BookEntits booksTest) {
		 
		 list.add(booksTest);
		 return booksTest;
	 }
	 // Delete Book handler 
    public  void deleteBook_b(int bId) {
   	list.stream().filter(book ->book.getBook_id()!=bId).collect(Collectors.toList());
    }

}
