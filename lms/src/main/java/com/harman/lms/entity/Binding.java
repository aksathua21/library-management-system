package com.harman.lms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Binding_Details")
public class Binding {
  @Id private int bindingId;
  private String bindingName;
}
