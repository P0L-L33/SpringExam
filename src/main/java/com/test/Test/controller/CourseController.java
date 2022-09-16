package com.test.Test.controller;

import com.test.Test.model.Course;
import com.test.Test.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("course")
public class CourseController {
    private final CourseService courseService;

    @PostMapping("/add")
    public void addCourse(@RequestBody Course course)
    {
        courseService.addCourse(course);
    }

    @PostMapping("/add/{course}/{student}")
    public void addStudentToCourse(@PathVariable(name = "course") int course,
                                   @PathVariable(name = "student") int student) {
        courseService.enrollStudent(course, student);
    }
}
