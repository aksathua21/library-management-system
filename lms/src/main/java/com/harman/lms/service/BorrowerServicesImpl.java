package com.harman.lms.service;

import com.harman.lms.entity.Borrower;
import com.harman.lms.repository.BorrowerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class BorrowerServicesImpl implements BorrowerServices {

  @Autowired private BorrowerRepository borrowerRepository;

  @Override
  public List<Borrower> getAllBorrowers() {
    return borrowerRepository.findAll();
  }

  @Override
  public Borrower save(final Borrower borrower) {
    return borrowerRepository.save(borrower);
  }

  @Override
  public Borrower update(final int id, final Borrower borrower) {
    if (borrowerRepository.findById(id).get().getBorrowerId() == id) {
      return borrowerRepository.save(borrower);
    }
    return null;
  }

  @Override
  public void deleteById(final int id) {
    borrowerRepository.deleteById(id);
  }
}
