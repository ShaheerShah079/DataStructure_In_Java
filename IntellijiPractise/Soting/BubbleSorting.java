package com.shaheer;

public class BubbleSorting {
    public static void main(String[] args) {
        int a[]={8,2,4,3,1,9,7};
        int temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < (a.length-1)-i; j++) {
                if(a[j]>a[j+1]){
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }

    }
}
