package com.harman.lms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Staff_Details")
public class Staff {
  @Id private int staffId;
  private String name;
  private boolean isAdmin;
  private String designation;
}
