package oop.book_management;

public class Book {

private  String name;
private String author;
private String title;
private int id;


    public Book(String name, String author, String title, int id) {
        setName(name);
        setAuthor(author);
        setTitle(title);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

    public void printBookDetails(){
        String details = "Book name: " + name
                +"\n Book author: " + author
                + "\nBook title: "+ title
                +"\nBook id: " + id;

        System.out.println(details);

    }
}
