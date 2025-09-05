package DS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void perform(Scanner scanner) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("\n--- Queue Operations ---");
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit Queue Operations");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = scanner.nextInt();
                    queue.offer(val);
                    System.out.println("Enqueued " + val + " into queue.\n");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.\n");
                    } else {
                        int dequeued = queue.poll();
                        System.out.println("Dequeued: " + dequeued + "\n");
                    }
                    break;
                case 3:
                    System.out.print("Queue contents: ");
                    if (queue.isEmpty()) {
                        System.out.print("Empty\n");
                    } else {
                        for (int item : queue) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting Queue Operations.\n");
                    return;
                default:
                    System.out.println("Invalid choice, try again.\n");
            }
        }
    }
}
