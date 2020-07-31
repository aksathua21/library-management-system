package com.harman.lms.service;

import com.harman.lms.entity.Category;
import java.util.List;

public interface CategoryServices {
  List<Category> getAllCategorys();

  Category save(Category category);

  Category update(int id, Category category);

  void deleteById(int id);
}
