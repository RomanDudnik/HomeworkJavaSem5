package org.example;
import java.util.List;

class Student {
    private String name;
    private List<Double>grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public double getAvgGrade() {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getName() {
        return name;
    }
}
