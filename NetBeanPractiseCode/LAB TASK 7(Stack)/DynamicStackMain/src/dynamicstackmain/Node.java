package dynamicstackmain;

public class Node<DT> {
    DT data;
    Node next;

    Node(DT data) {
        this.data = data;
        next=null;
    }
}
