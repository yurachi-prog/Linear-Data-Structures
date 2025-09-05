package DS;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void perform(Scanner scanner) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("\n--- Stack Operations ---");
        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit Stack Operations");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = scanner.nextInt();
                    stack.push(val);
                    System.out.println("Pushed " + val + " into stack.\n");
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.\n");
                    } else {
                        int popped = stack.pop();
                        System.out.println("Popped: " + popped + "\n");
                    }
                    break;
                case 3:
                    System.out.print("Stack contents: ");
                    if (stack.isEmpty()) {
                        System.out.print("Empty\n");
                    } else {
                        for (int i = stack.size() - 1; i >= 0; i--) {
                            System.out.print(stack.get(i) + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting Stack Operations.\n");
                    return;
                default:
                    System.out.println("Invalid choice, try again.\n");
            }
        }
    }
}
