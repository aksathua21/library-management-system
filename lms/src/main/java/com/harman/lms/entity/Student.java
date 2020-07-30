package com.harman.lms.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT_DETAILS")
public class Student {
  @Id private final int studentId;
  private String name;
  private String sex;
  private Date dateOfBirth;
  private final String contactNumber;
  private final String department;
  private final int borrowerId;
}
