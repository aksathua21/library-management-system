package com.harman.lms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT_DETAILS")
public class Student {
  @Id private int studentId;
  private String name;
  private String sex;
  private String dateOfBirth;
  private final String contactNumber;
  private final String department;
  private final int borrowerId;
}
