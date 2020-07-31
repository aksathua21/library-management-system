package com.harman.lms.service;

import com.harman.lms.entity.Shelf;
import java.util.List;

public interface ShelfServices {
  List<Shelf> getAllRecords();

  Shelf save(Shelf shelf);

  Shelf update(int id, Shelf shelf);

  void deleteById(int id);
}
