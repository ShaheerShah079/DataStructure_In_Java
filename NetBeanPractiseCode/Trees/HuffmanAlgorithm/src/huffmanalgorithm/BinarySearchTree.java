
package huffmanalgorithm;

public class BinarySearchTree
{
    int size;
    BinarySearchTree(){
        size=0;
    }
    BSTNode generateTree(String in){
        BSTNode root=new BSTNode(in.charAt(0));
        size++;
        for (int i = 1; i < in.length(); i++)
        {
            insert(root,in.charAt(i));
        }
        return root;
    }
    void insert(BSTNode root,char a){
        BSTNode p=root,q=root;
        while(q!=null&&p.data!=a){
            p=q;
            if(a<p.data)
                q=p.left;
            else if(a>p.data)
                q=p.right;
        }
        if(p.data==a){
            p.freq++;
//            System.out.println(p.data+" incrment "+p.freq);
        }
        else if(p.data>a){
            p.left=new BSTNode(a);
//            System.out.println(p.left.data+" left "+p.left.freq);
            size++;
        }
        else{
            p.right=new BSTNode(a);
//            System.out.println(p.right.data+" right "+p.right.freq);
            size++;
        }
    }
    
}
