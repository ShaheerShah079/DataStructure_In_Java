/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicatesearchingusingtree;

/**
 *
 * @author Personal's PC
 */
public class DuplicateSearchingUsingTree
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
      
        
        
        // TODO code application logic here
        int [] x = {14,15,4,9,7,18,3,5,16,20,17};
        Node root =new Node(x[0]);
         for (int i = 1; i < x.length; i++)
        {
            Search.insert(root, x[i]);
        }

         Search.inOrder(root);
         System.out.println("");
         Search.levelOrder(root);
         System.out.println("");
         
//         for (int i = 0; i <= 29; i++)
//        {
//             Node temp=Search.findValue(root, i);
//         if(temp==null)
//             System.out.println("Value not found");
//         else
//             System.out.println("Value is "+temp.data);
//        }
//        System.out.println("End");


//         for (int i = 0; i <= 29; i++)
//        {
//             int temp=Search.depth(root, i);
//         if(temp==-1)
//             System.out.println("Value not found");
//         else
//             System.out.println("depth is "+temp);
//        
          Search.delete(root, 3);
          Search.inOrder(root);
//            System.out.println("");
        }
         
    }
    













