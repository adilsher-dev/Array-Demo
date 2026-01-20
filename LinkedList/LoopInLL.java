package LinkedList;

public class LoopInLL {
    static class Node{
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

    static boolean Loop(Node head){
        if(head == null){
            return false;
        }

        if(head.next == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
}


    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Cycle exists? " + Loop(head));

        // ---- Test Case 2: Create a Cycle ----
        head.next.next.next.next.next = head.next; // 50 -> 20

        System.out.println("Cycle exists? " + Loop(head));
    }
}
        
