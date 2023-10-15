package ru.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.restfulapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
