package com.harman.lms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Category_Details")
public class Category {
  @Id private final int categotyId;
  private String categotyName;
}
