package labmidzakaullah;

public class Q7
{
    public static void main(String[] args)
    {
        int [][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if(i==j){
                  sum+=arr[i][j];  
                }
            }
        }
        System.out.println("sum of element in daignol is "+sum);
    }
}
