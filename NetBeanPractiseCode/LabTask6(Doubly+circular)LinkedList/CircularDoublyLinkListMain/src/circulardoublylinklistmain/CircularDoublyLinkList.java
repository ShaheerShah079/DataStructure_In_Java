package circulardoublylinklistmain;

public class CircularDoublyLinkList<DT>
{
  
    Node<DT> head;
   Node<DT> tail;
    int size;

    CircularDoublyLinkList() {
        head = null;
        tail = null;
        size = 0;
    }
    boolean isEmpty() {
        return head == null;
    }

    void insertAtStart(DT item) {
        Node<DT> n = new Node<>(item);
        if (isEmpty()) {
            head = n;
            tail = n;
            tail.next=head;
            head.prev=tail;
            size++;
        }
        else {
            n.next = head;
            head.prev = n;
            head = n;
            tail.next=head;
            head.prev=tail;
            size++;
        }
    }

    void insertAtEnd(DT item) {
        Node<DT> n = new Node<>(item);
        if (isEmpty()) {
            head = n;
            tail = n;
            tail.next=head;
            head.prev=tail;
            size++;
        }
        else {
            tail.next = n;
            n.prev = tail;
            tail = n;
            tail.next=head;
            head.prev=tail;
            size++;
        }
    }

    void insertAt(int pos, DT item) {
        if (pos > size + 1 || pos < 1) System.out.println("Invalid position");
        else if (pos == 1) insertAtStart(item);
        else if (pos == size) insertAtEnd(item);
        else {
          Node<DT> n = new Node<>(item);
           Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next.prev = n;
            temp.next = n;
            n.prev = temp;
            size++;
        }
    }
    private int linearSearch(DT el){
        Node temp=head;
        int location=-1;
        for (int i = 1; i <=size; i++) {
            if(temp.data==el){
                location=i;
                break;
            }
            temp=temp.next;
        }
        return location;
    }
    void insertAfter(DT val,DT item){
        int pos=linearSearch(val);
        if(pos==-1){
            System.out.println("Element Not Found");
        }
        else{
            insertAt(pos+1,item);
        }
    }
    DT deleteAtStart() {
        DT temp;
        if (isEmpty()) {
            System.out.println("List is Empty");
            return (DT) "0";
        } else if (size == 1) {
            temp = head.data;
            head = null;
            tail = null;
            size--;
        } else {
            Node<DT> p = head;
            temp = head.data;
            head = head.next;
            tail.next=head;
            head.prev=tail;
            size--;
        }
        return temp;
    }

    DT deleteAtEnd() {
        DT temp;
        if (isEmpty()) {
            System.out.println("List is Empty");
            return (DT) "0";
        }
        else if (size == 1) {
            temp = head.data;
            head = null;
            tail = null;
            size--;
        }
        else {
            temp = tail.data;
            tail = tail.prev;
            tail.next.prev = null;
            tail.next=head;
            head.prev=tail;
            size--;
        }
        return temp;
    }
    DT deleteAt(int pos){
        DT temp;
        if(pos>size+1||pos<1){
            System.out.println("Invalid position");
            return (DT) "0";
        }
        else if(pos==1) temp=deleteAtStart();
        else if(pos==size+1) temp=deleteAtEnd();
        else{
            Node<DT> p=head;
            for (int i = 1; i <pos-1 ; i++) {
                p= p.next;
            }
            temp=(DT)p.next.data;
            p.next=p.next.next;
            p.next.prev=p;
            size--;
        }
        return temp;
    }
    DT deleteValue(DT el) {
        DT temp;
        int pos = linearSearch(el);
        if (pos == -1) {
            System.out.println("ELement not Found");
            return (DT) "0";

        }
        else{
            temp=deleteAt(pos);
        }
        return temp;
    }
    void update(int pos , DT data){
        if(pos>size+1||pos<1){
            System.out.println("Invalid position");
        }
        else{
            Node<DT> p=head;
            for (int i = 1; i <pos ; i++) {
                p=p.next;
            }
            p.data=data;
        }
    }
    void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    void copy(CircularDoublyLinkList<DT> l){
        Node<DT> temp = head;
        for(int i=1;i<=size;i++){
            l.insertAtEnd(temp.data);
            temp=temp.next;
        }
    }
    int length() {
        return size;
    }
    void display(){
        Node p= head;
        for(int i=1;i<=size;i++){
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println();
    }  
}
