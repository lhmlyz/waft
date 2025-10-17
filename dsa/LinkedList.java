public class LinkedList {

    void main () {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node current = head;
        while (current != null) {
            IO.println(current.data);
            current = current.next;
        }
    }

    class Node {
        int data;
        Node next;

        public Node () {
        }

        public Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node (int data) {
            this.data = data;
            this.next = null;
        }

        // insert_at_beginning
        // insert_at_end
        // search
        // edit
        // traverse
        // delete
    }

}