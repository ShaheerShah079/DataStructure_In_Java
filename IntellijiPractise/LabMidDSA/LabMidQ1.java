package LabMidDSA;

public class LabMidQ1 {
    public static void main(String[] args) {


        SinglyLinkedList l = new SinglyLinkedList();
        l.insertAtEnd(2);
        l.insertAtEnd(6);
        l.insertAtEnd(8);
        l.insertAtEnd(7);
        l.insertAtEnd(1);
        System.out.println("Before swapping ");
        l.display();
        System.out.println("After swapping ");
        l.swap();
        l.display();

    }
}
class Node {
     int data;
     Node next;

    Node(int el) {
        data = el;
        next = null;
    }

}
class SinglyLinkedList {


    Node head;
    Node tail;
    int size;

    SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }
    void insertAtStart(int el){
       Node n = new Node(el);
        if(isEmpty()){
            head=n;
            tail=n;
            size++;
        }
        else{
            n.next=head;
            head=n;
            size++;
        }
    }
    void insertAtEnd(int el) {
      Node n = new Node(el);
        if (isEmpty()) {
            head = n;
            tail = n;
            size++;
        } else {
            tail.next= n;
            tail = n;
            size++;
        }
    }
    void swap(){
        Node secondTemp=head.next;
        Node secondLastTemp=head;
        int tempSwap;

        for(int i=2;i<=size-1;i++)
        {
            secondLastTemp=secondLastTemp.next;
        }
        tempSwap=secondLastTemp.data;
        secondLastTemp.data=secondTemp.data;
        secondTemp.data=tempSwap;
    }
    void display(){
        Node p=head;
        for (int i = 1; i <=size; i++){
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println("");
    }

    void copy_reverse(SinglyLinkedList newList){
        Node p=head;
        for (int i = 1; i <=size; i++) {
            newList.insertAtStart(p.data);
            p=p.next;
        }
        System.out.println("List copied!!!!!!");
    }
}