package lk.ijse.lib.controller;

import lk.ijse.lib.dto.AuthorDTO;
import lk.ijse.lib.dto.BookDTO;
import lk.ijse.lib.service.AuthorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Author")
@CrossOrigin(origins = "*")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    public void addAuthor(@RequestBody AuthorDTO authorDTO){
        authorService.addAuthor(authorDTO);

    }

    @GetMapping("/all")
    public List<AuthorDTO> getAll(){
        return authorService.getAllAuthors();
    }


}
