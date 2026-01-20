package LinkedList;

public class ReverseLinlkedList {
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

    static Node ReverseLL(Node head){
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

    static void printList(Node head){
        while(head!= null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original:");
        printList(head);

        head = ReverseLL(head);

        System.out.println("reversed:");
        printList(head);
    }
}

