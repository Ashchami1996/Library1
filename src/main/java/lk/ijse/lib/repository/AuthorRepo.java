package lk.ijse.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.lib.model.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
}
