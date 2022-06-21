import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        //1
        double pi = 3.14159;
        String piString = "The value of pi is approximately";
        System.out.format("The value of pi is approximately %.2f", pi);

        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int newInt = scanner.nextInt();
        System.out.println(newInt);

        System.out.println("Enter three words: ");
        for(int  i = 0; i < 3; i++) {
            String userInput = scanner.next();
            System.out.printf("%s%n", userInput);

            System.out.println("Enter a sentence: ");
            String inputSentence = scanner.nextLine();
            System.out.printf(inputSentence);

            System.out.println("What is the length of the classroom:");
            String length = scanner.nextLine();
            System.out.println("What is the width of the classroom:");
            String width = scanner.nextLine();
            int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) * 2;
            System.out.printf("The total perimeter of your classroom is %d%n", perimeter);
        }

    }
}
