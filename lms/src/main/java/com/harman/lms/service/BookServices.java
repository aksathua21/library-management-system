package com.harman.lms.service;

import com.harman.lms.entity.Book;

import java.util.List;

public interface BookServices {
  List<Book> getAllBooks();

  Book save(Book book);

  Book update(long isbn, Book book);

  void deleteById(long isbn);

  List<Book> findAllAvailableBooksBasedOnNameMatch(String title);

  int findAllAvailableBooksBasedOnIsbn(long isbn);
}
