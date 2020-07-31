package com.harman.lms.controller;

import com.harman.lms.entity.Student;
import com.harman.lms.service.StudentService;
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
public class StudentController {
  @Autowired private StudentService studentService;

  @GetMapping("/student")
  public List<Student> getAllStudent() {
    return studentService.getStudentList();
  }

  @GetMapping("/student/{id}")
  public Student getStudentById(@RequestParam final Integer id) {
    return studentService.getStudentById(id);
  }

  @PostMapping("/student")
  public final Student register(@RequestBody final Student student) {
    return studentService.save(student);
  }

  @DeleteMapping("/student/{id}")
  public void delete(@RequestParam final Integer id) {
    studentService.deleteById(id);
  }

  @PutMapping("/student/{id}")
  public Student update(@RequestParam final Integer id, @RequestBody final Student student) {
    return studentService.update(id, student);
  }
}
