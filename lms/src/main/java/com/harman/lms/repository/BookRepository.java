package com.harman.lms.repository;

import com.harman.lms.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long> {

  @Query("SELECT u.noOfCopiesCurrent FROM Book u WHERE u.isbn=:isbn")
  int stockByIsbn(@Param("isbn") long isbn);

  /* @Query("SELECT u FROM Book u WHERE u.bookTitle LIKE %:title%")
  List<Book> findAllAvailableBooksBasedOnNameMatch(@Param("title") String title);*/

  /*@Query("SELECT u FROM Book u WHERE u.categotyType =:id")
  List<Book> findAllAvailableBooksBasedOnCategory(@Param("id") int id);*/
}
