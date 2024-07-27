
package binarysearchtreealgorithm;

public class BinarySearchTreeAlgorithm
{
    public static void main(String[] args)
    {
        BST b = new BST();
//        int []x={14,15,4,9,7,18,3,16,26,17,5};
////        int []x={14,15,18,16,26,17};
//        for (int i = 0; i < x.length; i++)
//        {
//            b.insert(x[i]);
//           
//        }
//        Node root=b.getRoot();
//        b.inOrder(root);
////        System.out.println("");
////        System.out.println("height is "+b.height(root.left.left));
//        b.insertionRec(root,12);
//        b.preOrder(root);




         int[]x={79,47,76,53,75,56,90,40,63,59};
         Node root=new Node(x[0]);
        for (int i = 1; i < x.length; i++)
        {
            root=b.insertionRec(root,x[i]);
           
        }
        b.preOrder(root);
        
        
        
        
        
        
//        System.out.println("");
//        int el=b.delete(root, 18);
//        if(el==-1){
//            System.out.println("Sigle node in the tree ");
//            root=null;
//        }
//        else if(el==-2){
//            System.out.println("element not available");
//        }
//        else{
//            System.out.println("deleted el is : "+el);      
//        }
//        b.inOrder(root);
        
        
    }
    
}
