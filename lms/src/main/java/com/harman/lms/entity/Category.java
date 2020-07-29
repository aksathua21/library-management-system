package com.harman.lms.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Category_Details")
public class Category {
  @Id
  private final int categotyId;
  private String categotyName;

}
