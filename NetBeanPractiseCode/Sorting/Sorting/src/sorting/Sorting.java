package sorting;

public class Sorting
{

    public static void main(String[] args)
    {
        // TODO code application logic here
//        int [] a ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48
//                ,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100
//        ,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148
//                ,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,
//                191,192,193,194,195,196,197,198,199};
        
        int[] a1 ={18,5,3,6,2,8,9,11,14,40,34,35,23,28};
        quickSort(a1, 0, a1.length - 1);
        printArray(a1);
    }
    
    public static void quickSort(int []a,int left ,int right){
        //Base Case
        if(left>=right){
            return; 
        }          
        
        int pivot =a[left];
        int i=left+1,j=right,swap;
        while(i<=j){
            while(i<=right&&pivot>a[i]) {
                a[i-1]=a[i];
                i++;
                
            }
            while(j>=left&&pivot<a[j]) {
                j--;
            }
            if(i<j){
                swap=a[i];
                a[i]=a[j];
                a[j]=swap;
            }
        }
        a[j]=pivot;
        quickSort(a,left,j-1);
        quickSort(a,j+1,right);
    }

    public static void mergeSort(int[] a, int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a,left,mid,right);
        }
    }

    public static void merge(int[] a, int left, int mid, int right)
    {
        int i = left, j = mid + 1,k=0;
        int newArray[] = new int[right-left+1];
      
        while (i <= mid && j <= right)
        {
            if (a[i] <= a[j])
            {
                newArray[k++] = a[i++];
            }
            else
            {
                newArray[k++] = a[j++];
            }
        }
        if(j<=right){
            i=j;
            mid=right;
        }
         while(i<=mid){
            newArray[k++]=a[i++];
       
         }
         
        for (int l = 0; l <newArray.length; l++)
        {
            a[l+left]=newArray[l];
        }
    }

    public static void printArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] a)
    {
        int swap;
        for (int i = a.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }
    }

    public static void selectionSort(int[] a)
    {
        int min, swap;
        for (int i = 0; i < a.length - 1; i++)
        {
            min = i;
            for (int j = i; j < a.length; j++)
            {
                if (a[j] < a[min])
                {
                    min = j;
                }
            }
            swap = a[min];
            a[min] = a[i];
            a[i] = swap;
        }
    }

    public static void insertionSort(int[] a)
    {
        int j, key;
        for (int i = 1; i < a.length; i++)
        {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

}
