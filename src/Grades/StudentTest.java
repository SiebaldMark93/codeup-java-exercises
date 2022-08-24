package Grades;

public class StudentTest {
    public static void main(String[] args) {
        Student Mark = new Student("Mark");
        Mark.addGrade(60);
        Mark.addGrade(75);
        Mark.addGrade(83);

        System.out.println(Mark.getGradeAverage());
    }

}
