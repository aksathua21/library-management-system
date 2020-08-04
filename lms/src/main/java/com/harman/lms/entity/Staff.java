package com.harman.lms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Staff_Details")
public class Staff {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int staffId;

  private String name;
  private boolean isAdmin;
  private String designation;
}
