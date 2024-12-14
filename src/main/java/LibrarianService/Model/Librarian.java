package LibrarianService.Model;

import java.util.List;

import core.model.Employee;
import LibrarianService.Book;

public class Librarian extends Employee {
    
    private int id;
    private String name;
    private String email;
    private List<Book> books;
    private String attribute;

    public Librarian(int id, String name, String email, List<Book> books, String attribute){
        this.id = id;
        this.name = name;
        this.email = email;
        this.books = books;
        this.attribute = attribute;
    }

    public Librarian(){

    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Book> getBooks() {
        return this.books;
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public String getAttribute() {
        return this.attribute;
    }
    
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public void removeBook(Book book) {
        this.books.remove(book);
    }
    
    public List<Book> viewAvailableBooks() {
        return this.books;
    }
    
    public boolean giveBook(Book book) {
        return false;
    }
}
