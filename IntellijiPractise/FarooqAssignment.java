package com.shaheer;

public class FarooqAssignment {
    public static void main(String[] args) {
        int []arr={4,2,5,7,8,3,71,24,6};
        System.out.println(ArrayUtility.findMaximum(arr,0,5));
        System.out.println(ArrayUtility.findMinimum(arr,5,arr.length-1));
        System.out.println(ArrayUtility.findMaximumPosition(arr,0,arr.length-1));
        System.out.println(ArrayUtility.findMinimumPosition(arr,0,arr.length-1));
        ArrayUtility.swap(arr,6,3);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }


    }
}
class ArrayUtility{
    public static int findMaximum(int [] Arr,int i,int j){
        int max=Arr[i];
        for(int k=i+1;k<=j;k++){
            if(Arr[k]>max){
                max=Arr[k];
            }
        }
        return max;
    }

    public static int findMinimum(int [] Arr,int i,int j){
        int min=Arr[i];
        for(int k=i+1;k<=j;k++){
            if(Arr[k]<min){
                min=Arr[k];
            }
        }
        return min;
    }

    public static int findMaximumPosition(int [] Arr,int i,int j){
        int max=i;
        for(int k=i+1;k<=j;k++){
            if(Arr[k]>Arr[max]){
                max=k;
            }
        }
        return max;
    }

    public static int findMinimumPosition(int [] Arr,int i,int j){
        int min=i;
        for(int k=i+1;k<=j;k++){
            if(Arr[k]<Arr[min]){
                min=k;
            }
        }
        return min;
    }

    public static void swap(int[] Arr,int i, int j){
        Arr[i]=Arr[i]+Arr[j];
        Arr[j]=Arr[i]-Arr[j];
        Arr[i]=Arr[i]-Arr[j];

    }

}