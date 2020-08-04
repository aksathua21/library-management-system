package com.harman.lms.repository;

import com.harman.lms.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

  @Query("SELECT u.noOfCopiesCurrent FROM Book u WHERE u.isbn=:isbn")
  int stockByIsbn(@Param("isbn") long isbn);

  @Query("SELECT u FROM Book u WHERE u.noOfCopiesCurrent >0 AND u.bookTitle LIKE %:title%")
  List<Book> findAllAvailableBooksBasedOnNameMatch(@Param("title") String title);

  // List<Book> findByTitleIgnoreCaseContaining(String title);

  @Query(
      "SELECT u FROM Book u WHERE u.category.categotyName =:categotyName AND u.noOfCopiesCurrent >0")
  List<Book> findAllAvailableBooksBasedOnCategory(@Param("categotyName") String categotyName);
}
