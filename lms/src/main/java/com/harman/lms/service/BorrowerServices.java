package com.harman.lms.service;

import com.harman.lms.entity.Borrower;
import java.util.List;

public interface BorrowerServices {
  List<Borrower> getAllBorrowers();

  Borrower save(Borrower borrower);

  Borrower update(int id, Borrower borrower);

  void deleteById(int id);
}
