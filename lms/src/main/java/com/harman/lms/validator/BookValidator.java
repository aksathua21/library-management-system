package com.harman.lms.validator;

import com.harman.lms.entity.Book;
import com.harman.lms.entity.Borrower;
import com.harman.lms.repository.BookRepository;
import com.harman.lms.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class BookValidator {

  @Autowired private BookRepository bookRepository;
  @Autowired private Utility utility;

  @Transactional
  public Borrower bookValidation(final Borrower borrower) {
    final Book book = bookRepository.findById(borrower.getIsbn()).get();
    if (book.getNoOfCopiesCurrent() >= 1) {
      borrower.setBorrowedFromDate(utility.calculateCurrentDate());
      borrower.setBorrowedToDate(utility.calculateToDate());

      book.setNoOfCopiesCurrent(book.getNoOfCopiesCurrent() - 1);
      bookRepository.save(book);
      System.out.println(book.getNoOfCopiesCurrent());
      return borrower;
    }
    return null;
  }
}
