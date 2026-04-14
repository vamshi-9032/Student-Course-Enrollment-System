package com.student.service;

import java.util.ArrayList;
import java.util.LinkedList;
import com.student.model.Student;

public class LinkedListService {

    public LinkedList<Student> getList(ArrayList<Student> list) {
        LinkedList<Student> ll = new LinkedList<>(list);
        ll.addFirst(new Student(4, "Rahul", "Go"));
        ll.removeLast();
        return ll;
    }

    public void display(LinkedList<Student> list) {
        System.out.println("LinkedList");
        for (Student s : list) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());
        }
    }
}