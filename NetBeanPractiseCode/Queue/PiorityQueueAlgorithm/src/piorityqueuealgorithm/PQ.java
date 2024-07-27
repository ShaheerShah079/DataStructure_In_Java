
package piorityqueuealgorithm;

public class PQ
{
    int []arr;
    int size;
    PQ(int n){
        arr= new int[n+1];
        size=0;
    }
    void insertion(int el){
        if(size==arr.length-1)
            System.out.println("Full");
        else{
            arr[++size]=el;
            for (int i = size/2; i >0; i=i/2)
            {
             minHeapify(arr,i,size);  
            }
         
        }
    }
    int deletion(){
        int temp=-1;
        if(size==0)
            System.out.println("Empty");
        else{
            temp=arr[1];
            arr[1]=arr[size];
            size--;
           minHeapify(arr,1,size);
        }
        return temp;
    }
    
    void minHeapify(int[] arr,int parent ,int size){
        int left=2*parent,right=2*parent+1,swap,smallest=parent;
        if(left<=size&&arr[left]<arr[smallest])
            smallest=left;
        if(right<=size&&arr[right]<arr[smallest])
            smallest=right;
        
        if(smallest!=parent){
            swap=arr[smallest];
            arr[smallest]=arr[parent];
            arr[parent]=swap;
            minHeapify(arr,smallest,size);
        }
    }
    void Heapify(int[] arr,int size){
        for (int i = size/2; i > 0; i--)
        {
          minHeapify(arr,i,size);  
        }
    } 
    
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("");
    }
    
    
    
    
    
    
}
