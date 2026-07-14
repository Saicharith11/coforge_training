package com.coforge.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tbl_student")
public class Student {
    
    @Id // No @GeneratedValue here, you will provide the ID manually
    @Column(name = "student_id")
    private int studentId;
    
    @Column(name = "student_name")
    private String studentName;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "tbl_student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses = new ArrayList<>();
    
    // Constructors
    public Student() {
    }
    
    // Updated constructor to accept the ID manually
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Helper method to link a course
    public void addCourse(Course course) {
        this.courses.add(course);
        course.getStudents().add(this);
    }

    // Getters and Setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public List<Course> getCourses() { return courses; }
    public void setCourses(List<Course> courses) { this.courses = courses; }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
    }
}