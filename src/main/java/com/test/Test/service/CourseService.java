package com.test.Test.service;

import com.test.Test.model.Course;
import com.test.Test.model.Student;
import com.test.Test.repository.CourseRepository;
import com.test.Test.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {
    @Autowired
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void enrollStudent(int courseId, int studentId){
        Course course = courseRepository.findById(courseId).get();
        Student student = studentRepository.findById(studentId).get();

        course.students.add(student);
        student.courses.add(course);
        courseRepository.save(course);

    }
}
