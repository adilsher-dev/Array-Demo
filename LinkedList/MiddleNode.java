package LinkedList;

public class MiddleNode {
    static class Node{
        int data;
        Node next;

        Node(){
        }

        Node(int data){
            this.data = data;
        }
        
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    static Node middleNode(Node head){
        if(head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node middle = middleNode(head);

        if(middle != null){
            System.out.println(+middle.data);
        }
    }
}
