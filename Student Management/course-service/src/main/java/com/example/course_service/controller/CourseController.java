package com.example.course_service.controller;

import com.example.course_service.model.Course;
import com.example.course_service.repository.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseRepository repository;

    public CourseController(CourseRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> addCourse(@RequestBody @Valid Course course) {
        repository.save(course);
        return ResponseEntity.ok("Course added");
    }

    @PutMapping
    public ResponseEntity<String> updateCourse(@RequestBody @Valid Course course) {
        repository.save(course);
        return ResponseEntity.ok("Course updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Course deleted");
    }
}