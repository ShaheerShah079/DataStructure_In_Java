package com.shaheer;

import java.util.Scanner;

public class DynamicStackMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DynamicStack<Integer> l = new DynamicStack<>();
        int choice;
        char check;
        do{
            System.out.println("Stack Operations\n    1. Push\n    2. Pop\n    3. Length\n    4. Clear\n    5. Display");
            System.out.print("Enter Your choice : ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push : ");
                    l.push(in.nextInt());
                    System.out.println("Number inserted");
                    break;
                case 2:
                    System.out.println("Pop element " + l.pop());
                    break;
                case 3:
                    System.out.println("Length of stack is " + l.length());
                    break;
                case 4:
                    System.out.println("List clear...");
                    l.clear();
                    break;
                case 5:
                    l.display();
                    break;
                default:
                    System.out.println("Enter correct choice");
            }
            System.out.print("Do you want to continue (Type y or n) : ");
            check = in.next().charAt(0);
        }while(check=='y');
    }
}
class DynamicStack<DT>{
private class Node<DT> {
    DT data;
    Node next;

    Node(DT data) {
        this.data = data;
        next=null;
    }
}

    Node top;
    int size;
    DynamicStack(){
        top = null;
        size=-1;
    }

    boolean isEmpty() {
        return size == -1;
    }

    void push(DT item ){
        Node n = new Node(item);
        if(isEmpty()){
            top=n;
            size++;
        }
        else{
            n.next=top;
            top = n;
            size++;
        }
    }
    DT pop(){
        DT temp=(DT)"0";
        if(isEmpty()) System.out.println("UnderFlow Stack is empty");
        else if(size==0){
            temp=(DT)top.data;
            top=null;
            size--;
        }
        else{
            temp=(DT)top.data;
            Node p=top;
            top = top.next;
            p.next=null;
            size--;
        }
        return temp;
    }
    DT peek(){
        DT temp=(DT)"0";
        if(isEmpty()) System.out.println("UnderFlow Stack is empty");
        else{
            temp=(DT)top.data;
        }
        return temp;
    }


    void clear(){
        top = null;
        size=-1;
    }
    int length(){
        return size+1;
    }

    void copy(DynamicStack l){
        class rec{
            void recursion(Node p){
                DT temp;
                if(p==null) return;
                else{
                    temp=(DT)p.data;
                    recursion(p.next);
                    l.push(temp);
                }
            }
        }
        new rec().recursion(top);
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        int length=size;
        System.out.println("-    -");
        for (int i = 1; i <=length+1; i++) {
            System.out.println("| "+pop()+" |");
        }
        System.out.println(" ____");


    }


}
