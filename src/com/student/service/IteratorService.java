package com.student.service;

import java.util.HashSet;
import java.util.Iterator;
import com.student.model.Student;

public class IteratorService {

    public void display(HashSet<Student> set) {
        System.out.println("Iterator");
        Iterator<Student> it = set.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());
        }
    }
}