package com.shaheer;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList<String> l = new DoublyLinkedList<>();
        DoublyLinkedList<String> l2 = new DoublyLinkedList<>();
        l.insertAtEnd("c");
        l.insertAtEnd("d");
        l.insertAtEnd("e");
        l.insertAtEnd("f");
        l.insertAtstart("b");
        l.insertAtstart("a");
        l.display();
        l.insertAt(3,"z");
        l.display();
        l.deleteAtStart();
        l.deleteAtEnd();
        l.display();
        l.daleteAt(3);
        l.display();
        l.daleteAt(2);
        l.display();
        l.update(2,"k");
        l.display();
        l.copy(l2);
        l.insertAtEnd("m");
        l.display();
        l2.display();
        System.out.println("length is "+l.length());
        l.clear();
        l.display();
        l2.display();

    }
}
class DoublyLinkedList<DT> {
    class Node<DT> {
        DT data;
        Node prev;
        Node next;

        Node(DT item) {
            data = item;
            prev = null;
            next = null;
        }
    }

    Node<DT> head;
    Node<DT> tail;
    int size;

    DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertAtstart(DT item) {
        Node<DT> n = new Node<>(item);
        if (isEmpty()) {
            head = n;
            tail = n;
            size++;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
            size++;
        }
    }

    void insertAtEnd(DT item) {
        Node<DT> n = new Node<>(item);
        if (isEmpty()) {
            head = n;
            tail = n;
            size++;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
            size++;
        }
    }

    void insertAt(int pos, DT item) {
        if (pos > size + 1 || pos < 1) System.out.println("Invalid position");
        else if (pos == 1) insertAtstart(item);
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
            p.next = null;
            head.prev = null;
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
        } else {
            temp = tail.data;
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
            size--;
        }
        return temp;
    }
    DT daleteAt(int pos){
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
    void copy(DoublyLinkedList l){
        Node<DT> temp = head;
        while(temp!=null){
            l.insertAtEnd(temp.data);
            temp=temp.next;

        }
    }
    int length() {
        return size;
    }
    void display(){
        Node p= head;
        for (;p!=null;) {
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println();
    }

}


