public class App {
    public static void main(String[] args) throws Exception {

        CustomLinkedList list = new CustomLinkedList();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAtBeginning(4);
        list.insertAtBeginning(5);
        list.insertAtEnd(0);

        System.out.println(list.findNode(4));

    }
}
