package LinkedList;

public class NodeObject {
    public static void main(String[] args){
        Node head = new Node(5);
        
        Node secondData = new Node(6);

        Node thirdData = new Node(7);

        Node fourthData = new Node(8);

        head.next = secondData;
        secondData.next = thirdData;
        thirdData.next = fourthData;


        // These are the address which in stack memory
        // System.out.println(head.next);
        // System.out.println(head.next);
        // System.out.println(secondData);
        // System.out.println(thirdData);
        // System.out.println(fourthData);

        printLinkedList(head);

    }

    public static void printLinkedList(Node head){

        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data);

        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

        // System.out.println(head);
    }
}

