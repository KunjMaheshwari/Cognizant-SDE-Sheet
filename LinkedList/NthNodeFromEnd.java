package LinkedList;
public class NthNodeFromEnd {
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

    public static void removeNthNode(int n){
        // (Size-nth+1)th node will be the nth node from the end.

        int size = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;
            return;
        }

        int i = 1;
        Node prev = head;

        while(i < (size-n)){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
}

// Time complexity of this code will be O(N);