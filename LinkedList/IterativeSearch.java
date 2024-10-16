package LinkedList;
public class IterativeSearch {
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

    public static int findKey(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }
}
