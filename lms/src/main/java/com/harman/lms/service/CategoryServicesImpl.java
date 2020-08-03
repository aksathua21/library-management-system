package com.harman.lms.service;

import com.harman.lms.entity.Category;
import com.harman.lms.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServicesImpl implements CategoryServices {

  @Autowired private CategoryRepository categoryRepository;

  @Override
  public List<Category> getAllCategorys() {
    return categoryRepository.findAll();
  }

  @Override
  public Category save(final Category category) {
    return categoryRepository.save(category);
  }

  @Override
  public Category update(final int id, final Category category) {
    if (categoryRepository.findById(id).get().getCategoryId() == id) {
      return categoryRepository.save(category);
    }
    return null;
  }

  @Override
  public void deleteById(final int id) {
    categoryRepository.deleteById(id);
  }
}
