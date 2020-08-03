package com.harman.lms.controller;

import com.harman.lms.entity.Binding;
import com.harman.lms.service.BindingServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class BindingController {

  @Autowired private BindingServices bindingServices;

  @GetMapping("/binding")
  public List<Binding> getAllbindingDetails() {
    return bindingServices.getAllBinding();
  }

  @PostMapping("/binding")
  public final Binding register(@RequestBody final Binding binding) {
    return bindingServices.save(binding);
  }

  @DeleteMapping("/binding/{id}")
  public void delete(@RequestParam final int id) {
    bindingServices.deleteById(id);
  }

  @PutMapping("/binding/{id}")
  public Binding update(@RequestParam final int id, @RequestBody final Binding binding) {
    return bindingServices.update(id, binding);
  }
}
