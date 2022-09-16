package com.test.Test.service;

import com.test.Test.exception.StudentNotFoundException;
import com.test.Test.model.Course;
import com.test.Test.model.Grade;
import com.test.Test.model.Student;
import com.test.Test.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public List<Course> getAllCoursesByStudent(Integer studentId) throws StudentNotFoundException {
        Student student = studentRepository.findById(studentId).get();
        if(student == null){
            throw new StudentNotFoundException();
        }else {
            return student.getCourses();
        }
    }

    public List<Grade> getAllGradesByStudent(Integer userId) throws StudentNotFoundException {
        Student student = studentRepository.findById(userId).get();
        if(student == null){
            throw new StudentNotFoundException();
        }else {
            return student.getGrades();
        }
    }
}
