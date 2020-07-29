package com.harman.lms.service;

import com.harman.lms.entity.Book;
import com.harman.lms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServicesImpl implements BookServices {
  @Autowired private BookRepository bookRepository;

  @Override
  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  @Override
  public Book save(final Book book) {
    return bookRepository.save(book);
  }
}
