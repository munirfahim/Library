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
public class Library {
    private String libname;
    private String libAddress;
    private Book[] listofBook;
    private int totalBook;
    
    public Library(){}
    public Library(String ln,String la){
        this.libname=ln;
        this.libAddress=la;
        listofBook=new Book[1000];
        this.totalBook=0;
    }
    
    public void showLibInfo(){
        System.out.println("Library Name: "+ this.libname);
        System.out.println("Library Adress: "+ this.libAddress);
        for(int i=0;i<totalBook;i++){
            
            listofBook[i].showInfo();
        }
        System.out.println("Total Book: "+ this.totalBook);
    }
    public void addNewBook(Book book){
        listofBook[totalBook]=book;
        totalBook++;
    }
    
    public void deleteBook(Book book){
        for(int i=0;i<totalBook;i++)
            if(listofBook[i]==book){
                listofBook[i]=listofBook[totalBook];
                totalBook--;
            }
    }
    void addNewBookCopy(Book book,int copy){
       book.addBookCopy(copy);    
    }
}
