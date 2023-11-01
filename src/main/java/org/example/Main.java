package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", List.of(4.5, 5.0, 4.8), "Computer science"));
        students.add(new Student("Kate", List.of(4.9, 4.6, 5.0), "Computer science"));
        students.add(new Student("Mike", List.of(4.2, 4.7, 4.9), "Mathematics"));
        students.add(new Student("Anna", List.of(4.8, 4.9, 4.7), "Computer science"));
        students.add(new Student("Petr", List.of(5.0, 4.5, 4.8), "Computer science"));
        students.add(new Student("Jana", List.of(4.6, 4.4, 4.9), "Chemistry"));
        students.add(new Student("Serg", List.of(4.3, 4.8, 5.0), "Chemistry"));

        List<Student> result = students.stream()
                .filter(student -> student.getSpecialty().equals("Computer science"))
                .filter(student -> student.getAvgGrade() > 4.5)
                .sorted(Comparator.comparingDouble(Student::getAvgGrade).reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("The first 5 students of the Computer Science specialty with a higher average score 4.5:");

        for (Student student : result) {
            System.out.println(student.getName() + " - " + student.getAvgGrade());
        }
    }
}
