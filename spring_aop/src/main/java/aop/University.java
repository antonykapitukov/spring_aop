package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {
    public List<Student> students = new ArrayList<Student>();

    public void addStudent() {
        Student st1 = new Student("Anton Kapshukov", 2, 4.46);
        Student st2 = new Student("Vasya Pupkin", 1, 5);
        Student st3 = new Student("Petya Sidorov", 4, 3.9);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from getStudent: ");
        System.out.println(students);
        return students;
    }
}
