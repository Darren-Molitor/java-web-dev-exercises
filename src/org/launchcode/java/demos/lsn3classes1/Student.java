package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    public void setName(String aName) {
        this.name = aName;
    }
    public void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }
    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }
    private void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public String getName() { return name; }
    public int getStudentId() {
        return studentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }

    public String studentInfo() {
        return ("Student: " + this.studentId + ": " + this.name +
                " has a GPA of " + this.gpa +
                " and a total of " + numberOfCredits + " credits.");
    }
    public static String getGradeLevel(int numberOfCredits) {
        if (numberOfCredits <= 29){
            return "freshman";
        } else if (numberOfCredits <= 59){
            return "sophomore";
        } else if (numberOfCredits <= 89) {
            return "junior";
        } else {
            return "senior";
        }
    }
    public void addGrade(int courseCredits, double grade) {
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore/this.numberOfCredits;
    }

    @Override
    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f",
                this.name, this.getGradeLevel(this.numberOfCredits),
                this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return student.getStudentId() == getStudentId();
    }

}