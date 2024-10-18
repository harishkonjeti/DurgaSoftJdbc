package data_structures;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public  void append(int value){
        if (getLength() == 0) {
            Node newNode = new Node(value);
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            Node newNode = new Node(value);
            this.tail.next = newNode;
            this.tail = newNode;
        }
        length++;
    }
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public Node removeLast(){
        if(length == 0){
            return null;
        }
        if(length == 1){
            Node temp = tail;
            tail = null;
            head = null;
            length--;
            return temp;
        }
        else {
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            Node val = tail;
            tail = temp;
            tail.next = null;
            length--;
            return val;
        }
    }

    public Node removeLastMethod() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
}
