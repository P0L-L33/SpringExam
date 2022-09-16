package com.test.Test.controller;

import com.test.Test.model.Teacher;
import com.test.Test.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private final TeacherService teacherService;

    @PostMapping("/add")
    public void addTeacher(@RequestBody Teacher teacher)
    {
        teacherService.addTeacher(teacher);
    }
}
