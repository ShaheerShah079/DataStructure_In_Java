
package practises;

import java.util.Scanner;


/**
 *
 * @author Personal's PC
 */
public class Practises
{

    /**
     * @param args the command line arguments
     */
   public static void main(String args[] ) {

//         123456   n=6,i=1     
//         12345    n=6,i=2      
//         1234     n=6,i=3       
//         123      n=6,i=2
//         12       n=6,i=1
//         1        n=6,i=6      
//
//          |     1   i=1     j=1                  an=a1+(n-1)d; 
//          |    12   i=2     j=2
//          |   123   i=3     j=3
//          |  1234   i=4     j=4
//          | 12345   i=5     j=5
//          |123456   i=6     j=6
//                  
//           1
//           12
//           123
//           1234
//           123456
//           1234567
//
//           |123456  i=1      j=6   
//           | 12345  i=2      j=5
//           |  1234   i=3     j=4
//           |   123  i=4      j=3
//           |    12   i=5     j=2  
//           |     1   i=6     j=1
                   

//          |1234567    n=4 ,i=4        j=7      sp=0
//          | 12345     n=4, i=3        j=5      sp=1
//          |  123      n=4 ,i=2        j=3      sp=2                        
//          |   1       n=4 ,i=1        j=1      sp=3                       





      
//          |   1       n=4 ,i=1   sp=3        4-i =3
//          |  123      n=4 ,i=2   sp=2        
//          | 12345     n=4,i=3    sp=1
//          |1234567    n=4,i=4    sp=0 
//          | 12345     n=4, i=3        j=5      
//          |  123      n=4 ,i=2        j=3                              
//          |   1       n=4 ,i=1        j=1  
     

//          |   1
//          |  12
//          | 1234      
//          |123456 

//           |1234567
//           |123456  i=1      j=6   
//           |12345  i=2      j=5
//           |1234   i=3     j=4
//           |123  i=4      j=3
//           |12   i=5     j=2  
//           |1   i=6     j=1


    
//          |123456789   n=4,i=4         j=9      sp=0
//          | 1234567    n=4 ,i=1        j=7      sp=1
//          |  12345     n=4, i=2        j=5      sp=2
//          |   123      n=4 ,i=3        j=3      sp=3                        
//          |    1       n=4 ,i=4        j=1      sp=4                       

         
//     int n=12;
//       for (int i = 0; i <=n/2; i++)
//       {
//           
//           System.out.println(i+" "+(n-i));
//       }
       


       
//       int arr[]={2,4,7,3,6,8,51,8,9,12,23};
//       int max=0;
       
//       for (int i = 0; i < arr.length; i++)
//       {
//           if(arr[max]==arr[i]){
//              
//                work to do  
//              break;            
//           }
//           
//       }



//       for (int i = 1; i < arr.length; i++)
//       {
//           if(arr[max]<arr[i]){
//             max=i;   
//           }
//           
//       }
//       work to do        
//       System.out.println(arr[max]);
       
       
//      int temp;
//       for (int i = 0; i < (arr.length/2); i++)
//       {
//         temp=arr[i];
//         arr[i]=arr[(arr.length-1)-i];
//         arr[(arr.length-1)-i]=temp;
//       }



//int arr[]={1,4,6,1,6,6,7,9};
//
//        int count=0;
//        for (int i = 0; i < arr.length; i++) 
//        {
//            
//            int val=arr[i];
////            System.out.println("start i with i: "+i +" and element "+arr[i]);
//            for (int j = i+1; j < arr.length-count; j++) 
//            {
////                System.out.println("start j with j: "+j +" and element "+arr[j]);
//              if(arr[i]==arr[j])  
//              {
////                  System.out.println("i is "+i+" and j is "+j+" and element "+arr[j]);
//
//                  count++;
//                  for (int k =j; k < arr.length-1; k++)
//                  {
//                    arr[k]=arr[k+1] ;
//                  }
//                  j--;
//              }
//  
//              }
//            }
//        System.out.println(count);
//        for (int i = 0; i <= (arr.length-1)-count; i++) 
//        {
//            System.out.print(arr[i]+" ");   
//        }
//           
//          Scanner in = new Scanner(System.in);
//          int a,b;
//          System.out.println("enter 1 number");
//          a=in.nextInt();
//          System.out.println("enter 2 number");
//          b=in.nextInt();
//          int sum = a+b;
//          System.out.println("sum = "+sum);
//       
             


//       int g=Integer.parseInt();
      
       
       
      
//      int arr[]={2,3,2,4,3,4,5,6};
//      int count=0;
//       for (int i = 0; i <=arr.length-1-count; i++)
//       {
//           int val=arr[i];
//           for (int j = i+1; j <=arr.length-1-count; j++)
//           {
//             if(val==arr[j])  
//             {
//                 count++;
//                 int temp;
//                 temp=arr[j];
//                 arr[j]=arr[arr.length-count];
//                 arr[arr.length-count]=temp;
//                 j--;
//             }
//           }
//       }
//       System.out.println(arr.length-count);
      
       
//       int num=45;
//       int rem,binary=0,remMultiple=1;
//      while(num>0)
//      {
//          rem=num%2;
//          num=num/2;
//          binary=binary+(rem*remMultiple);
//          remMultiple=remMultiple*10;
//          
//          
//      }
//       System.out.println(binary);
       
       
//       int temp=0;
//       int a=2,b=3,n=4;
//       for (int i = 0; i < n; i++)
//       {
//           if(i==0)
//           {
//            temp=a+(int)(Math.pow(2, i)*b);
//           }
//           else{
//           temp=(int)(Math.pow(2, i)*b)+temp;
//           }
//           
//            System.out.println(temp);
//       }
        

//int [][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//       for (int i = 0; i < 3; i++)
//       {
//              int count=0;   
// for (int j = 0; j <=arr.length-1-count; j++)
//       {
//           int val=arr[i][j];
//           for (int k = j+1; k <=arr.length-1-count; k++)
//           {
//             if(val==arr[i][k])  
//             {
//                 count++;
//                 int temp;
//                 temp=arr[i][k];
//                 arr[i][k]=arr[i][arr[i].length-count];
//                 arr[i][arr[j].length-count]=temp;
//                 k--;
//             }
//           }
//       }
//        
//       }
       

//        int binary=1101,rem,mul=1,decimal=0;
//        while(binary>0)
//        {
//            rem=binary%10;
//           binary=binary/10;
//            rem=rem*mul;
//            mul=mul*2;
//            decimal=decimal+rem;
//            
//        }
//        System.out.println(decimal);
        
//         int []arr={1,0,1,1};
//         int sum=0;
//         for (int i = 0; i <=arr.length-1; i++)
//       {
//           sum=sum+(arr[arr.length-1-i]*(int)Math.pow(2, i));
//       }
//       System.out.println(sum);        


//int [][]arr={{1,2,1},{4,2,8},{5,6,8}};
//int sum=0;
//       for (int i = 0; i <=arr.length-1; i++)
//       {
//           for (int j = 0; j <=arr.length-1; j++)
//           {
//             sum=sum+arr[i][j];  
//           }
//           System.out.println("Sum of "+i+" row is: "+sum);
//           sum=0;
//       }

       

//int [][]arr1={{1,2},{3,2}};
//int [][]arr2={{2,4},{1,2}};
//int sum=0;
//       for (int k = 0; k < arr1.length; k++)
//       {
//           for (int i = 0; i <arr1.length; i++)
//           {
//               for (int j = 0; j < arr1.length; j++)
//               {
//                  // System.out.println(arr1[k][j]+"   "+arr2[j][i]);
//                   sum=sum+(arr1[k][j]*arr2[j][i]);
//               }
//               System.out.println(sum);
//               sum=0;
//           }
//       }



int arr1[]={8,5,3,10,2,6,1,9,7};
int max=arr1[0];
       for (int i = 1; i < arr1.length; i++)
       {
          if(max<arr1[i]) 
          {
              max=arr1[i];
          }
           
       }
       System.out.println("Maximum nmbr is: "+max);       
       int arr2[]=new int[max+1];
       for (int i = 0; i < arr1.length; i++)     
       {
           arr2[arr1[i]]=1;
       }
       int count=0;
       for (int i = 0; i < arr2.length; i++)
       {
         if(arr2[i]==1) 
         {
             arr1[count]=i;
             count++;
         }
       }
       
       for (int i = 0; i < arr1.length; i++)
       {
           System.out.print(arr1[i]+" ");
       }
       System.out.println("");








       
       
       
       
       
   }
   
}
//    public static Integer sum(Integer [] ints){
//        int sum=0;
//        for(int i=0;i<ints.length;i++){
//            System.out.println(sum);
//            sum+=ints[i];
//        }
//        return sum;
//    }
//    public static String sum(String [] ints){
//        String conc="";
//        for(int i=0;i<ints.length;i++){
//            System.out.println("hello");
//            conc+=ints[i];
//        }
//        return conc;
//    }
//
//        }
    