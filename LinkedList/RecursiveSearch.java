package LinkedList;
public class RecursiveSearch {
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

    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }


        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    
    public static int findKey(int key){
        return helper(head, key);
    }
}
