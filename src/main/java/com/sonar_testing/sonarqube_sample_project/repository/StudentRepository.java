package com.sonar_testing.sonarqube_sample_project.repository;

import com.sonar_testing.sonarqube_sample_project.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
