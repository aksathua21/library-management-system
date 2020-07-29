package com.harman.lms.controller;

import com.harman.lms.entity.Book;
import com.harman.lms.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

  @PostMapping("/book")
  public final Book register(@RequestBody final Book book) {
    return bookServices.save(book);
  }
}
