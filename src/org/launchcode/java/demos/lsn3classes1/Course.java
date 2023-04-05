package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;
import java.util.Objects;

import org.launchcode.java.demos.lsn3classes1.Student;
public class Course {
    private String topic;
    private String instructor;
    private ArrayList<Student> courseStudents;
    public Course(String topic, String instructor, ArrayList courseStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.courseStudents = courseStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return topic.equals(course.topic) && instructor.equals(course.instructor);
    }

    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor='" + instructor + '\'' +
                ", courseStudents=" + courseStudents +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }

    public void setTopic(String aTopic) {
        this.topic = aTopic;
    }
    public void setInstructor(String aInstructor) {
        this.instructor = aInstructor;
    }
    public String getTopic() {
        return topic;
    }
    public String getInstructor() {
        return instructor;
    }
    public String courseInfo() {
        return ("Course: " + this.topic + ": " + this.instructor);
    }
}
