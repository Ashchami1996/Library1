package lk.ijse.lib.service;

import lk.ijse.lib.dto.BookIssueDTO;
import lk.ijse.lib.model.BookIssue;

import java.util.List;

public interface BookIssueService {
    void deleteBooking(Integer id);

    BookIssue searchBoooking(Integer id);

    void updateBooking(BookIssueDTO bookIssueDTO);

    List<BookIssueDTO> getAllBookings();

    void addBooking(BookIssueDTO bookIssueDTO);
}
