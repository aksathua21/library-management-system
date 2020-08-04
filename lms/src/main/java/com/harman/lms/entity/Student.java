package com.harman.lms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
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
  private String contactNumber;

  private String department;

  @Column(unique = true)
  private int borrowerId;
}
