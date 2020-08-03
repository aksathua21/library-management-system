package com.harman.lms.service;

import com.harman.lms.entity.Binding;
import com.harman.lms.repository.BindingRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BindingServicesImpl implements BindingServices {

  @Autowired private BindingRepository bindingRepository;

  @Override
  public List<Binding> getAllBinding() {
    return bindingRepository.findAll();
  }

  @Override
  public Binding save(final Binding binding) {
    return bindingRepository.save(binding);
  }

  @Override
  public Binding update(final int id, final Binding binding) {
    if (bindingRepository.findById(id).get().getBindingId() == id) {
      return bindingRepository.save(binding);
    }
    return null;
  }

  @Override
  public void deleteById(final int id) {
    bindingRepository.deleteById(id);
  }
}
