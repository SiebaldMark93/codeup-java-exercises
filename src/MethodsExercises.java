import java.sql.SQLOutput;
//
import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class MethodsExercises {

//        Basic Arithmetic
//
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//                Subtraction
//        Multiplication
//                Division
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//                Test your methods and verify the output.
//
//        Add a modulus method that finds the modulus of two numbers.
//
//                Food for thought: What happens if we try to divide by zero? What should happen?

//        System.out.println(add(1, 2));
//        System.out.println(subtract(8, 2));
//        System.out.println(multiply(7, 2));
//        System.out.println(divide(8, 2));
//        System.out.println(modulus(4, 2));
//    }
//
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtract(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int divide(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInt = sc.nextInt();

        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Reminder, Input not in range");
            return getInteger(min, max);
        }

    }

    public static long factorial(int num) {
        if (num ==1) return 1;
        return factorial(num -1) * num;
    }

    public static void promptUserForFactorials() {
        Scanner sc = new Scanner(System.in);
        String continueMessage;
        System.out.println("Factorial calculator");
        do {

            System.out.println("Choose a number to calculate?");
            int userInt = getInteger(1, 10);
            System.out.println("Factorial of " + userInt + " is " + factorial(userInt));

            System.out.println("Would you like to enter a number? (Please Enter 'yes' or 'no')");
            continueMessage = sc.nextLine();
        } while (continueMessage.equalsIgnoreCase("yes"));
    }

    public static int getRandomint(int min, int max) {
        return min + (int)(Math.random() * ((max - min) +1));
    }

    public static void diceRoll() {
        System.out.println("Let's roll some DICE!");
        System.out.println("Enter a number on dice. (1-6)");
        int noOfSidesOfDice = getInteger(1, 6);
        System.out.printf("You rolled %d and a %d",
                getRandomint(1, noOfSidesOfDice),
                getRandomint(1, noOfSidesOfDice));

    }



    public static void main(String[] args) {
//        System.out.println("Enter a  number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//
//        System.out.println("Entered: " + userInput);

//        System.out.println(factorial(1));
//        System.out.println(factorial(2));
//        System.out.println(factorial(3));
//        System.out.println(factorial(4));

//        promptUserForFactorials();

//        diceRoll();
    }

}


