
package socketprogrammingnew;


public class DoublyLinkedList {

    Node head, tail;
    int size;

    DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void insertAtStart(int item) {
        Node n = new Node(item);
        if (isEmpty()) {
            head = tail = n;
            head.pre = tail;
            tail.next = head;
        } else {
            n.next = head;
            n.pre = tail;
            head.pre = n;
            tail.next = n;
            head = n;
        }
        size++;
    }

    void insertAtEnd(int item) {
        Node n = new Node(item);
        if (isEmpty()) {
            head = tail = n;
            head.pre = tail;
            tail.next = head;
        } else {
            n.pre = tail;
            n.next = head;
            head.pre = n;
            tail.next = n;
            tail = n;
        }
        size++;
    }

    void insertAt(int pos, int item) {
        if (pos < 1 || pos > size + 1)
            System.out.println("Invalid Position");
        else {
            Node n = new Node(item);
            Node temp;
            if (pos == 1)
                insertAtStart(item);
            else if (pos == size + 1)
                insertAtEnd(item);
            else if (pos <= size / 2) {
                temp = head;
                for (int i = 1; i < pos - 1; i++)
                    temp = temp.next;
                temp.next.pre = n;
                n.next = temp.next;
                temp.next = n;
                n.pre = temp;
                size++;
            } else {
                temp = tail;
                for (int i = 1; i < (size - pos+1); i++)
                    temp = temp.pre;
                temp.pre.next = n;
                n.pre = temp.pre;
                n.next = temp;
                temp.pre = n;
                size++;
            }
        }
    }

    void display() {
        Node temp = head;
        for (int i = 1; i < size+1; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
