package com.shaheer;

public class StaticQeueMain {
    public static void main(String[] args) {
        MyStaticQeuee l = new MyStaticQeuee(5);
        MyStaticQeuee l1 = new MyStaticQeuee(3);
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
class MyStaticQeuee {
    int[] a;
    int front = -1;
    int rear = -1;
    int size;

    MyStaticQeuee(int n) {
        a = new int[n];
        rear = -1;
        front = -1;
        size = -1;
    }

    boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    boolean isFull() {
        return size == a.length - 1;
    }

    void add(int item) {
        if (isFull()) {
            System.out.println("Qeue is full");
        } else if (isEmpty()) {
            rear = 0;
            front = 0;
            size = 0;
            a[rear] = item;
//            System.out.println("else if Add item "+item +" At rear "+rear+" front is "+front);
        } else {
            rear = (rear + 1) % (a.length);
            a[rear] = item;
            size++;
//            System.out.println("else Add item "+item +" At rear "+rear+" front is "+front);
        }
    }

    int remove() {
        int temp = 0;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (front == rear) {
            temp = a[front];
            front = -1;
            rear = -1;
            size = -1;
        } else {
//            System.out.println("front is"+front);
            temp = a[front];
            front = (front + 1) % a.length;
            size--;
//            System.out.println("After front is"+front);
        }
        return temp;
    }

    int peek() {
        int temp = 0;
        if (isEmpty()) {
            System.out.println("List is empty");
        }
         else {
//            System.out.println("front is"+front);
            temp = a[front];
//              System.out.println("After front is"+front);
        }
        return temp;
    }
    void clear() {
        front = -1;
        rear = -1;
        size = -1;
    }

    int length() {
        return size + 1;
    }

    void copy(MyStaticQeuee l) {
        for (int i = front; i < front+size + 1; i++) {
            l.add(a[i]);
        }
    }
}