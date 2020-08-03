package com.harman.lms.service;

import com.harman.lms.entity.Shelf;
import com.harman.lms.repository.ShelfRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShelfServicesImpl implements ShelfServices {

  @Autowired private ShelfRepository shelfRepository;

  @Override
  public List<Shelf> getAllRecords() {
    return shelfRepository.findAll();
  }

  @Override
  public Shelf save(final Shelf shelf) {
    return shelfRepository.save(shelf);
  }

  @Override
  public Shelf update(final int id, final Shelf shelf) {
    if (shelfRepository.findById(id).get().getShelfId() == id) {
      return shelfRepository.save(shelf);
    }
    return null;
  }

  @Override
  public void deleteById(final int id) {
    shelfRepository.deleteById(id);
  }
}
