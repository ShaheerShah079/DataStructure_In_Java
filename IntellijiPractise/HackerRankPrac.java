package com.shaheer;

import java.util.Scanner;

public class HackerRankPrac {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a[][]=new int[in.nextInt()][];
//        for (int i=0;i<a.length;i++){
//            a[i]=new int[in.nextInt()];
//            for (int j=0;j<a[i].length;j++){
//                a[i][j]=in.nextInt();
//            }
//        }
//        int b[][]= new int [in.nextInt()][2];
//        for(int i=0;i<b.length;i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                b[i][j] = in.nextInt();
//            }
//        }
//            for (int k= 0; k < b.length; k++) {
//                boolean flag=true;
//                for (int i = 0; i < a.length; i++) {
//
//                    for (int j = 0; j < a[i].length; j++) {
//                        if (i == (b[k][0]-1) && j == (b[k][1])-1) {
//                            System.out.println(a[i][j]);
//                            flag = false;
//                            break;
//                        }
//                    }
//                }
//                if (flag) {
//                    System.out.println("ERROR!");
//                }
//            }

        Scanner in = new Scanner(System.in);
        int len=in.nextInt();
        MyList<Integer> l = new  MyList<>(12*len);
        for(int i=0;i<len;i++){
          l.insertAtEnd(in.nextInt());
        }
        String q;
        int b= in.nextInt();
        for (int i = 0; i < b; i++) {
            q=in.next();
            switch(q) {
                case "Insert":
                    int pos=in.nextInt();
                    int el=in.nextInt();
                  l.insert(el,pos+1);
                    break;
                case "Delete":
                    l.delete(in.nextInt()+1);
                    break;

            }
        }
        l.display();

    }
}
class MyList<DT> {
    DT [] a;
    int size;
    MyList(int n){
        a=(DT[])new Object[n];
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==a.length;
    }

    void insertAtEnd(DT el){
        if(isFull()){
            System.out.println("Array is full");
        }
        else{
            a[size]=el;
            size++;
        }
    }
    void insertAtFirst(DT el){
        if(isFull()){
            System.out.println("Array is full");
        }
        else{
            for(int i=size;i>=1;i--){
                a[i]=a[i-1];
            }
            a[0]=el;
            size++;
        }
    }
    void insert(DT el,int pos){
        if(isFull()){
            System.out.println("Array is full");
        }
        else if((pos-1)>size){

            System.out.println("invalid position");
        }
        else{
            for(int i=size;i>=pos;i--){
                a[i]=a[i-1];
            }
            a[pos-1]=el;
            size++;
        }
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println("");
    }

    DT deleteAtEnd(){
        if(isEmpty()){
            System.out.println("List is empty");
            return (DT)"0";
        }
        else{
            size--;
        }
        return a[size];
    }
    DT deleteAtFirst(){
        DT temp;
        if(isEmpty()){
            System.out.println("List is empty");
            return (DT)"0";
        }
        else{
            temp=a[0];
            for(int i=0;i<size-1;i++){
                a[i]=a[i+1];
            }
            size--;

        }
        return temp;
    }
    DT delete(int pos){
        DT temp;
        if(isEmpty()){
            System.out.println("List is empty");
            return (DT)"0";
        }
        else if(pos>size||pos<1){
            System.out.println("Invalid index");
            return (DT)"0";
        }
        else{
            temp=a[pos-1];
            for(int i=pos-1;i<size-1;i++){
                a[i]=a[i+1];
            }
            size--;
        }
        return temp;
    }
    void update(int pos,DT el){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else if(pos>size||pos<1){
            System.out.println("Invalid index");
        }
        else{
            a[pos-1]=el;
        }
    }
    void copy(MyList l){
        for(int i=0;i<this.size;i++){
            l.insertAtEnd(a[i]);
        }
    }
    int length(){
        return size;
    }




}
