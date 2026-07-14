package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.coforge.model.Student;
import com.coforge.model.Course;

public class MainClass {

    public static void main(String[] args) {
        
        // 1. Setup the Hibernate configuration and engine
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // 1. CREATE OPERATION (Uncomment to Insert data)
        /*
        Course java = new Course(501, "Java");
        Course springBoot = new Course(502, "Spring Boot");
        Course hibernate = new Course(503, "Hibernate");
        Course angular = new Course(504, "Angular");

        // SAVING COURSES FIRST TO AVOID FOREIGN KEY ERRORS ⭐
        session.save(java);
        session.save(springBoot);
        session.save(hibernate);
        session.save(angular);

        Student john = new Student(101, "John");
        Student priya = new Student(102, "Priya");
        Student david = new Student(103, "David");

        // Link mappings
        john.addCourse(java);
        john.addCourse(springBoot);

        priya.addCourse(java);
        priya.addCourse(hibernate);

        david.addCourse(java);
        david.addCourse(springBoot);
        david.addCourse(angular);

        // Save students and bridge links
        session.save(john);
        session.save(priya);
        session.save(david);
        System.out.println("Data Inserted Successfully!");
        */

        // 2. READ OPERATION (Uncomment to Fetch David's info)
        /*
        Student stud = session.get(Student.class, 103);
        System.out.println("Student Name: " + stud.getStudentName());
        System.out.println("Enrolled Courses: " + stud.getCourses());
        */

        // 3. UPDATE OPERATION (Uncomment to change Priya's name)

        /*
        Student studToUpdate = session.get(Student.class, 102);
        studToUpdate.setStudentName("Priya Sharma");
        session.update(studToUpdate);
        System.out.println("Student Profile Updated!");
        */

        // 4. DELETE OPERATION
        
        Student studToDelete = session.get(Student.class, 101);
        if(studToDelete != null) {
            session.delete(studToDelete); 
            System.out.println("Student and Enrollments Deleted!");
        }
        

        // 3. Commit changes and close everything out safely
        transaction.commit();
        session.close();
        factory.close();
    }
}