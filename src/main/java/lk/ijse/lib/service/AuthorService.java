package lk.ijse.lib.service;

import java.util.List;

import lk.ijse.lib.dto.AuthorDTO;

public interface AuthorService {
    void addAuthor(AuthorDTO authorDTO);

	List<AuthorDTO> getAllAuthors();
}
