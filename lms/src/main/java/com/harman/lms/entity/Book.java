package com.harman.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Book_details")
public class Book {
  @Id private long isbn;
  private String bookTitle;
  private String language;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "bindingId")
  private Binding binding;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "categoryId")
  private Category category;

  private int noOfCopiesActual;
  private int noOfCopiesCurrent;
}
