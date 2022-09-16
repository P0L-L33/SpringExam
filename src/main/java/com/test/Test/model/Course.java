package com.test.Test.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @NotNull
    public String subject;

    @NotNull
    @OneToMany
    public List<Teacher> teacher = new ArrayList<>();

    @NotNull
    @OneToMany
    public List<Student> students = new ArrayList<>();
}
