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
@Table(name = "STUDENT_DETAILS")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int studentId;

  private String name;
  private String sex;
  private String dateOfBirth;

  @Column(unique = true)
  private final String contactNumber;

  private final String department;

  @Column(unique = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private final int borrowerId;
}
