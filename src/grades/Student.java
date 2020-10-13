package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade (int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (Integer grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public static void main(String[] args) {
        Student student1 = new Student ("Lydia");
        Student student2 = new Student ("Josh");

    }
}
