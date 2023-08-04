package seminar3;

import seminar3.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list = SinglyLinkedList.insert(list, 1);
        list = SinglyLinkedList.insert(list, 2);
        list = SinglyLinkedList.insert(list, 3);
        list = SinglyLinkedList.insert(list, 4);
        list = SinglyLinkedList.insert(list, 5);
        list = SinglyLinkedList.insert(list, 6);
        list = SinglyLinkedList.insert(list, 7);
        list = SinglyLinkedList.insert(list, 8);

        SinglyLinkedList.printList(list);

        list.revert();

        SinglyLinkedList.printList(list);
    }

}
