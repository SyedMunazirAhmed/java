import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    // function to move all zeros to end
    public static void moveZeros(Node head) {
        Node curr = head;
        Node zeroPtr = null;

        while (curr != null && curr.data != 0) {
            curr = curr.next;
        }
        zeroPtr = curr;

        // if no zeros found, return
        if (zeroPtr == null) {
            return;
        }

        // move all zeros to the end
        while (curr != null) {
            if (curr.data != 0) {
                zeroPtr.data = curr.data;
                curr.data = 0;
                zeroPtr = zeroPtr.next;
            }
            curr = curr.next;
        }
    }

    // function to print linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        Node tail = null;

        // read input number as string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        // create linked list from input number
        for (char c : input.toCharArray()) {
            int digit = c - '0';
            Node newNode = new Node(digit, null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // move zeros to end
        moveZeros(head);

        System.out.print("After Moving zeroes to end : ");
        printList(head);
        sc.close();
    }
}
