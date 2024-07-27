package circulardoublylinklistmain;

public class Node<DT> {
        DT data;
       Node prev;
       Node next;
        Node(DT item) {
            data = item;
            prev = null;
            next = null;
        }
    }