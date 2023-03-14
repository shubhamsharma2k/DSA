public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertAtBeginning(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;

        }
        size++;
    }

    public void insertAtEnd(int value) {
        if (tail == null) {
            insertAtBeginning(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insertAtPosition(int value, int index) {
        Node node = new Node(value);
        if (index == 0) {
            insertAtBeginning(value);
            return;
        }

        if (index == size) {
            insertAtEnd(value);
            return;
        }

        Node prev = head;

        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        node.next = prev.next;
        prev.next = node;
    }

    public void deleteFirst() {
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return;
    }

    public void deleteLast() {

        if (size <= 1) {
            deleteFirst();
        }
        Node secondLast = head;
        for (int i = 0; i < size - 1; i++) {
            secondLast = secondLast.next;
        }

        tail = secondLast;
        tail.next = null;

    }

    public void deleteAtPosition(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
    }

    public Node findNode(int value) {
        if (value == head.value) {
            return head;
        }

        if (value == tail.value) {
            return tail;
        }

        Node temp = head;

        while (temp != null) {

            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ---> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
