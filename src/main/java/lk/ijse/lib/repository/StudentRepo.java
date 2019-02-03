package lk.ijse.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ijse.lib.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
