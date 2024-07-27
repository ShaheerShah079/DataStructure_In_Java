package labmidzakaullah;

public class Q6
{
    public static void main(String[] args)
    {
        int a[]={41,12,24,16,31,13,56,20,33,-18};
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
