package lk.ijse.lib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.type.descriptor.java.JavaTypeDescriptorRegistry.FallbackJavaTypeDescriptor;


@Entity
@Table (name ="Book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="bid" , nullable= false, length=32,updatable=false)
    private Integer bid;
    @Column (name ="bookName")
    private String bookName;
    @Column (name  ="category")
    private String category;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch =FetchType.LAZY)
    @JoinColumn(name="authorId", referencedColumnName="authorId" , nullable= false)
    private Author author;
    
    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    private List<BookIssue> bookIssues = new ArrayList<>();

    private String status;
    private String pages;
    private int rackno;

    public Book() {
    }

    public Book(Integer bid,String bookName, String category, Author author,
    		String status,String pages, int rackno) {
        this.bid=bid;
        this.bookName = bookName;
        this.category = category;
        this.author = author;
        this.status = status;
        this.pages=pages;
        this.rackno = rackno;
    }

    public Book(String bookName, String category, Author author, 
    		String status,String pages, int rackno) {
        this.bookName = bookName;
        this.category = category;
        this.author = author;
        this.status = status;
        this.pages=pages;
        this.rackno = rackno;
    }

    public Book(Integer bid, String bookName, String category, Author author,
    		List<BookIssue> bookIssues, String status,
			String pages, int rackno) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.category = category;
		this.author = author;
		this.bookIssues = bookIssues;
		this.status = status;
		this.pages = pages;
		this.rackno = rackno;
	}

	public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRackno() {
        return rackno;
    }

    public void setRackno(int rackno) {
        this.rackno = rackno;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bookName='" + bookName + '\'' +
                ", category='" + category + '\'' +
                ", author=" + author +
                ", status='" + status + '\'' +
                ", pages='" + pages + '\'' +
                ", rackno=" + rackno +
                '}';
    }
}
