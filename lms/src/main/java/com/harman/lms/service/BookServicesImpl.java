package com.harman.lms.service;

import com.harman.lms.entity.Book;
import com.harman.lms.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

  @Override
  public Book update(final long isbn, final Book book) {
    if (bookRepository.findById(isbn).get().getIsbn() == isbn) {
      return bookRepository.save(book);
    }
    return null;
  }

  @Override
  public void deleteById(final long isbn) {
    bookRepository.deleteById(isbn);
  }
}
