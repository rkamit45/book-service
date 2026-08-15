package com.example.springbootaws.Sevvice;

import com.example.springbootaws.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks(){
        return books;
    }

    public Book addBook(Book book){
        books.add(book);
        return book;
    }

}
