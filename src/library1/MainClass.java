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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Library l1=new Library("AIUB Library","Kuratoli");
        Book b1=new Book("Rohossho","jafar iqbal","101","Adventure",10);
        Book b2=new Book("Rohossho 2","jafar iqbal","102","Adventure",20);
        l1.addNewBook(b1);
        l1.addNewBook(b2);
        l1.addNewBookCopy(b2, 30);
        
        l1.deleteBook(b2);
        l1.showLibInfo();
        l1.addNewBook(b2);
        l1.showLibInfo();
    }
    
}
