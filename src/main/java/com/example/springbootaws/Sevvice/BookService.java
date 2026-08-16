package com.example.springbootaws.Sevvice;

import com.example.springbootaws.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class BookService {
    List<Book> books = List.of(
            new Book(101,"core java","Jems",250),
            new Book(102,"Servlet","Jean",200.0),
            new Book(101,"spring","rohit",400),
            new Book(101,"springboot","Ramesh",230),
            new Book(101,"AWS","Surya",500)

    );

    public List<Book> getBooks(){
        return books.stream().sorted(Comparator.comparingDouble(Book::getPrice)).toList();
    }

    public Book addBook(Book book){
        books.add(book);
        return book;
    }

}
