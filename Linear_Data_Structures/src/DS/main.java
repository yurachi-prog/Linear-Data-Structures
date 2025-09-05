package DS;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Data Structure:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Linked List");
            System.out.println("4. Circular Linked List");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int dsChoice = scanner.nextInt();

            if (dsChoice == 5) {
                System.out.println("Exiting program.");
                break;
            }

            switch (dsChoice) {
                case 1:
                    stack.perform(scanner);
                    break;
                case 2:
                    queue.perform(scanner);
                    break;
                case 3:
                    LinkedList.perform(scanner);
                    break;
                case 4:
                    CircularLinkedList.perform(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
