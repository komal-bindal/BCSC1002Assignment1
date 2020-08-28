/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_ISSUED_BOOK = 2;
    private static final int SHOW_ALL_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        Library library = new Library();
        int studentInput;

        int studentUniversityRollNumber;
        String bookName;
        String studentName;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issued book from me.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit.");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_A_NEW_BOOK:
                    System.out.println("These are the books currently available in library:");
                    library.getBooksCurrentlyAvailable();
                    System.out.println("Please enter the name of book you want to issue:-");
                    bookName = scanner.nextLine();
                    System.out.println("Thank you for issuing \"" + bookName + "\".");
                    break;
                case RETURN_PREVIOUSLY_ISSUED_BOOK:
                    break;
                case SHOW_ALL_ISSUED_BOOKS:
                    System.out.println("Please enter your name :");
                    studentName = scanner.nextLine();

                    break;
                default:
                    break;
            }
        } while (studentInput != EXIT);
    }
}
