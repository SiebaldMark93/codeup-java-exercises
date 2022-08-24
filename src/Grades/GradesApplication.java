package Grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Student mark = new Student("Mark");
        Student jason = new Student("Jason");
        Student artemis = new Student("Artemis");
        Student athena = new Student("Athena");

        mark.addGrade(52);
        mark.addGrade(78);
        mark.addGrade(81);
        jason.addGrade(68);
        jason.addGrade(79);
        jason.addGrade(80);
        artemis.addGrade(85);
        artemis.addGrade(90);
        artemis.addGrade(78);
        athena.addGrade(95);
        athena.addGrade(91);
        athena.addGrade(82);

        HashMap<String, Student> Students = new HashMap<>();



    }

}
