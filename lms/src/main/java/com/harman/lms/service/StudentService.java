package com.harman.lms.service;

import com.harman.lms.entity.Student;
import java.util.List;

public interface StudentService {
  List<Student> getStudentList();

  Student getStudentById(int id);

  Student save(Student student);

  Student update(int id, Student student);

  void deleteById(int id);
}
