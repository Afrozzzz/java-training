package com.onlinebookshop.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookshop.shop.model.Book;
import com.onlinebookshop.shop.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    public int addBook(Book book) {
        return bookRepository.save(book);
    }

    public int updateBook(int id, Book updatedBook) {
        Book existingBook = bookRepository.findById(id);
        if (existingBook != null) {
            existingBook.settitle(updatedBook.gettitle());
            existingBook.setPrice(updatedBook.getPrice());
            existingBook.setAuthorId(updatedBook.getAuthorId());
            return bookRepository.update(existingBook);
        } else {
            return 0; // Return 0 if the book wasn't found
        }
    }

    public int deleteBook(int id) {
        return bookRepository.delete(id);
    }
}
