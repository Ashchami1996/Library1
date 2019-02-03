package lk.ijse.lib.service;

import lk.ijse.lib.dto.BookDTO;
import lk.ijse.lib.model.Book;

import java.util.List;

public interface BookService {
    void addBook(BookDTO bookDTO);

    void deleteBook(Integer id);

   

    void updateBooks(BookDTO bookDTO);

    List<BookDTO> getAllBooks();

    Book searchBook(Integer id);

    void updateBooks1(BookDTO bookDTO);

    void updateBooks2(BookDTO bookDTO);

    //Book searchBook1(String bookName);
}
