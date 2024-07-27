
package avl;

public class AVl
{

    public static void main(String[] args)
    {
        // left rotation test
        BST b = new BST();
        b.insert(1);
        b.insert(2);
        b.insert(3);
      
        Node root=b.getRoot();
        Node ARNode=leftRotaion(root);

        b.preOrder(ARNode);
        System.out.println("");    
        
        b.insert(ARNode,4);
        b.insert(ARNode,5);
         ARNode.right=leftRotaion(ARNode.right);
        b.preOrder(ARNode);
        System.out.println("");
        
        b.insert(ARNode, 6);
        ARNode=leftRotaion(ARNode);
        b.preOrder(ARNode);
        System.out.println("");
        
        b.insert(ARNode, 7);
        ARNode.right=leftRotaion(ARNode.right);
        b.preOrder(ARNode);
        System.out.println("");
        
         b.insert(ARNode, 16);
         b.insert(ARNode, 15);
        ARNode.right.right.right=rightRotaion(ARNode.right.right.right);
        ARNode.right.right=leftRotaion(ARNode.right.right);
        
        b.preOrder(ARNode);
        System.out.println("");
        
        
        // right rotattion test
//        BST b = new BST();
//        b.insert(20);
//        b.insert(17);
//        b.insert(13);
//      
//        Node root=b.getRoot();
//        Node ARNode=rightRotaion(root);
//
//        b.preOrder(ARNode);
//        System.out.println("");    
//        
//        b.insert(ARNode,12);
//        b.insert(ARNode,10);
//         ARNode.left=rightRotaion(ARNode.left);
//        b.preOrder(ARNode);
//        System.out.println("");
//        
//        b.insert(ARNode, 9);
//        ARNode=rightRotaion(ARNode);
//        b.preOrder(ARNode);
//        System.out.println("");
//        
//        b.insert(ARNode, 7);
//        ARNode.left=rightRotaion(ARNode.left);
//        b.preOrder(ARNode);
//        System.out.println("");        
        
        
        
        
    }
    
    static Node  leftRotaion(Node root){
        Node temp=root.right;
        Node temp2=null;
        root.right=null; 
        if(temp.left!=null){
            temp2=temp.left;
//            System.out.println("temp2 is "+temp.left.data);
        }
        temp.left=root;
        if(temp2!=null){
        root.right=temp2;
//            System.out.println("Right of root is "+temp2.data);
        }
        return temp;
    }
    
    static Node  rightRotaion(Node root){
        Node temp=root.left;
        Node temp2=null;
        root.left=null; 
        if(temp.right!=null){
            temp2=temp.right;
//            System.out.println("temp2 is "+temp.left.data);
        }
        temp.right=root;
        if(temp2!=null){
        root.left=temp2;
//            System.out.println("Right of root is "+temp2.data);
        }
        return temp;
    }
}
