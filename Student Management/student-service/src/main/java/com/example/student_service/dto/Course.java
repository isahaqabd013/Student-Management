package com.example.student_service.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Course {
    @Id
    private Long id;
    private String name;
    private String description;
}

