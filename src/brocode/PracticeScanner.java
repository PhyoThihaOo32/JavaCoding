package brocode;

import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String username = scanner.nextLine();

        System.out.println("Enter your age: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tell me your favourite color. ");
        String userFavColor = scanner.nextLine();

        System.out.println("What is the value of Pi? ");
        double userPrice = scanner.nextDouble();


        System.out.println("Hello " + username);
        System.out.println("You age: " + userAge);
        System.out.println("The price is: " + userPrice);

        // Common issue
        /* nextInt() and followed by nextLine(): has common error.
        after nextInt() the newline character \n is still in input buffer
        so nextLine() immediately read it as an empty line, without waiting for user input.
        add an extra scanner.nextLine() to consume the leftover newline before asking for the code.
         */


        scanner.close();
    }
}
