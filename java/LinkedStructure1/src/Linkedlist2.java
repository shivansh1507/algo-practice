public class Linkedlist2 {
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.next + " ");
            head = head.next;
        }
    }
}
