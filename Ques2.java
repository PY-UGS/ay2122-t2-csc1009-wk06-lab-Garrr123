package Week6;
import java.util.*;

// Java Program to Swap Two Elements in a LinkedList
class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class Link {
    Node head; // head of list

    // Function to swap Nodes x and y in
    // linked list by changing links
    public void swapNodes(int x, int y) {
        // Nothing to do if x and y are same
        if (x == y)
            return;
        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = head;
        for(int i = 0; i < x; i++) {
            prevX = currX;
            currX = currX.next;
        }

        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        for(int i = 0; i < y; i++) {
            prevY = currY;
            currY = currY.next;
        }
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;

        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else // make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // Function to add Node at beginning of list.
    public void push(int new_data) {
        // 1. alloc the Node and put the data
        Node new_Node = new Node(new_data);

        // 2. Make next of new Node as head
        new_Node.next = head;

        // 3. Move the head to point to new Node
        head = new_Node;

    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }
}

public class Ques2 {

    public static void main(String[] args) {

        Link linkedList = new Link();
        for(int i = 11; i >0; i = i - 2) {
            linkedList.push(i);
        }

        System.out.println("Linked List Before Swapping :-");
        linkedList.printList();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first index  : ");
        int a = input.nextInt();
        System.out.println("Enter second index  : ");
        int b = input.nextInt();
        linkedList.swapNodes(a, b);

        System.out.println("Linked List After Swapping :-");
        linkedList.printList();



    }
}
