package com.harman.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Binding_Details")
public class Binding {
  @Id private int bindingId;

  private String bindingName;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "shelfId")
  private Shelf shelf;
}
