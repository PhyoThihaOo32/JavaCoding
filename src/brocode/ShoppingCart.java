package brocode;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        //shopping cart program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.println("How is the price for each? ");
        price = scanner.nextDouble();

        System.out.println("How many would you be buying? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item);
        System.out.println("Your total would be " + total + " " + currency);




        scanner.close();
    }
}
