package lk.ijse.lib.service.impl;

import lk.ijse.lib.dto.StudentDTO;
import lk.ijse.lib.model.Student;
import lk.ijse.lib.repository.StudentRepo;
import lk.ijse.lib.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public void addStudent(StudentDTO studentDTO) {
        Student student=new Student(studentDTO.getSid(),studentDTO.getRegId(),studentDTO.getName(),
                studentDTO.getAddress(),studentDTO.getBday(),studentDTO.getGrade(),studentDTO.getPassword());
        System.out.println(student.getRegId());
        studentRepo.save(student);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> list=new ArrayList<>();
        List<Student> allCus= studentRepo.findAll();
        for (Student c : allCus){
            list.add(new StudentDTO(c.getRegId(),c.getName(),c.getAddress(),c.getBday(),c.getGrade(),c.getPassword()));

        }
        return list;
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        String msg=null;
        int x= Integer.parseInt(null);
        Student student=new Student(studentDTO.getSid(),studentDTO.getRegId(),studentDTO.getName(),
                studentDTO.getAddress(),studentDTO.getBday(),studentDTO.getGrade(),studentDTO.getPassword());

        if(student.getSid()!= x){
            studentRepo.save(student);

        }

    }

    @Override
    public Student searchStudent(Integer id) {
        Optional<Student> cus = this.studentRepo.findById(id);
        if (cus.isPresent()) {
            return cus.get();
        } else {
            return null;
        }
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }
}
