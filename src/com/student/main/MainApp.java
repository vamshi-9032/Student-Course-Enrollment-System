package com.student.main;

import java.util.*;

import com.student.model.Student;
import com.student.service.*;

public class MainApp {

    public static void main(String[] args) {

        ArrayListService a = new ArrayListService();
        ArrayList<Student> list = a.getList();
        a.display(list);

        LinkedListService l = new LinkedListService();
        LinkedList<Student> ll = l.getList(list);
        l.display(ll);

        HashSetService h = new HashSetService();
        HashSet<Student> hs = h.getSet(list);
        h.display(hs);

        LinkedHashSetService lhs = new LinkedHashSetService();
        LinkedHashSet<Student> lhsSet = lhs.getSet(list);
        lhs.display(lhsSet);

        IteratorService i = new IteratorService();
        i.display(hs);
    }
}