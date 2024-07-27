package com.shaheer;

public class FarooqAssignment2 {
    public static void main(String[] args) {
        Randomizer r = new Randomizer(10);
        r.insert(2);
        r.insert(7);
        r.insert(9);
        r.insert(6);
        r.insert(12);
        r.insert(29);
        r.insert(65);

        for (int value:r.arr) {
            System.out.print(value+"  ");
        }

        r.delete();
        r.delete();
        System.out.println();
        for (int value:r.arr) {
            System.out.print(value+"  ");
        }

    }
}
class Randomizer{
    int size;
    int arr[];
    Randomizer(int size){

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=-1;
        }
        this.size=0;
    }
    public void insert(int value){
        int n = (int) (Math.random()*(arr.length));
        if(arr[n]==-1){
            arr[n]=value;
            size++;
        }
        else{
            insert(value);
        }

    }
    public boolean isFill(){
        if(size==arr.length)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(size==0)
            return true;
        else
            return false;
    }
    public int delete(){
        int n = (int) (Math.random()*(arr.length));
        int val;
        if(arr[n]!=-1){
             val= arr[n];
            arr[n]=-1;
            size--;
            return val;
        }
        else
        {
            val=delete();
            return val;
        }
    }
}
