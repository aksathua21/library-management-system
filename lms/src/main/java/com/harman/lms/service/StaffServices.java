package com.harman.lms.service;

import com.harman.lms.entity.Staff;
import java.util.List;

public interface StaffServices {
  List<Staff> getAllStaff();

  Staff save(Staff staff);

  Staff update(int id, Staff staff);

  void deleteById(int id);
}
