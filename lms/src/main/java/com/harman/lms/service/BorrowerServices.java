package com.harman.lms.service;

import com.harman.lms.entity.Borrower;

public interface BorrowerServices {
  Borrower issueBook(Borrower borrower);

  Borrower returnBook(Borrower borrower);
}
