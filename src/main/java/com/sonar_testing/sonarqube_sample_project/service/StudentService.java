package com.sonar_testing.sonarqube_sample_project.service;

import com.sonar_testing.sonarqube_sample_project.Entity.Student;
import com.sonar_testing.sonarqube_sample_project.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }
}
