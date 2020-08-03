package com.harman.lms.controller;

import com.harman.lms.entity.Category;
import com.harman.lms.service.CategoryServices;
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
public class CategoryController {
  @Autowired private CategoryServices categoryServices;

  @GetMapping("/category")
  public List<Category> getAll() {
    return categoryServices.getAllCategorys();
  }

  @PostMapping("/category")
  public final Category register(@RequestBody final Category category) {
    return categoryServices.save(category);
  }

  @DeleteMapping("/category/{id}")
  public void delete(@RequestParam final int id) {
    categoryServices.deleteById(id);
  }

  @PutMapping("/category/{id}")
  public Category update(@RequestParam final int id, @RequestBody final Category category) {
    return categoryServices.update(id, category);
  }
}
