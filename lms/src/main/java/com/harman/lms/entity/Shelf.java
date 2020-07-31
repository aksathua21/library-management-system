package com.harman.lms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Shelf_Details")
public class Shelf {
  @Id private int shelfId;
  private String floor;
}
