package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Jennifer");
        student1.addGrade(72);
        student1.addGrade(70);
        student1.addGrade(82);
        students.put("jenniPho", student1);

        Student student2 = new Student("Jennifer");
        student2.addGrade(72);
        student2.addGrade(70);
        student2.addGrade(82);
        students.put("jenniPho", student2);

        Student student3 = new Student("Jennifer");
        student3.addGrade(72);
        student3.addGrade(70);
        student3.addGrade(82);
        students.put("jenniPho", student3);

        Student student4 = new Student("Jennifer");
        student4.addGrade(72);
        student4.addGrade(70);
        student4.addGrade(82);
        students.put("jenniPho", student4);
    }
}
