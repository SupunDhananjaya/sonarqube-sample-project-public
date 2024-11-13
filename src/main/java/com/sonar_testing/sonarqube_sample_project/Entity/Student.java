package com.sonar_testing.sonarqube_sample_project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    private int studentId;
    private String name;
    private int age;
}
