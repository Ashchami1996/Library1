package lk.ijse.lib.service.impl;

import lk.ijse.lib.dto.BookIssueDTO;
import lk.ijse.lib.model.Book;
import lk.ijse.lib.model.BookIssue;
import lk.ijse.lib.model.Student;
import lk.ijse.lib.repository.BookIssueRepo;
import lk.ijse.lib.repository.BookRepo;
import lk.ijse.lib.repository.StudentRepo;
import lk.ijse.lib.service.BookIssueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookIssueServiceImpl implements BookIssueService {

    @Autowired
    private BookIssueRepo bookIssueRepo;

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private StudentRepo studentRepo;

    Book book;
    Student student;

    @Override
    public void deleteBooking(Integer id) {
        bookIssueRepo.deleteById(id);
    }

    @Override
    public BookIssue searchBoooking(Integer id) {
        Optional<BookIssue> cus = this.bookIssueRepo.findById(id);
        if (cus.isPresent()) {
            return cus.get();
        } else {
            return null;
        }
    }

    @Override
    public void updateBooking(BookIssueDTO bookIssueDTO) {
        String msg=null;
        int x= Integer.parseInt(null);
        Optional<Book> cus = this.bookRepo.findById(bookIssueDTO.getBid());
        if (cus.isPresent()) {
            book= cus.get();
        }

        Optional<Student> cus1 = this.studentRepo.findById(bookIssueDTO.getSid());
        if (cus.isPresent()) {
            student= cus1.get();
        }

        System.out.println(bookIssueDTO.getBid());
        BookIssue bookIssue=new BookIssue(bookIssueDTO.getTid(),student,book,
               bookIssueDTO.getIssuedate(),bookIssueDTO.getDuedate(),bookIssueDTO.getStatus());

        System.out.println(book.getBid());
        if(bookIssueDTO.getTid()!= x){
            bookIssueRepo.save(bookIssue);

        }
    }

    @Override
    public List<BookIssueDTO> getAllBookings() {
        List<BookIssueDTO> list=new ArrayList<>();
        List<BookIssue> allCus= bookIssueRepo.findAll();
        for (BookIssue c : allCus){
            list.add(new BookIssueDTO(c.getTid(),c.getStudent().getSid(),c.getBook().getBid(),
                    c.getIssuedate(),c.getDuedate(),c.getStatus()
                    ));

        }
        return list;
    }

    @Override
    public void addBooking(BookIssueDTO bookIssueDTO) {
        String msg=null;
        int x= Integer.parseInt(null);
        Optional<Book> cus = this.bookRepo.findById(bookIssueDTO.getBid());
        if (cus.isPresent()) {
            book= cus.get();
        }

        Optional<Student> cus1 = this.studentRepo.findById(bookIssueDTO.getSid());
        if (cus.isPresent()) {
            student= cus1.get();
        }

        BookIssue bookIssue=new BookIssue(bookIssueDTO.getTid(),student,book,
                bookIssueDTO.getIssuedate(),bookIssueDTO.getDuedate(),bookIssueDTO.getStatus());

        bookIssueRepo.save(bookIssue);

    }
}
