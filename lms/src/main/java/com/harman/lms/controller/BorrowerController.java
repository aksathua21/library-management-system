package com.harman.lms.controller;

import com.harman.lms.entity.Borrower;
import com.harman.lms.exception.CustomNotFoundException;
import com.harman.lms.service.BorrowerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class BorrowerController {
  @Autowired private BorrowerServices borrowerServices;

  @PostMapping("/borrower")
  public final Borrower issueBook(@RequestBody final Borrower borrower) {
    System.out.println("issueBook--  BorrowerController");
    System.out.println(borrower);
    final Borrower obj = borrowerServices.issueBook(borrower);
    if (obj != null) {
      return obj;
    }
    throw new CustomNotFoundException("Selected Book is currently not available");
  }

  @PutMapping("/borrower/{borrowerId}/{isbn}")
  public Borrower returnBook(@PathVariable final int borrowerId, @PathVariable final long isbn) {
    final Borrower borrower = borrowerServices.returnBook(borrowerId, isbn);
    if (borrower != null) {
      System.out.println("Inside Controller");
      return borrower;
    }
    throw new CustomNotFoundException(
        "No Book Issued with BorrowerId :" + borrowerId + " and Book ISBN:" + isbn);
  }
}
