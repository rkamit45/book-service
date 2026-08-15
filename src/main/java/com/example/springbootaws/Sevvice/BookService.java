package com.example.springbootaws.Sevvice;

import com.example.springbootaws.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class BookService {
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks(){
        return books.stream().sorted(Comparator.comparingDouble(Book::getPrice)).toList();
    }

    public Book addBook(Book book){
        books.add(book);
        return book;
    }

}
