package com.shaheer;

import java.util.Scanner;

public class DSA_ADT_PTACTISE {
    public static void main(String[] args) {
        MyArray ar = new MyArray(4);
        ar.setVal(4);
        ar.showVal();

        ar.insert(8,2);
        ar.showVal();

        ar.insert(14,5);
        ar.showVal();


        ar.insert(15,6);
        ar.showVal();

        ar.delete(1);
        ar.showVal();

        ar.delete(3);
        ar.showVal();


    }
}

class MyArray {
    Scanner in = new Scanner(System.in);
    int[] arr;

    MyArray(int size) {
        arr = new int[size];
    }

    void setVal(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " index value ");
            arr[i] = in.nextInt();
        }
    }

    void showVal() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void insert(int value, int index) {
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0, k = 0; i < arr1.length || k < arr.length; i++, k++) {
            if (i == index) {
                arr1[i] = value;
                k--;
            } else {
                arr1[i] = arr[k];
            }
        }
        arr = arr1;

    }

    void delete(int index) {
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr1.length || k < arr.length; i++, k++) {
                if (k == index) {
                    i--;
                    continue;
                } else {
                    arr1[i] = arr[k];
                }
            }
            arr = arr1;
        }



}