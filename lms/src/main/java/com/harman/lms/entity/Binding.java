package com.harman.lms.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Binding_Details")
public class Binding {
  @Id
  private final int bindingId;
  private String bindingName;
}
