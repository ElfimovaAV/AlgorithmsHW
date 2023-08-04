//Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

package seminar3;

public class SinglyLinkedList {
    Node head;


    public static SinglyLinkedList insert(SinglyLinkedList list, int value) {

        Node newNode = new Node(value);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        return list;
    }

    public static void printList(SinglyLinkedList list) {
        Node currentNode = list.head;

        System.out.print("SinglyLinkedList: ");

       while (currentNode != null) {
           System.out.print(currentNode.value + " ");

           currentNode = currentNode.next;
        }

        System.out.println();
    }


    // разворот выполняется рекурсией

    public void revert() {
        if (head != null && head.next != null) {
            // Node temp = head; -- если бы в приватной функции с двумя аргументами не обработали этого
            revert(head.next, head);
            // head.next = null; -- если бы в приватной функции с двумя аргументами не обработали этого
            // если нужно хранить tail, в последней операции добавить обмен head = tail;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    /**
     * Вложенный класс предназначен для реализации элемента.
     */
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
