package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Jennifer");
        student1.addGrade(72);
        student1.addGrade(70);
        student1.addGrade(82);
        students.put("jenniPho", student1);

        Student student2 = new Student("James");
        student2.addGrade(73);
        student2.addGrade(90);
        student2.addGrade(93);
        students.put("JamesBlonde", student2);

        Student student3 = new Student("Amadeus");
        student3.addGrade(93);
        student3.addGrade(87);
        student3.addGrade(70);
        students.put("immadayWho13", student3);

        Student student4 = new Student("Brad");
        student4.addGrade(90);
        student4.addGrade(85);
        student4.addGrade(87);
        students.put("breadPitt2020", student4);

        Input userInput = new Input();

        System.out.println("Welcome! \n" + "Here are the GitHub usernames of our students:\n");

        for (String username : students.keySet()) {
            System.out.printf("| %s ", username);
        }

        System.out.println();
        String usernameEnt = userInput.getString("What student would you like to see more information on?");

        if(!students.containsKey(usernameEnt)) {
            System.out.printf("Sorry, no student found with that Github user name of \"%s\" \n", usernameEnt);
        }
        System.out.printf("Name: %s - Github Username: %s \n Current Average: %d", students.usernameEnt.getName(), usernameEnt, students.usernameEnt.getGradeAverage());

    }
}
