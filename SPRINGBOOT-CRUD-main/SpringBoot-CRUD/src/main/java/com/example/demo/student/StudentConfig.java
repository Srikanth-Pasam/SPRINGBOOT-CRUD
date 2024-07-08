package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    private List<Student> studentList;

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Srikanth = new Student(
                    "Srikanth",
                    LocalDate.of(1999, Month.APRIL, 09),
                    "pasamsrikanth@gmail.com"
            );
            Student Kiran = new Student(
                    "kiran",
                    LocalDate.of(2000, Month.JULY, 17),
                    "bodeddajyothikiran@gmail.com"
            );
            studentList = new ArrayList<>();
            studentList.add(srikanth);
            studentList.add(kiran);
            repository.saveAll(studentList);
        };
    }
}
