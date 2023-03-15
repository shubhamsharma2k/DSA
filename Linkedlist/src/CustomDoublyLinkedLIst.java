public class CustomDoublyLinkedLIst {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertAtBeginning(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertAtLast(int value) {
        Node node = new Node(value);

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;
    }

    public void insertAtPosition(int value, int index) {
        Node node = new Node(value);
        if (index == 0) {
            insertAtBeginning(value);
            return;
        }

        if (index == size) {
            insertAtLast(value);
            return;
        }

        Node prev = head;

        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        node.next = prev.next;
        prev.next = node;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ---> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void reverseDisplay() {
        Node last = null;
        Node temp = head;

        while (temp != null) {
            last = temp;
            temp = temp.next;
        }

        while (last != null) {
            System.out.print(last.value + "<--");
            last = last.prev;
        }
        System.out.println("START");
    }

}
