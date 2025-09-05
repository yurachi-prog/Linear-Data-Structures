package DS;

import java.util.Scanner;

public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    private static Node head = null;

    public static void perform(Scanner scanner) {
        System.out.println("\n--- Linked List Operations ---");
        while (true) {
            System.out.println("1. Insert at end");
            System.out.println("2. Delete at beginning");
            System.out.println("3. Display");
            System.out.println("4. Exit Linked List Operations");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at end: ");
                    int val = scanner.nextInt();
                    insertAtEnd(val);
                    System.out.println("Inserted " + val + " at end.\n");
                    break;
                case 2:
                    if (head == null) {
                        System.out.println("List is empty.\n");
                    } else {
                        int removed = deleteAtBeginning();
                        System.out.println("Deleted at beginning: " + removed + "\n");
                    }
                    break;
                case 3:
                    System.out.print("Linked List contents: ");
                    display();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting Linked List Operations.\n");
                    return;
                default:
                    System.out.println("Invalid choice, try again.\n");
            }
        }
    }

    private static void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    private static int deleteAtBeginning() {
        if (head == null) return -1;
        int val = head.data;
        head = head.next;
        return val;
    }

    private static void display() {
        if (head == null) {
            System.out.print("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
