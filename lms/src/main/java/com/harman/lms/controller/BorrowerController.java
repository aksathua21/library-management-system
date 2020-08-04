package com.harman.lms.controller;

import com.harman.lms.entity.Borrower;
import com.harman.lms.service.BorrowerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RequestMapping("/api")
@RestController
public class BorrowerController {
  @Autowired private BorrowerServices borrowerServices;

  @Transactional
  @PostMapping("/borrower")
  public final Borrower issueBook(@RequestBody final Borrower borrower) {
    return borrowerServices.issueBook(borrower);
  }

  @GetMapping("/test")
  public void test() {
    borrowerServices.issueBook(null);
  }
}
