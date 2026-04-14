package com.student.service;

import java.util.HashSet;
import java.util.ArrayList;
import com.student.model.Student;

public class HashSetService {

    public HashSet<Student> getSet(ArrayList<Student> list) {
        return new HashSet<>(list);
    }

    public void display(HashSet<Student> set) {
        System.out.println("HashSet");
        for (Student s : set) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());
        }
    }
}