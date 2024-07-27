
package sortingalgorithms;

public class SortingAlgorithms
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        int [] arr = {32,3,5,7,19,14,11,13,17,35,37,39,14,40,20,30,21,28,23,25,24};
//        int [] arr =  {8,4,1,7,5};
//          int [] arr = {32,33,5,70,119,14,121,113,17,35,337,39,14,400,210,310,210,28,223,25,24};
//        int[] arr={8,10,6,1,2,4,3,9,7};
         HeapSort(arr);
         printArray(arr);





    }
    
      public static void HeapSort(int[] arr){
        int swap,size=arr.length-1;
        for (int i = (size-1)/2; i >=0; i--)
        {
            maxHeapify(arr,i,size);
        }
        while(size>0)
        {
            swap=arr[0];
            arr[0]=arr[size];
            arr[size]=swap;
            size--;
            maxHeapify(arr,0, size);
        }    
    }
    public static void maxHeapify(int[] arr ,int parent,int size){
        int left=2*parent+1;
        int right=(2*parent)+2;
        int largest=parent;
        if(left<=size&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<=size&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=parent){
         int swap=arr[largest];
         arr[largest]=arr[parent];
         arr[parent]=swap;
        maxHeapify(arr,largest,size);
        }
    }
    public static void QuickSort(int[] arr,int left,int right){
        if(left<right){
        int pivot=quick(arr,left,right);  
        QuickSort(arr,left,pivot-1);
        QuickSort(arr,pivot+1,right);
       }
    }
    
    public static int quick(int[]arr, int left,int right){
        int pivot = arr[left],swap;
        int i=left+1,j=right;
        while(i<=j){
            while(i<=right&&arr[i]<=pivot){
                arr[i-1]=arr[i];
                i++;
            }
            while(j>left&&arr[j]>=pivot){
                j--;
            }
            if(i<=j){
               swap=arr[j];
               arr[j]=arr[i];
               arr[i]=swap;
            }
        }
        arr[j]=pivot;
        
        return j;
    }
    
    public static void MergeSort(int[] arr,int left,int right){
        if(left<right){
           int mid = (left+right)/2;
           MergeSort(arr,left,mid);
           MergeSort(arr,mid+1,right);
           Merge(arr,left,mid,right);
        }
    }
    public static void Merge(int[] arr, int left,int mid ,int right){
        int[] tempArray=new int[right-left+1];
        int i=left,j=mid+1,size=0;
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                tempArray[size]=arr[i];
                size++;
                i++;
            }
            else{
                tempArray[size]=arr[j];
                size++;
                j++;
            }
        }
        while(i<=mid){
           tempArray[size]=arr[i];
                size++;
                i++;  
        }
        
        while(j<=right){
           tempArray[size]=arr[j];
                size++;
                j++;  
        }
        
        for (int k = 0; k < tempArray.length; k++)
        {
            arr[left+k]=tempArray[k];
        }    
    }
    
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("");
    }
        
    public static void bubbleSort(int []arr){
        int swap;
        for (int i = arr.length-1; i >=1 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if(arr[j+1]<arr[j]){
                    swap=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=swap;
                }
            }
        }
    }
    
    public static void selectionSort(int []arr){
        int min,swap;
        
        for (int i = 0; i < arr.length; i++)
        {
            min=i;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            swap=arr[min];
            arr[min]=arr[i];
            arr[i]=swap;
        }
    }
    
    public static void insertionSort(int[] arr){
        int j,key;
        for (int i = 1; i < arr.length; i++)
        {
            j=i-1;
            key=arr[i];
            while(j>=0&&(arr[j]>key)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    
    public static void countSort(int[] arr){
        int [] tempArray= new int[maxNumber(arr)+1];
        int size=0;
        for (int i = 0; i < arr.length; i++)
        {
            tempArray[arr[i]]++;
        }
        for (int i = 0; i < tempArray.length; i++)
        {
                while(tempArray[i]!=0){
                    arr[size]=i;
                    size++;
                    tempArray[i]--;
                }
            
        }
    }
    public static int maxNumber(int []arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
}
