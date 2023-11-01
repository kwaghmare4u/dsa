package linkedlist;

public class ReverseLinkedList {

    private Node head;

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(100);

        System.out.println("-- Given linked list --");
        list.printLinkedList(list.head);
        System.out.println("\n-- Reverse linked list --");
        list.head = list.reverse(list.head);
        list.printLinkedList(list.head);
    }

    private Node reverse(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
//        85 15 4 20 100
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;

    }

    private void printLinkedList(Node node) {
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}