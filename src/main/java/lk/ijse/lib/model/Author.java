package lk.ijse.lib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name ="Author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="authorId", nullable= false, length=32,updatable=false)
    private Integer authorId;
    @Column (name ="authorName" )
    private String authorName;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Book> books = new ArrayList<>();
    
    public Author(){

    }

    public Author(int authorId, String authorName){
        this.authorId=authorId;
        this.authorName=authorName;
    }
    public Author(String authorName){
        this.authorName=authorName;
    }
   
    public Author(Integer authorId, String authorName, List<Book> books) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
    public void setBooks(List<Book> books) {
		this.books = books;
	}

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
