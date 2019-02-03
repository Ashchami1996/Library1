package lk.ijse.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.lib.model.Book;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {



   // public List<Book> findbybookName(String bookName);
}
