package com.example.course_service.client;

import com.example.course_service.Dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service")
public interface StudentClient {
    @GetMapping("/api/students/course/{courseId}")
    List<StudentDto> getStudentsByCourseId(@PathVariable Long courseId);
}
