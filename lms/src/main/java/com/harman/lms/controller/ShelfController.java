package com.harman.lms.controller;

import com.harman.lms.entity.Shelf;
import com.harman.lms.service.ShelfServices;
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
public class ShelfController {
  @Autowired private ShelfServices shelfServices;

  @GetMapping("/shelf")
  public List<Shelf> getAll() {
    return shelfServices.getAllRecords();
  }

  @PostMapping("/shelf")
  public final Shelf register(@RequestBody final Shelf shelf) {
    return shelfServices.save(shelf);
  }

  @DeleteMapping("/shelf/{id}")
  public void delete(@RequestParam final int id) {
    shelfServices.deleteById(id);
  }

  @PutMapping("/shelf/{id}")
  public Shelf update(@RequestParam final int id, @RequestBody final Shelf shelf) {
    return shelfServices.update(id, shelf);
  }
}
