/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String name;
    private String authorName;
    private String bookISBNNumber;

    public Book() {
        name = "Think Java";
        authorName = "Allen B. Downey";
        bookISBNNumber = "9781491929513";
    }

    public Book(String name, String authorName, String bookISBNNumber) {
        this.name = name;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }


    @Override
    public String toString() {
        return "name: '" + getName() + '\'' +
                ", authorName: '" + getAuthorName() + '\'' +
                ", bookISBNNumber: '" + getBookISBNNumber() + '\'' + ".";
    }
}
