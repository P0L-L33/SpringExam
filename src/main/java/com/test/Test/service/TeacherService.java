package com.test.Test.service;

import com.test.Test.model.Student;
import com.test.Test.model.Teacher;
import com.test.Test.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherService {
    @Autowired
    private final TeacherRepository teacherRepository;

    public void addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
}
