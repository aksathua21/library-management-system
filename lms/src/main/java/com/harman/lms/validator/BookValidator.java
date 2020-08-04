package com.harman.lms.validator;

import com.harman.lms.entity.Book;
import com.harman.lms.entity.Borrower;
import com.harman.lms.repository.BookRepository;
import com.harman.lms.repository.BorrowerRepository;
import com.harman.lms.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class BookValidator {

  @Autowired private BookRepository bookRepository;
  @Autowired private Utility utility;
  @Autowired private BorrowerRepository borrowerRepository;

  @Transactional
  public Borrower createValidation(final Borrower borrower) {
    Book book = bookRepository.findById(borrower.getIsbn()).get();
    if (borrower != null && book.getNoOfCopiesCurrent() != 0) {
      borrower.setBorrowedFromDate(utility.calculateCurrentDate());
      borrower.setBorrowedToDate(utility.calculateToDate());
      book.setNoOfCopiesCurrent(book.getNoOfCopiesCurrent() - 1);
      bookRepository.save(book);
      return borrowerRepository.save(borrower);
    }
    return null;
  }

  @Transactional
  public Borrower returnValidation(Borrower borrower) {
    Book book = bookRepository.findById(borrower.getIsbn()).get();
    if (borrower.getActualReturnDate() == null
        && book.getNoOfCopiesCurrent() != book.getNoOfCopiesActual()) {
      book.setNoOfCopiesCurrent(book.getNoOfCopiesCurrent() + 1);
      bookRepository.save(book);
      borrower.setActualReturnDate(utility.calculateCurrentDate());
      return borrowerRepository.save(borrower);
    }
    return null;
  }
}
