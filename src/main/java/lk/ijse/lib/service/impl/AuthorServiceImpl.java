package lk.ijse.lib.service.impl;

import lk.ijse.lib.dto.AuthorDTO;
import lk.ijse.lib.dto.StudentDTO;
import lk.ijse.lib.model.Author;
import lk.ijse.lib.model.Student;
import lk.ijse.lib.repository.AuthorRepo;
import lk.ijse.lib.service.AuthorService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public void addAuthor(AuthorDTO authorDTO) {
        Author author=new Author(authorDTO.getAuthorId(),authorDTO.getAuthorName());
        authorRepo.save(author);
    }

	@Override
	public List<AuthorDTO> getAllAuthors() {
		 List<AuthorDTO> list=new ArrayList<>();
	        List<Author> allCus= authorRepo.findAll();
	        for (Author c : allCus){
	            list.add(new AuthorDTO(c.getAuthorId(),c.getAuthorName()));

	        }
	        return list;
	}
}
