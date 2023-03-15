public class App {
    public static void main(String[] args) throws Exception {

        // CustomLinkedList list = new CustomLinkedList();
        CustomDoublyLinkedLIst dl = new CustomDoublyLinkedLIst();

        dl.insertAtBeginning(9);
        dl.insertAtBeginning(12);
        dl.insertAtBeginning(44);
        dl.insertAtBeginning(1);
        dl.insertAtBeginning(111);
        dl.insertAtBeginning(211);
        dl.insertAtLast(999);
        dl.display();

    }
}
