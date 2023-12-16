import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        // Create a list to store to-do items
        ArrayList<String> toDoList = new ArrayList<>();

        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Items");
            System.out.println("4. Quit");

            // Get user choice
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add Item
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added: " + newItem);
                    break;

                case 2:
                    // Remove Item
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty. No items to remove.");
                    } else {
                        System.out.println("Current Items:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }

                        System.out.print("Enter the number of the item to remove: ");
                        int itemToRemove = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        if (itemToRemove >= 1 && itemToRemove <= toDoList.size()) {
                            String removedItem = toDoList.remove(itemToRemove - 1);
                            System.out.println("Item removed: " + removedItem);
                        } else {
                            System.out.println("Invalid item number. No item removed.");
                        }
                    }
                    break;

                case 3:
                    // View Items
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;

                case 4:
                    // Quit
                    System.out.println("Exiting the to-do list program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
