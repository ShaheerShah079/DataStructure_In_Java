
package binarysearchtreealgorithm;

public class BST
{
    private Node root;
    BST(){
        root=null;
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
    
    
    public Node insertionRec(Node root,int el){
        if(root==null){
            System.out.println("return null");
            return null;
            
        }
        else{
            Node p;
            Node x=new Node(el);
            if(el<root.data){
                System.out.println(root.data +" and go to left ");
                 p=insertionRec(root.left,el);
            }
            else{
                System.out.println(root.data +" and go to right ");
                p=insertionRec(root.right,el);
            
            }
            if(p==null){
              if(el<root.data){
                  System.out.println(x.data+" insert at left of "+root.data);
                 root.left=x;
            }
              else{
                  System.out.println(x.data+" insert at right "+root.data);
                root.right=x;  
            }
         }
            else{
               if(p.data<root.data){
                  System.out.println(p.data+" attached at left of "+root.data);
                 root.left=p;
                }
              else{
                  System.out.println(p.data+" attached at right "+root.data);
                root.right=p;  
                } 
            }   
            System.out.println("height of "+root.data+" is "+(height(root.left)-height(root.right)));
            if(((height(root.left)-height(root.right))<=-2)
                ||((height(root.left)-height(root.right))>=2)){
                System.out.println("Avl Aplly here");
                root=avlRotation(root,el);
            }
            preOrder(root);
            System.out.println("return "+root.data);
            return root;
        }
        
    }
    Node avlRotation(Node root,int el){
//        Node temp;
        if(root.left!=null&&el<root.left.data)
            root=rightRotaion(root);
        else if(root.right!=null&&el>=root.right.data)
            root=leftRotaion(root);
        else if(root.left!=null&&el>=root.left.data){
            root.left=leftRotaion(root.left);
            root=rightRotaion(root);
        }
        else if(root.right!=null&&el<root.right.data){
            root.right=rightRotaion(root.right);
            root=leftRotaion(root);
        }
            
        
        return root;
    }
    
    public void insert(int el){
        if(root==null){
            root=new Node(el);
        }
        else{
            Node p,q;
            p=q=root;
            while(q!=null){
                p=q;
                if(el<p.data){
                    q=p.left;
                }
                else if(el>=p.data){
                    q=p.right;
                }
            }
            if(el<p.data){
                    p.left=new Node(el);
            }
            else if(el>=p.data){
                    p.right=new Node(el);
            } 
        }
    }
    public void insert(Node root,int el){
            Node p,q;
            p=q=root;
            while(q!=null){
                p=q;
                if(el<p.data){
                    q=p.left;
                }
                else if(el>=p.data){
                    q=p.right;
                }
            }
            if(el<p.data){
                    p.left=new Node(el);
            }
            else if(el>=p.data){
                    p.right=new Node(el);
            } 
        }
    public int height(Node root){
        if(root==null){
            return -1;
        }
        else{
            int hLeft=height(root.left);
            int hRIght=height(root.right);
            if(hLeft>hRIght)
                return ++hLeft;
            else
                return ++hRIght;
        }
    }
    
    public Node getRoot(){
        return root;
    }
    
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+"  ");
            inOrder(root.right);
        }
    }
    public void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+"  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"  ");
        }
    }
    
    
    public void inOrder(){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+"  ");
            inOrder(root.right);
        }
    }
    public void preOrder(){
        if(root!=null){
            System.out.print(root.data+"  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"  ");
        }
    }    
    
    
    public int delete(Node root,int el){
        int temp=-2;
     Node p,q;
     p=q=root;
     // search for node 
     while(q!=null&&q.data!=el){
         p=q;
         if(el<p.data)
             q=p.left;
         else
             q=p.right;
     }
     // if root is the deleted item and has no child then this is single node only in the bst retrun -1 to indicate
     if(q==root&&root.left==null&&root.right==null)
         return -1;
     // if q is null then element cant exit in bst
     else if(q==null)
            System.out.println("Item not available");
     // element exist to be deleted in else 
     else{
         temp=q.data;
         // deleted node has no child
         if(q.left==null&&q.right==null){
            if(p.left==q)
                p.left=null;
            else if(p.right==q)
                p.right=null;
         }
         // deleted node has ony one left child
         else if((q.left!=null&&q.right==null)){
             // swap the data of deleted node with child node  
             int swap=q.data;
             q.data=q.left.data;
             q.left.data=swap;
               // again call delete method for child because its store the deleted node data now
               int t=delete(q.left,q.left.data);
               // if calling deleted method return -1 then its the root and has no child so unrefenced by our self
               if(t==-1)
                   q.left=null;
         }
         // deleted node has ony one right child
         else if((q.left==null&&q.right!=null)){
            // swap the data of deleted node with child node
             int swap=q.data;
             q.data=q.right.data;
             q.right.data=swap;
//             System.out.println(swap+ " swap with 1 child right "+q.data);
               // again call delete method for child because its store the deleted node data now
               int t=delete(q.right,q.right.data);
               // if calling deleted method return -1 then its the root and has no child so unrefenced by our self
               if(t==-1)
                   q.right=null; 
         }
         // deleted node has ony one right child
         else{
             Node lrm1,lrm2;
             lrm1=q;
             lrm2=q.left;
             while(lrm2.right!=null){
                 lrm1=lrm2;
                 lrm2=lrm2.right;
             }
//             System.out.println(q.data+" swap with "+lrm2.data+" with parent "+lrm1.data);
             int swap=q.data;
             q.data=lrm2.data;
             lrm2.data=swap;
             
             int t=delete(lrm2,lrm2.data);
             if(t==-1)
                 lrm1.right=null;
                 lrm1.left=null;
         }
     }
     
     return temp;
    }
}
