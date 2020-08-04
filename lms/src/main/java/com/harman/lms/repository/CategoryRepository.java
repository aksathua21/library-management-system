package com.harman.lms.repository;

import com.harman.lms.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
  @Query("SELECT categoryId FROM Category u WHERE u.categotyName=:categotyName")
  int findCategoryIdByName(@Param("categotyName") String categotyName);
}
