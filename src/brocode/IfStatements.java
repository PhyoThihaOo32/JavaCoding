package brocode;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🎂 Age Input
        System.out.print("🎂 Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume leftover newline

        // 🙋 Name Input
        System.out.print("🙋 Enter your name: ");
        String name = scanner.nextLine();

        // 🎓 Student Status Input
        System.out.print("🎓 Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.close();

        System.out.println("\n📋 --- User Summary ---");

        // 🧑‍💬 Name Check
        if (name.isEmpty()) {
            System.out.println("⚠️ You didn't enter your name.");
        } else {
            System.out.println("👋 Hello, " + name + "!");
        }

        // ⏳ Age Group Check
        if (age < 0) {
            System.out.println("👶 You haven't been born yet...");
        } else if (age == 0) {
            System.out.println("🍼 Welcome to the world, newborn!");
        } else if (age < 18) {
            System.out.println("🧒 You are a child.");
        } else if (age < 65) {
            System.out.println("🧑 You are an adult.");
        } else {
            System.out.println("🧓 You are a senior.");
        }

        // 📚 Student Status
        if (isStudent) {
            System.out.println("✅ You are a student. Keep learning! 📘");
        } else {
            System.out.println("📢 You should consider enrolling. 🎯");
        }

        System.out.println("\n✅ Program completed successfully!");
    }
}
