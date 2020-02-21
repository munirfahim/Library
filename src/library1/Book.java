/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library1;

/**
 *
 * @author student
 */
public class Book {
    private String BookName;
private String bookAuthor;
private String bookid;
private String bookType;
private int bookCopy;

public Book(){}
public Book(String bn,String ba,String bid,String bt,int bc){
    this.BookName=bn;
    this.bookAuthor=ba;
    this.bookid=bid;
    this.bookType=bt;
    this.bookCopy=bc;
}

public void addBookCopy(int x){
    this.bookCopy+=x;
}

public void showInfo(){
    System.out.println("Book Name: "+ this.BookName);
    System.out.println("Book Author: "+ this.bookAuthor);
    System.out.println("Book ID: "+ this.bookid);
    System.out.println("Book Type: "+ this.bookType);
    System.out.println("Book Copy: "+ this.bookCopy);
}
        
    
}
