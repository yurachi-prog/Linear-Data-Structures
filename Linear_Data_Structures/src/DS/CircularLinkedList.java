package DS;

import java.util.Scanner;

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    private static Node head = null;

    public static void perform(Scanner scanner) {
        System.out.println("\n--- Circular Linked List Operations ---");
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit Circular Linked List Operations");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = scanner.nextInt();
                    insert(val);
                    System.out.println("Inserted " + val + " into circular linked list.\n");
                    break;
                case 2:
                    if (head == null) {
                        System.out.println("List is empty.\n");
                    } else {
                        int removed = delete();
                        System.out.println("Deleted: " + removed + "\n");
                    }
                    break;
                case 3:
                    System.out.print("Circular Linked List contents: ");
                    display();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting Circular Linked List Operations.\n");
                    return;
                default:
                    System.out.println("Invalid choice, try again.\n");
            }
        }
    }

    private static void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    private static int delete() {
        if (head == null) return -1;
        if (head.next == head) {
            int val = head.data;
            head = null;
            return val;
        }
        Node temp = head;
        while (temp.next != head) temp = temp.next;
        int val = head.data;
        temp.next = head.next;
        head = head.next;
        return val;
    }

    private static void display() {
        if (head == null) {
            System.out.print("Empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}
