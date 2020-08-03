package com.harman.lms.service;

import com.harman.lms.entity.Staff;
import com.harman.lms.repository.StaffRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServicesImpl implements StaffServices {

  @Autowired private StaffRepository staffRepository;

  @Override
  public List<Staff> getAllStaff() {
    return staffRepository.findAll();
  }

  @Override
  public Staff save(final Staff staff) {
    return staffRepository.save(staff);
  }

  @Override
  public Staff update(final int id, final Staff staff) {
    if (staffRepository.findById(id).get().getStaffId() == id) {
      return staffRepository.save(staff);
    }
    return null;
  }

  @Override
  public void deleteById(final int id) {
    staffRepository.deleteById(id);
  }
}
