/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

public class FrontDesk {
    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println(lib);

        Student student = new Student();
        System.out.println(student);

        Book book = new Book();
        System.out.println(book);
    }
}
