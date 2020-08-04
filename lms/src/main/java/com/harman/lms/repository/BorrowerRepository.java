package com.harman.lms.repository;

import com.harman.lms.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {

  @Query("SELECT u FROM Borrower u WHERE u.borrowerId = :borrowerId AND u.isbn=:isbn")
  Borrower findBorrowerDetails(int borrowerId, long isbn);
}
