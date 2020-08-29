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
        Library library = new Library();
        int studentInput;
        long studentUniversityRollNumber;
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
                    System.out.print("Please enter your university roll number:- ");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.print("Please enter your name:- ");
                    studentName = scanner.next();
                    Student student = new Student(studentUniversityRollNumber, studentName);
                    System.out.println("These are the books currently available in library:");
                    library.listBooks();
                    System.out.print("Please enter the name of book you want to issue:-");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.doIssueBook(bookName);
                    System.out.println();
                    break;
                case RETURN_PREVIOUSLY_ISSUED_BOOK:
                    System.out.print("Please enter your university roll number:- ");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.print("Please enter your name:- ");
                    studentName = scanner.next();
                    Student student1 = new Student(studentUniversityRollNumber, studentName);
                    System.out.print("Please enter the name of book you want to return:-");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student1.doReturnBook(bookName);
                    System.out.println();
                    break;
                case SHOW_ALL_ISSUED_BOOKS:
                    System.out.print("Please enter your university roll number:- ");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.print("Please enter your name:- ");
                    studentName = scanner.next();
                    Student student3 = new Student(studentUniversityRollNumber, studentName);
                    System.out.print("These are the books that you have issued:- ");
                    student3.listIssuedBook();
                    System.out.println();
                    break;
                default:
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
