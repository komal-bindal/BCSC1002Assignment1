/*  Created by IntelliJ IDEA.
 *  User: Komal Bindal
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    Book[] booksCurrentlyAvailable;

    public Library() {
        booksCurrentlyAvailable = new Book[10];
        for (int i = 0; i < booksCurrentlyAvailable.length; i++) {
            booksCurrentlyAvailable[i] = new Book();
        }
    }

    public Library(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable.clone();
    }

    public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    @Override
    public String toString() {
        return Arrays.toString(getBooksCurrentlyAvailable());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksCurrentlyAvailable(), library.getBooksCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksCurrentlyAvailable());
    }

    /**
     * This method will print the list all the books that are present in library.
     */
    public void listBooks() {
        for (Book book : booksCurrentlyAvailable) {
            System.out.println(book);
        }
    }

    /**
     * This method will allow a student to issue a book from library.
     *
     * @param bookName This is the name of book that the Student want to issue.
     */
    public void doIssueBook(String bookName) {
        System.out.println("Thank you for issuing \"" + bookName + "\".");
    }

    /**
     * This method will allow a student to return a book to library.
     *
     * @param bookName This is the name of book that the Student want to return.
     */
    public void doReturnBook(String bookName) {
        System.out.println("Thank you for returning \"" + bookName + "\".");
    }
}
