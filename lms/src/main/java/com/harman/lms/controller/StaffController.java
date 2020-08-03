package com.harman.lms.controller;

import com.harman.lms.entity.Staff;
import com.harman.lms.service.StaffServices;
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
public class StaffController {
  @Autowired private StaffServices staffServices;

  @GetMapping("/staff")
  public List<Staff> getAll() {
    return staffServices.getAllStaff();
  }

  @PostMapping("/staff")
  public final Staff register(@RequestBody final Staff staff) {
    return staffServices.save(staff);
  }

  @DeleteMapping("/staff/{id}")
  public void delete(@RequestParam final int id) {
    staffServices.deleteById(id);
  }

  @PutMapping("/staff/{id}")
  public Staff update(@RequestParam final int id, @RequestBody final Staff staff) {
    return staffServices.update(id, staff);
  }
}
