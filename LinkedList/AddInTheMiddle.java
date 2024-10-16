package LinkedList;
public class AddInTheMiddle {
    // Node class
    public static class Node{
        int data;
        Node next;


        // Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add in the middle of Linked List
    //Time complexity in add in the middle of Linked List is O(N), however the adding of new element in linked list takes only O(1) time complexity.

    public static void add(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp = prev
        newNode.next = temp;
        temp.next = newNode;
    }
}
