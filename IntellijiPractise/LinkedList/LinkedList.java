package com.shaheer;

public class LinkedList
{
    public static void main(String[] args)
    {
        MyLinkedList<String> l = new MyLinkedList<>();
        l.display();

        l.insertAtStart("h1");
        l.insertAtEnd("h2");
        l.insertAtEnd("h3");
        l.insertAtEnd("h4");
        l.insertAtEnd("h5");
        l.insertAtStart("h0");
        l.insertAt(3, "h45");
        l.display();
        MyLinkedList<String> l2 = new MyLinkedList<>();
        l.copy(l2);
        System.out.println("l2 after copy");
        l2.display();
        System.out.println(l.deleteATStart());
         l.display();
        System.out.println(l.deleteATEnd());
        l.display();
        System.out.println(l.deleteAT(1));
        l.display();
        l.update("hnew",3);
        l.display();

        l.update("hnew1",1);
        l.display();

//        MyLinkedList<Integer> l = new MyLinkedList<>();
//        l.insertAtStart(12);
//        l.display();
//        l.deleteATStart();
//        l.display();
//

    }

}

class MyLinkedList<DT>
{
    Node<DT> head;
    Node<DT> tale;
    int size;
    MyLinkedList(){
        head = null;
        tale = null;
        size=0;
    }
    class Node<DT>{
        DT data;
        Node next;
        Node(DT el){
            data = el;
            next=null;
        }
    }

    boolean isEmpty(){
        return head==null;
    }
    void insertAtStart(DT el){
        Node<DT> n = new Node(el);
        if(isEmpty()){
            head=n;
            tale=n;
            size++;

        }
        else{
            n.next=head;
            head=n;
            size++;
        }
    }

    void insertAtEnd(DT el){
        Node<DT> n = new Node(el);
        if(isEmpty()) {
            head = n;
            tale = n;
            size++;
        }
        else{
            tale.next=n;
            tale=n;
            size++;

        }
    }
    void insertAt(int pos,DT el){
        Node<DT> n = new Node(el);
        if(pos>size+1||pos<0){
            System.out.println("Invalid");
        }
        else if(pos==1){
            insertAtStart(el);
        }
        else{
            Node p=head;
            for(int i=1;i<pos-1;i++){
                p=p.next;
            }
            n.next=p.next;
            p.next=n;
            size++;
        }


    }
    void display(){
        Node p=head;
        for (int i = 1; i <=size; i++){
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println("");
    }

    DT deleteATStart(){
        DT temp;
        if(isEmpty()) {
            System.out.println("List is empty ");
            return (DT) "0";
        }
        else{
            temp=head.data;
            head = head.next;
            size--;
        }
        return temp;
    }

    DT deleteATEnd(){
        DT temp;
        if(isEmpty()) {
            System.out.println("List is empty ");
            return (DT) "0";
        }
        else if(head.next==null){
            temp=tale.data;
            deleteATStart();

        }
        else{
            Node p=head;
            temp=tale.data;
            for (int i=1;i<size-1;i++){
                p=p.next;
            }
            tale=p;
            tale.next=null;
            size--;
        }
        return temp;
    }
    DT deleteAT(int pos){
        DT temp;
        if(pos>size+1||pos<0) {
            System.out.println("Invalid");
            return (DT) "0";
        }
        else if(pos==1){
            temp=head.data;
            deleteATStart();
        }
        else{
            Node sl=head;
            Node l=head.next;
            for (int i=1;i<pos-1;i++){
                l=l.next;
                sl=sl.next;
            }
            temp=(DT)l.data;
            sl.next=l.next;
            size--;
        }
        return temp;
    }
    void update(DT el,int pos){
        if(pos>size||pos<0) {
            System.out.println("Invalid");
        }
        else{
            Node p=head;
            for (int i=1;i<pos;i++){
                p=p.next;
            }
            p.data=el;
        }
    }
    int length(){
        return size;
    }
    void clear(){
        size=0;
        head=null;
        tale=null;
    }
    void copy(MyLinkedList<DT> l){
        Node p=head;
        for (int i=1;i<=size;i++){
            l.insertAtEnd((DT)p.data);
            p=p.next;
        }
    }



    }

