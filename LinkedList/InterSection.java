package LinkedList;

public class InterSection {
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

    static Node getIntersection(Node headA,Node headB){
        if(headA == null || headB == null){
            return null;
        }

        Node temp1 = headA;
        Node temp2 = headB;

        while(temp1!=temp2){

            if(temp1!=null){
                temp1 = temp1.next;
            }
            else{
                temp1 = headB;
            }

            if(temp2!=null){
                temp2 = temp2.next;
            }
            else{
                temp2 = headA;
            }
        }
        return temp1;
    }


    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        
        Node head2 = new Node(9);
        head2.next = new Node(10);

        
        Node common = new Node(4);
        common.next = new Node(5);

        
        head1.next.next.next = common;   
        head2.next.next = common;         

        Node intersect = getIntersection(head1, head2);

        if (intersect != null)
            System.out.println("Intersection at node with data: " + intersect.data);
        else
            System.out.println("No intersection");
    }
}
        