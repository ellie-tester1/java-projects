package oop.book_management;

import java.util.ArrayList;

public class BookManager {
    public static void main(String[] args) {

        Book book1 = new Book("GOT", "George R. Martin", " SciFi", 11);
        Book book2 = new Book("LOR", "J.R.R. Tolkien", " Fantasy", 12);
        Book book3 = new Book("Sister Carrie", "Theodore Dreiser", "Drama", 13);
        Book book4 = new Book("Pride & Prejudice", "Jane Austin", "Romance", 14);

        ArrayList<Book> bookShelf = new ArrayList<>();
        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);

        for (Book bookObj : bookShelf){
           bookObj.printBookDetails();
           System.out.println("===============================");

        }

    }
}

