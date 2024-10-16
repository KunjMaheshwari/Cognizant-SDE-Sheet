package LinkedList;
import java.util.*;

public class PrintLinkedList{
    public static class Node{
        int data;
        Node next;

        // constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    
    // add first
    public static void addFirst(int data){
        if(head == null){
            Node newNode = new Node(data);
            head = tail = newNode;
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Time complexity for printing the elements in linked list is O(N);
    public static void printSolution(){
        if(head == null){
            System.out.println("Linked List is Empty");
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        PrintLinkedList ll = new PrintLinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.printSolution();
        
    }
}