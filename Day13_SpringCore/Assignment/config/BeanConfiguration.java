package com.coforge.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Address;
import com.coforge.model.Student;

@Configuration
public class BeanConfiguration {

    @Bean
    public Address address() {

        return new Address("City-1", "State-1");
    }

    @Bean
    public Student student() {

        Student student = new Student();

        student.setStudentId(101);
        student.setStudentName("Rahul Sharma");

        student.setAddress(address());

        student.setSubjects(Arrays.asList(
                "Java",
                "Spring Core",
                "Hibernate",
                "MySQL",
                "React"));

        student.setSkills(new HashSet<>(Arrays.asList(
                "Communication",
                "Problem Solving",
                "Team Work",
                "Java")));

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Java", 95);
        marks.put("Spring", 90);
        marks.put("Hibernate", 88);
        marks.put("MySQL", 92);
        marks.put("React", 85);

        student.setMarks(marks);

        return student;
    }
}