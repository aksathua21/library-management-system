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
    return borrowerRepository.save(bookValidator.bookValidation(borrower));
  }

  @Override
  public Borrower returnBook(final Borrower borrower) {
    return null;
  }
}
