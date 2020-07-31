package com.harman.lms.service;

import com.harman.lms.entity.Binding;
import java.util.List;

public interface BindingServices {
  List<Binding> getAllBinding();

  Binding save(Binding binding);

  Binding update(int id, Binding binding);

  void deleteById(int id);
}
