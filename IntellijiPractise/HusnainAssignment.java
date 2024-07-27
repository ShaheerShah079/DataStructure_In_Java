package com.shaheer;

import java.util.Random;

//public class HusnainAssignment {
//    public static void main(String[] args) {
//         Randomizer l = new Randomizer(5);
//         l.insert(1);
//        l.insert(2);
//        l.insert(3);
//        l.insert(-5);
//        l.insert(4);
//        l.insert(5);
//        l.insert(6);
//        l.delete();
//        l.delete();
//        l.delete();
//        l.delete();
//        l.delete();
//
//    }
//}
//
//class Randomizer{
//    int[]arr;
//    int size;
//    Random rand = new Random();
//    Randomizer(int n){
//        arr= new int[n];
//        size=0;
//    }
//    boolean isEmpty(){
//        return size==0;
//    }
//    boolean isFull(){
//        return size== arr.length;
//    }
//    void insert(int value){
//        int random = rand.nextInt(arr.length);
//        if(value<=0){
//            System.out.println("Only positive value is stored");
//        }
//        else if (isFull()) {
//            System.out.println("List is Full");
//        }
//        else if (arr[random] != 0) insert(value);
//        else {
//             System.out.println("Value inserted " + value + " at positon " + (random + 1));
//            arr[random] = value;
//            size++;
//        }
//    }
//
//    int delete(){
//      int temp=0;
//        int random =rand.nextInt(arr.length);
//      if(isEmpty()){
//          System.out.println("List is Empty");
//      }
//      else if(arr[random]==0) temp=delete();
//      else{
//          temp=arr[random];
//          System.out.println("Value deleted "+temp+" at positon "+(random+1) );
//          arr[random]=0;
//          size--;
//      }
//      return temp;
//    }
//
//}