/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    int numberOfBooksIssued;
    Book[] nameOfBooksIssued;
    private String name;
    private long universityRollNumber;

    public Student() {
        name = "Dev";
        universityRollNumber = 191500200L;
        numberOfBooksIssued = 0;
        this.nameOfBooksIssued = new Book[1];
        nameOfBooksIssued[0] = new Book();
    }

    public Student(String name, long universityRollNumber, int numberOfBooksIssued, Book[] nameOfBooksIssued) {
        this.name = name;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.nameOfBooksIssued = nameOfBooksIssued;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getNameOfBooksIssued() {
        return nameOfBooksIssued.clone();
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
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
                "\nName of books issued: " + Arrays.toString(getNameOfBooksIssued());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                getUniversityRollNumber() == student.getUniversityRollNumber() &&
                Arrays.equals(getNameOfBooksIssued(), student.getNameOfBooksIssued()) &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNumberOfBooksIssued(), getName(), getUniversityRollNumber());
        result = 31 * result + Arrays.hashCode(getNameOfBooksIssued());
        return result;
    }
}
