package com.harman.lms.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "STUDENT_DETAILS")
public class Student {
  @Id
  private final int studentId;
  private String name;
  private String sex;
  private Date dateOfBirth;
  private final String contactNumber;
  private final String department;
  private final int borrowerId;

}
