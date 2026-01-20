package LinkedList;

public class Palindrome {
    static class Node {
        int data;
        Node next;

        Node(){
            next = null;
        }

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }


    static boolean palindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }

        //find middle of the linkedlist
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseList(slow.next);
        Node first = head;
        Node second = newHead;

        while(second != null){
            if(first.data != second.data){
                reverseList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseList(newHead);
        return true;
    }
    static Node reverseList(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        Node temp = head;
        Node front = null;
        Node curr = head;

        while(curr != null){
            temp = temp.next;
            curr.next = front;
            front = curr;
            curr = temp;
        }
        return front;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(1);

        boolean ans = palindrome(head);



        System.out.println("This is the ans:"+ans);


        
    }
}
