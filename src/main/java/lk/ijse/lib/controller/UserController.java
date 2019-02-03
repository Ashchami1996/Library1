package lk.ijse.lib.controller;

import lk.ijse.lib.dto.UserDTO;
import lk.ijse.lib.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("User")
@CrossOrigin(origins = "*")
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping("/add")
    public void addAuthor(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);

    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody UserDTO userDTO){

        userService.updateUser(userDTO);

    }
}
