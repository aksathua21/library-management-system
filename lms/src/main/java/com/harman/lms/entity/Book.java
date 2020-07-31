package com.harman.lms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Book_details")
public class Book {
  @Id private long isbn;
  private String bookTitle;
  private String language;
  private int bindingId;
  private int categotyId;
  private int noOfCopiesActual;
  private int noOfCopiesCurrent;
}
