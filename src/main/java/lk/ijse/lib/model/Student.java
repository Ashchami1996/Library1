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
@Table (name ="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name ="sid" , nullable= false, length=32,updatable=false)
    private Integer sid;
    @Column (name ="regId", nullable= false,updatable=false)
    private int regId;
    @Column (name ="name")
    private String name;
    @Column (name ="address")
    private String address;
    @Column (name ="bday")
    private String bday;
    @Column (name ="grade")
    private String grade;
    @Column (name ="password")
    private String password;
    
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<BookIssue> bookIssues = new ArrayList<>();

    public Student() {
    }

    public Student(int regId, String name, String address, String bday, 
    		String grade, String password) {
        this.regId = regId;
        this.name = name;
        this.address = address;
        this.bday = bday;
        this.grade = grade;
        this.password = password;
    }
    public Student(int sid, int RegId, String name, String address, String bday,
     String grade,String password) {
        this.sid = sid;
        this.regId = RegId;
        this.name = name;
        this.address = address;
        this.bday = bday;
        this.grade = grade;
        this.password = password;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
