package com.harman.lms.controller;

import com.harman.lms.entity.Borrower;
import com.harman.lms.service.BorrowerServices;
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
public class BorrowerController {
  @Autowired private BorrowerServices borrowerServices;

  @GetMapping("/borrower")
  public List<Borrower> getAll() {
    return borrowerServices.getAllBorrowers();
  }

  @PostMapping("/borrower")
  public final Borrower register(@RequestBody final Borrower borrower) {
    return borrowerServices.save(borrower);
  }

  @DeleteMapping("/borrower/{id}")
  public void delete(@RequestParam final int id) {
    borrowerServices.deleteById(id);
  }

  @PutMapping("/borrower/{id}")
  public Borrower update(@RequestParam final int id, @RequestBody final Borrower borrower) {
    return borrowerServices.update(id, borrower);
  }
}
