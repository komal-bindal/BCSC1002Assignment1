/*  Created by IntelliJ IDEA.
 *  User: Komal Bindal
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    int numberOfBooksIssued;
    Book[] namesOfBooksIssued;
    private String name;
    private long universityRollNumber;

    public Student() {
        name = "Dev";
        universityRollNumber = 191500200L;
        numberOfBooksIssued = 1;
        this.namesOfBooksIssued = new Book[1];
        namesOfBooksIssued[0] = new Book();
    }

    public Student(long universityRollNumber, String name) {
        this.universityRollNumber = universityRollNumber;
        this.name = name;
        this.numberOfBooksIssued = 1;
        this.namesOfBooksIssued = new Book[1];
        namesOfBooksIssued[0] = new Book();
    }

    public Student(String name, long universityRollNumber, int numberOfBooksIssued, Book[] namesOfBooksIssued) {
        this.name = name;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getNamesOfBooksIssued() {
        return namesOfBooksIssued.clone();
    }

    public void setNamesOfBooksIssued(Book[] namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    @Override
    public String toString() {
        return "Student Name: " + getName() +
                "\nUniversity Roll Number: " + getUniversityRollNumber() +
                "\nNumber of books issued: " + getNumberOfBooksIssued() +
                "\nName of books issued: " + Arrays.toString(getNamesOfBooksIssued());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                getUniversityRollNumber() == student.getUniversityRollNumber() &&
                Arrays.equals(getNamesOfBooksIssued(), student.getNamesOfBooksIssued()) &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNumberOfBooksIssued(), getName(), getUniversityRollNumber());
        result = 31 * result + Arrays.hashCode(getNamesOfBooksIssued());
        return result;
    }

    /**
     * This method will print all the books issued by a student.
     */
    public void listIssuedBook() {
        for (Book book : namesOfBooksIssued) {
            System.out.println(book);
        }
    }

    /**
     * This method will allow a student to issue a book.
     *
     * @param bookName This is the name of book that the Student want to issue.
     */
    public void doIssueBook(String bookName) {
        System.out.println("Thank you for issuing \"" + bookName + "\".");
    }

    /**
     * This method will allow a student to return a book.
     *
     * @param bookName This is the name of book that the Student want to return.
     */
    public void doReturnBook(String bookName) {
        System.out.println("Thank you for returning \"" + bookName + "\".");
    }

}
