package com.test.Test.controller;

import com.test.Test.exception.StudentNotFoundException;
import com.test.Test.model.Course;
import com.test.Test.model.Grade;
import com.test.Test.model.Student;
import com.test.Test.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentController {
    @Autowired
    private final StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/courses/{studentID}")
    public void getCourses(@PathVariable(name="studentId") int studentID) throws StudentNotFoundException {
        List<Course> courses = studentService.getAllCoursesByStudent(studentID);
        for(Course course : courses){
            System.out.println(course.toString());
        }
    }

    @GetMapping("/grades/{studentID}")
    public void getGrades(@PathVariable(name="studentId") int studentID) throws StudentNotFoundException {
        List<Grade> grades = studentService.getAllGradesByStudent(studentID);
        for(Grade grade : grades){
            System.out.println(grade.toString());
        }
    }
}
