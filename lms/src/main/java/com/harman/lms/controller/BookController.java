package com.harman.lms.controller;

import com.harman.lms.entity.Book;
import com.harman.lms.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class BookController {

  @Autowired private BookServices bookServices;

  @GetMapping("/book")
  public List<Book> getAllBook() {
    return bookServices.getAllBooks();
  }

  @GetMapping("/book/{isbn}")
  public int getNumberOfAvailableBook(@PathVariable final long isbn) {
    return bookServices.findAllAvailableBooksBasedOnIsbn(isbn);
  }

  @PostMapping("/book")
  public final Book register(@RequestBody final Book book) {
    return bookServices.save(book);
  }

  @DeleteMapping("/book/{isbn}")
  public void delete(@RequestParam final Long id) {
    bookServices.deleteById(id);
  }

  @PutMapping("/book/{isbn}")
  public Book update(@RequestParam final Long isbn, @RequestBody final Book book) {
    return bookServices.update(isbn, book);
  }

  @GetMapping("/book/availableabookbyname/{title}")
  public List<Book> findAllAvailableBooksBasedOnNameMatch(@PathVariable final String title) {
    return bookServices.findAllAvailableBooksBasedOnNameMatch(title);
  }
}
