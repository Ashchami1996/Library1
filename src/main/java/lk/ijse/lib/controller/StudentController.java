package lk.ijse.lib.controller;

import lk.ijse.lib.dto.StudentDTO;
import lk.ijse.lib.model.Student;
import lk.ijse.lib.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Student")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDTO studentDTO){
        System.out.println(studentDTO.getRegId());
        studentService.addStudent(studentDTO);
        System.out.println("Ashan");

    }

    @GetMapping("/all")
    public List<StudentDTO> getAll(){
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDTO studentDTO){

        studentService.updateStudent(studentDTO);
    }

    @GetMapping("/find/{id}")
    public Student searchStudent(@PathVariable Integer id){

        return studentService.searchStudent(id);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }



}
