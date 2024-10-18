package data_structures;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(3);
        linkedList.append(6);
        linkedList.printList();
        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast());

        LinkedList linkedList1 = new LinkedList(2);
        linkedList1.append(3);
    }
}
