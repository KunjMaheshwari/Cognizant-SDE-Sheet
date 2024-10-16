package LinkedList;
public class Reverse {
    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void printReversedLL(){
        // 3 variables and 4 step process
        Node prev = null;
        Node curr = tail =  head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}

// Time complexity of this code is O(N);
