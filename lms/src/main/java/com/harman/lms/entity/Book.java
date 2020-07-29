package com.harman.lms.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Book_details")
public class Book {
  @Id
  private final long isbn;
  private String bookTitle;
  private String language;
  private int bindingId;
  private int noOfCopiesActual;
  private int noOfCopiesCurrent;

}
