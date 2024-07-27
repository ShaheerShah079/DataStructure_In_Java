package com.shaheer;

public class DynamicQeueMain {
    public static void main(String[] args) {
        MyDynamicQeue l = new MyDynamicQeue();
        MyDynamicQeue l1 = new MyDynamicQeue();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l.remove());
        System.out.println(l.remove());
        System.out.println(l.remove());
        System.out.println("Peek "+l.peek());
        l.copy(l1);
        l.add(6);
        l.add(7);
        System.out.println("l length "+l.length());
        System.out.println("l is");
        while(!l.isEmpty()){
            System.out.print(l.remove()+"  ");
        }

        System.out.println("l1 length "+l1.length());
        System.out.println("l1 is");
        l1.clear();
        while(!l1.isEmpty()){
            System.out.print(l1.remove()+"  ");
        }
    }
}
class MyDynamicQeue{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    Node tail;
    int top;
    MyDynamicQeue(){
        head =null;
        tail=null;
        top=-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void add(int item){
        Node n = new Node(item);
        if(isEmpty()){
            head=n;
            tail=n;
            top++;
        }
        else{
            tail.next=n;
            tail=n;
            top++;
        }

    }
    int remove(){
        int temp=0;
        if(isEmpty()){
            System.out.println("list is empty");
        }
        else if(top==0) {
            temp=head.data;
            head =null;
            tail=null;
            top=-1;
        }
        else{
            temp=head.data;
            head=head.next;
            top--;
        }
        return temp;
    }

    int peek(){
        int temp=0;
        if(isEmpty()){
            System.out.println("list is empty");
        }
        else{
            temp=head.data;
         }
        return temp;
    }
    void clear(){
        head =null;
        tail=null;
        top=-1;
    }
    int length(){
        return top+1;
    }
    void copy(MyDynamicQeue l){
        Node p=head;
        for (int i = 0; i < top+1; i++) {
            l.add(p.data);
            p=p.next;
        }
    }
}
