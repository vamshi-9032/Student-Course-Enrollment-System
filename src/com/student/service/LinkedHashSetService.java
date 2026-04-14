package com.student.service;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import com.student.model.Student;

public class LinkedHashSetService {

    public LinkedHashSet<Student> getSet(ArrayList<Student> list) {
        return new LinkedHashSet<>(list);
    }

    public void display(LinkedHashSet<Student> set) {
        System.out.println("LinkedHashSet");
        for (Student s : set) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());
        }
    }
}