import java.util.Scanner;

public class MadLibGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🎭 Introduction
        System.out.println("🎉 Welcome to the Mad Lib Game!");
        System.out.println("You'll help complete a silly story. Let's begin!\n");

        // 📥 User Inputs
        System.out.print("Enter an adjective (description): ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal or person): ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter another adjective (description): ");
        String adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verb1 = scanner.nextLine();

        System.out.print("Enter one last adjective (feeling or description): ");
        String adjective3 = scanner.nextLine();

        scanner.close();

        // 📝 Story Output
        System.out.println("\n📖 Here's your story!\n");
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and was " + verb1 + "!");
        System.out.println("I couldn’t believe it — I felt so " + adjective3 + "!");
        System.out.println("\n😂 Thanks for playing the Mad Lib Game!");

    }
}
