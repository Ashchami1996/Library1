package lk.ijse.lib.service;

import lk.ijse.lib.dto.StudentDTO;
import lk.ijse.lib.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDTO studentDTO);

    List<StudentDTO> getAllStudents();

    void updateStudent(StudentDTO studentDTO);

    Student searchStudent(Integer id);

    void deleteStudent(Integer id);
}
