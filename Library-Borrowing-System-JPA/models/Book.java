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
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "book_id")
    private int book_Id;
    private String title;
    
    // List of students
    public Book() {}

    public Book(String title ) {
        this.title= title;
    }

    public Book(int bookId, String title) {
        this.book_Id= bookId;
        this.title= title;
    }


    public int getBookId()                        { return book_Id; }
    public void setBookId(int bookId)             { this.book_Id = bookId; }

    public String getTitle()                      { return title; }
    public void setTitle(String title)            { this.title = title; }



    @Override
    public String toString() {
        return "bookId="    + book_Id+
               ", title="   + title+"\n";
    }
    
}
