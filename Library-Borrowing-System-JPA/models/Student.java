/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aya
 */
@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "student_id")
    private int    student_Id;
    private String name;
    
    // List of books
    
    // ─── Constructors ───────────────────────────────────────────

    public Student() {}

    

    public Student(int studentId, String name) {
        this.student_Id      = studentId;
        this.name           = name;
    }

    // ─── Getters & Setters ──────────────────────────────────────

    public int getStudentId()                        { return student_Id; }
    public void setStudentId(int studentId)          { this.student_Id = studentId; }

    public String getName()                          { return name; }
    public void setName(String name)                 { this.name = name; }



    // ─── toString ───────────────────────────────────────────────

    @Override
    public String toString() {
        return 
               "studentId="   + student_Id +
               ", name="      + name       +"}\n";
    
}
    
}
