package LinkedList;
import java.util.*;

public class Palindrome {
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

    // for palindrome we have to do 3 process
    // first - calculate the mid
    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // second - reverse the second half
    public static boolean isPalindrome(){
        // base case
        if(head == null || head.next == null){
            return true;
        }

        Node mid = middleNode(head);

        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // third compare the elements from the first half and the second half
        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);


        System.out.println(isPalindrome());

    }
}
