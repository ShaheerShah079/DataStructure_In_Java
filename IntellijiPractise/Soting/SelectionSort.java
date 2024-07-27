package com.shaheer;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={1,4,2,8,6,3};
        int smallest,temp;
        for (int i = 0; i < a.length-1; i++) {
            smallest =i;
            for (int j = i; j < a.length; j++) {
                if(a[smallest]>a[j]){
                    smallest =j;
                }
            }
            temp=a[i];
            a[i]=a[smallest];
            a[smallest]=temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
    }
}
