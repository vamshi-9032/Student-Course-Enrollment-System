package com.student.service;

import java.util.ArrayList;
import com.student.model.Student;

public class ArrayListService {

    public ArrayList<Student> getList() {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Vamshi", "Java"));
        list.add(new Student(2, "Ravi", "Python"));
        list.add(new Student(3, "Kiran", "C++"));

        return list;
    }

    public void display(ArrayList<Student> list) {
        System.out.println("ArrayList");
        for (Student s : list) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());
        }
    }
}