package labmidzakaullah;

public class Q2
{
    public static void main(String[] args)
    {
        int[][]a1={{1,2,3},{4,5,6},{7,8,9}};
        int [][]a2=new int[a1.length][a1.length];
        arrayCopyInReverse(a1,a2);
        for (int i = 0; i < a2.length; i++)
        {
            for (int j = 0; j <a2.length; j++)
            {
                System.out.print(a2[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
    static void arrayCopyInReverse(int[][] source_array,int [][] target_array){
        for (int i = 0; i < source_array.length; i++)
        {
            for (int j = 0; j < source_array.length; j++)
            {
             target_array[source_array.length-i-1][source_array.length-j-1]=source_array[i][j];
            }
        }
    }
   
}
