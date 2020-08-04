package com.harman.lms.service;

import com.harman.lms.entity.Borrower;
import com.harman.lms.repository.BorrowerRepository;
import com.harman.lms.validator.BookValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerServicesImpl implements BorrowerServices {

  @Autowired private BorrowerRepository borrowerRepository;
  @Autowired private BookValidator bookValidator;

  @Override
  public Borrower issueBook(final Borrower borrower) {
    System.out.println("BorrowerServicesImpl-issueBook");
    System.out.println(borrower);
    if (borrower != null) {
      return bookValidator.createValidation(borrower);
    }
    return null;
  }

  @Override
  public Borrower returnBook(final int borrowerId, final long isbn) {
    Borrower borrower = borrowerRepository.findBorrowerDetails(borrowerId, isbn);
    ;
    if (borrower != null) {
      System.out.println("if (borrower != null)");
      return bookValidator.returnValidation(borrower);
    }
    return null;
  }
}
