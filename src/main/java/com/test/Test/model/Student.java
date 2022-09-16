package com.test.Test.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;

    @NotNull
    @OneToMany
    public List<Grade> grades = new ArrayList<Grade>();

    @NotNull
    @OneToMany
    public List<Course> courses = new ArrayList<Course>();

}
