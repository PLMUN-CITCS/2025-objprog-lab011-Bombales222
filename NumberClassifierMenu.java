
		import java.util.Scanner;

public class NumberClassifierMenu {

    // Main method to run the menu-driven program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create scanner object for input
        boolean exit = false;  // Flag to control the menu loop

        // Start of the menu loop
        while (!exit) {
            // Display the menu
            System.out.println("=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = scanner.nextInt();  // Read user's choice

            // Switch statement to handle menu options
            switch (choice) {
                case 1:
                    classifyNumber(scanner);  // Call method to classify number
                    break;
                case 2:
                    printMultiplicationTable(scanner);  // Call method to print multiplication table
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");  // Exit message
                    exit = true;  // Set flag to true to exit the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-3).");
            }
        }

        scanner.close();  // Close scanner object when done
    }

    // Method to classify a number as positive, negative, or zero
    private static void classifyNumber(Scanner scanner) {
        System.out.print("Enter a number to classify: ");
        int number = scanner.nextInt();  // Get user input

        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println("It is an even number.");
        } else {
            System.out.println("It is an odd number.");
        }

        // Ask if user wants to return to the menu
        askReturnToMenu();
    }

    // Method to print multiplication table of a number
    private static void printMultiplicationTable(Scanner scanner) {
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();  // Get user input

        System.out.println("Multiplication Table for " + number + ":");
        
        // Loop through and print multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        askReturnToMenu();
    }

    // Method to ask user if they want to return to the menu
    private static void askReturnToMenu() {
        Scanner scanner = new Scanner(System.in);  // New scanner object for user input
        System.out.print("Do you want to return to the menu? (Y/N): ");
        char returnChoice = scanner.next().charAt(0);  
        if (returnChoice == 'Y' || returnChoice == 'y') {
            // Do nothing, return to the menu
        } else {
            System.out.println("Exiting the program. Goodbye!");
            System.exit(0);  
        }
    
    }
}