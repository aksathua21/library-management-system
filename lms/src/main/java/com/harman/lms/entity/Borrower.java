package com.harman.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Borrower_Details")
public class Borrower {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int borrowerId;
  private long isbn;
  private String borrowedFromDate;
  private String borrowedToDate;
  private String actualReturnDate;

  @Column(nullable = false)
  private String issuedBy;
}
