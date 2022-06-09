import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Say something to Bob!");
        String userInput = sc.nextLine();
        
        
        // ends with question mark
        if (userInput.endsWith("?")) {
            System.out.println("sure");
            
        } else if ( userInput.endsWith("!")) {
            System.out.println("Woah, CHILL OUT!");
            
        } else if (userInput.trim().equals("")) {
            System.out.println("Fine! Bet that way!");

        } else {

        }

        //ends with exclamation mark
        
        
        //empty string
        
        // everything else




    }
}
