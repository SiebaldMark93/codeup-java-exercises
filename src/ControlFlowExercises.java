//public class ControlFlowExercises {
//    public static void main(String[] args) {
//
//        //1 Loop Basics
//        int x = 5;
//        while (x <= 15) {
//            System.out.println("x is " + x);
//            x++;
//        }
//
//        //2
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            System.out.println(i);
//
//            //3
//            boolean willContinue = false;
//            do {
//                System.out.println("Please enter an integer");
//                Scanner sc = new Scanner(System.in);
//                int userInt = sc.nextInt();
////            System.out.println(userInt + " | " + userInt * userInt + " | " + Math.pow(userInt, 3));
////             write loop that starts at 1 and counts up to userInt
//                for (int i = 1; i <= userInt; i++) {
//                    System.out.println(i + " | " + i * i + " | " + (int) Math.pow(i, 3));
//                }
//
//                System.out.println("Do you want to enter another number? (y/n)");
//                String userResponse = sc.next();
//                if (userResponse.equalsIgnoreCase("y")) {
//                    willContinue = true;
//                } else {
//                    willContinue = false;
//                }
//
//            } while (willContinue);
//
//            //4
//            Scanner sc = new Scanner(System.in);
//
//            boolean anotherGrade = true;
//
//            do {
//                System.out.print("Please enter a numerical grade from 0 to 100 ");
//
//                int numericGrade = sc.nextInt();
//
//                if (numericGrade >= 88) {
//                    System.out.println("A");
//                } else if (numericGrade >= 80) {
//                    System.out.println("B");
//                } else if (numericGrade >= 67) {
//                    System.out.println("C");
//                } else if (numericGrade >= 60) {
//                    System.out.println("D");
//                } else {
//                    System.out.println("F");
//                }
//
//                System.out.print("Do you wish to enter a new grade? (y/n) ");
//
//                String userResponse = sc.next();
//
//                if (!userResponse.equalsIgnoreCase("y")) {
//                    anotherGrade = false;
//                }
//
//            } while (anotherGrade);
//
//
//        }
//    }
//}
