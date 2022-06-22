package JavaAssessmentPractice;

public class Practice {

    public static int subtractTen(int number) {
        return number - 10;
    }

    public static double average(int[] numbersArray) {
        double total = 0;
        for(int number : numbersArray) {
            total += number;
        }
        return total / numbersArray.length;
    }

    public static void main(String[] args) {
        System.out.println(subtractTen(20));
    }
}
