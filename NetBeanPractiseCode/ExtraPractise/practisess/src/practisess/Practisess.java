/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practisess;

/**
 *
 * @author Personal's PC
 */
public class Practisess
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int arr[]={1,4,6,1,8,6,7,9};
            int count=0;
        for (int i = 0; i < arr.length; i++) 
        {
            
            int val=arr[i];
            System.out.println("start i with i: "+i +" and element "+arr[i]);
            for (int j = i+1; j < arr.length-count; j++) 
            {
                System.out.println("start j with j: "+j +" and element "+arr[j]);
              if(arr[i]==arr[j])  
              {
                  System.out.println("elemnt "+arr[j]+" at index "+j+" is deleted  ");

                  count++;
                  for (int k =j; k < arr.length-1; k++)
                  {
                    arr[k]=arr[k+1] ;
                  }
                  j--;
                 
                  
              }
  
              }
            }
        System.out.println(count);
        for (int i = 0; i <= (arr.length-1)-count; i++) 
        {
            System.out.print(arr[i]+" ");   
        }

    }
    
}
