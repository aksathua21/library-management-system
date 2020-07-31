package com.harman.lms.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Borrower_Details")
public class Borrower {
  @Id private int borrowerId;
  private long isbn;
  private Date borrowedFromDate;
  private Date borrowedToDate;
  private Date actualReturnDate;
  private String issuedBy;
}
