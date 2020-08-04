package com.harman.lms.controller;

import com.harman.lms.entity.Student;
import com.harman.lms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentController {
  @Autowired private StudentService studentService;

  @GetMapping("/student")
  public List<Student> getAllStudent() {
    return studentService.getStudentList();
  }

  @GetMapping("/student/{id}")
  public Student getStudentById(@PathVariable final int id) {
    return studentService.getStudentById(id);
  }

  @PostMapping("/student")
  public final Student register(@RequestBody final Student student) {
    return studentService.save(student);
  }

  @DeleteMapping("/student/{id}")
  public void delete(@RequestParam final int id) {
    studentService.deleteById(id);
  }

  @PutMapping("/student/{id}")
  public Student update(@RequestParam final int id, @RequestBody final Student student) {
    return studentService.update(id, student);
  }
}
