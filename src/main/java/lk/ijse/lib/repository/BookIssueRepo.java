package lk.ijse.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.lib.model.BookIssue;

public interface BookIssueRepo extends JpaRepository<BookIssue,Integer> {
}
