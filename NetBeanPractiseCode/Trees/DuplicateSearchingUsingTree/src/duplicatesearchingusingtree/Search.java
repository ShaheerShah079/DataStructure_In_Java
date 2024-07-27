/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicatesearchingusingtree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Personal's PC
 */
public class Search
{
    static void insert(Node root, int el){
        Node temp1,temp2;
        temp1=temp2=root;
        while(temp2!=null){
            temp1=temp2;
            if(temp1.data<=el)
                temp2=temp1.right;
            else 
                temp2=temp1.left;
        }
        if(temp1.data<=el)
            temp1.right=new Node(el);
        else {
            temp1.left=new Node(el);    
        }
        
    }
    
   static void preOrder(Node n ){
       if(n==null){
           return; 
       }
       else{
        System.out.print(n.data+"  ");
        preOrder(n.left);
        preOrder(n.right);
       }
        
    }
   static void inOrder(Node n){
       if(n==null){
           return; 
       }
       else{
           inOrder(n.left);
           System.out.print(n.data+"  ");
           inOrder(n.right);
       }
   }
   
   static void postOrder(Node n){
       if(n==null){
           return; 
       }
       else{
           postOrder(n.left);
           postOrder(n.right);
           System.out.print(n.data+"  ");
          
       }
   }
   static void inOrderIterative(Node k){
       Node n=k;
       Stack<Node> s= new Stack<>();
       do{
           
           while(n!=null){
             
               s.push(n);
                 n=n.left;
           }
               if(!s.isEmpty()){
                   n=s.pop();
                  System.out.print(n.data+"  ");
                 n=n.right;
               }
           }while(!s.isEmpty()||n!=null);   
   }
   
   static void preOrderIter(Node root){
       Node temp=root; 
       Stack<Node> s= new Stack<>();
       do{
           while(temp!=null){
               System.out.print(temp.data+"  ");
               s.push(temp);
               temp=temp.left;
           }
           if(!s.isEmpty()){
               temp=s.pop().right;
           }
       }while(!s.isEmpty()||temp!=null);
   }
   static void levelOrder(Node n){
       Queue<Node> q = new LinkedList<>();
       q.add(n);
       do{
           n=q.poll();
           System.out.print(n.data+"  ");
           if(n.left!=null) q.add(n.left);
           if(n.right!=null) q.add(n.right);
           
       }while(!q.isEmpty());
       
   }
   
   static void postOrderIter(Node root){
       Node temp=root; 
       Node temp2=null;
       Stack<Node> s= new Stack<>();
       do{
           while(temp!=null){
               s.push(temp);
               temp=temp.left;
           }
           if(!s.isEmpty()&&s.peek().right!=temp2){
               temp=s.peek().right;
           }
           if(temp==null||s.peek().right==temp2){
               temp2=s.peek();
           System.out.print(s.pop().data+"  ");
           }
       }while(!s.isEmpty()||temp!=null);
   }
   static Node Seachnodedelete(Node n,int data){
   
       if(n==null)
           return null;
       else if(n.data==data)
           return n;           
       else{
           Node n1= Seachnodedelete(n.left,data);
           Node n2= Seachnodedelete(n.right,data);
           if(n1!=null)
               return n1;
           else if(n2!=null)
               return n2;
           else{
               return null;
           }
           
       }
   }
    static int delete(Node root,int item){
        int value=0;
       Node temp1=root;
       Node temp2=root;
//       // find out node of given item to be deleted
//       while(temp2!=null&&temp2.data!=item){
//           temp1=temp2;
//           if(temp1.data<item){
//               temp2=temp1.right;
//           }
//           else if(temp1.data>item){
//               temp2=temp1.left;
//           }
//       }
temp2=Seachnodedelete(root,item);

       if(temp2!=null){  // temp2!= null means node is find to be deleted
           value=temp2.data;   // store data of deleted node 
          
           // no child
        if(temp2.right==null&&temp2.left==null){
            System.out.println("in no child");
           // check deleted node is at left side of its parent
           if(temp1.left==temp2) temp1.left=null;
           // check deleted node is at right side of its parent
           else temp1.right=null;
       }
       
//       else if((temp2.right==null&&temp2.left!=null)||(temp2.right!=null&&temp2.left==null)){
//           if(temp2.right!=null){
//               int val=temp2.data;
//               temp2.data=temp2.right.data;
//               temp2.right.data=val;
//               Search.delete(temp2.right,temp2.right.data);
//           }
//           else{
//               int val=temp2.data;
//               temp2.data=temp2.left.data;
//               temp2.left.data=val;
//               Search.delete(temp2.left,temp2.left.data);
//               
//           }
//           
//       }
//       

          else if((temp2.right==null&&temp2.left!=null)||(temp2.right!=null&&temp2.left==null)){
           // check deleted node is at left side of its parent      
           if(temp1.left==temp2){
                if(temp2.right!=null) 
                    temp1.left=temp2.right;
                else
                    temp1.left=temp2.left;
           }
           // check deleted node is at right side of its parent
           else{
               if(temp2.right!=null) 
                    temp1.right=temp2.right;
                else
                    temp1.right=temp2.left;
           }
       }
          
       // one child , left child 
//             else if((temp2.right==null&&temp2.left!=null)){
//           // check deleted node is at left side of its parent
//           if(temp1.left==temp2){
//               temp1.left=temp2.left;
//           }
//           // check deleted node is at right side of its parent
//           else{
//               temp1.right=temp2.left;
//           }
//       }
//       // one child , right child 
//       else if((temp2.right!=null&&temp2.left==null)){
//           // check deleted node is at left side of its parent
//           if(temp1.left==temp2){
//               temp1.left=temp2.right;
//           }
//           // check deleted node is at right side of its parent
//           else{
//               temp1.right=temp2.right;
//           }
//       }
       // two child 
       else{
//               if(temp2.right.left!=null){
//                   temp1=temp2.right.left;
System.out.println("in two child");
                   temp1=temp2.right;
                   while(temp1.left!=null){
                       temp1=temp1.left;
                   }
                   int val=temp2.data;
                   temp2.data=temp1.data;
                   temp1.data=val;      
                   System.out.println(temp1.data+"");
                   Search.delete(root, temp1.data);
               }
//               else{  
//                   temp2.data=temp2.right.data;
//                   temp2.right=temp2.right.right;
//               }
//           }
     }
       // if item not found 
       else{
           System.out.println("Value Not available");
       }
       return value;
   }
    
    
   static Node findValue(Node root,int item){
         if(root!=null&&root.data!=item){
             Node temp;
            if(item<root.data){
           temp=findValue(root.left,item);
            }
            else{ 
            temp=findValue(root.right,item);  
            }
            return temp;
        }
         else{
         return root;
         }
         
    }
   
   static Node findValue2(Node root,int item){
       Node temp=root;
       while(temp!=null&&temp.data!=item){
           if(item<temp.data){
               temp=temp.left;
           }
           else{
               temp=temp.right;
           }
       }
       return temp;
   }
   
   
   
    static int height(Node root,int item){
        int height=-1;
        Node temp=findValue(root,item);
        if(temp!=null){
            height=searchHeight(temp,item);
        } 
         return height;   
     }
    
    static int searchHeight(Node root,int item){
        if(root==null) return -1;
        else{
            int h1=searchHeight(root.left,item);
            int h2=searchHeight(root.right,item);
            if(h1>h2) return ++h1;
            else if(h1<h2) return ++h2;
            else  return ++h1; // also write return ++h2;
        }
    }
    
    static int depth(Node root,int item){
           int inc=0;
           Node temp=root;
       while(temp!=null&&temp.data!=item){
           if(item<temp.data){
               temp=temp.left;
           }
           else{
               temp=temp.right;
           }
           inc++;
       }
       if(temp!=null) return inc;
       else return -1; 
   }
    
    
}
