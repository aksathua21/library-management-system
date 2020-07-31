package com.harman.lms.service;

import com.harman.lms.entity.Student;
import com.harman.lms.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired private StudentRepository studentRepository;

  @Override
  public List<Student> getStudentList() {
    return studentRepository.findAll();
  }

  @Override
  public Student getStudentById(final int id) {
    return studentRepository.findById(id).get();
  }

  @Override
  public Student save(final Student student) {
    return studentRepository.save(student);
  }

  @Override
  public Student update(final int id, final Student student) {
    if (studentRepository.findById(id).get().getStudentId() == id) {
      return studentRepository.save(student);
    }
    return null;
  }

  @Override
  public void deleteById(final int id) {
    studentRepository.deleteById(id);
  }
}
