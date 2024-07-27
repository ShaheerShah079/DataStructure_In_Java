
package expressiontreealgorithm;

import java.util.Stack;

public class ExpressionTreeAlgorithm
{

    public static void main(String[] args)
    {
        // PostFix To Expression Tree 
//        String pInput="XY+ZWK^+/LKM+-+";
//        Node pTree=postFixTET(pInput);
//        System.out.print("InOrder Traversal :");
//        inOrder(pTree);
//        System.out.println("");
//        System.out.print("PreOrder Traversal :");
//        preOrder(pTree);
//        System.out.println("");
//        System.out.print("PostOrder Traversal :");
//        postOrder(pTree);
//        System.out.println("");
        
        // Infix To Expression Tree
       String iInput="1/2+3*4-1^2+4";
       Node iTree=infixTET(iInput);
       System.out.print("InOrder Traversal :");
       inOrder(iTree);
       System.out.println("");
       System.out.print("PreOrder Traversal :");
       preOrder(iTree);
       System.out.println("");
       System.out.print("PostOrder Traversal :");
       postOrder(iTree);
       System.out.println("");
        
    }
    
    public static Node infixTET(String in){
        if(in.length()==1){
            return new Node(in.charAt(0));
        }
        else{
            int a=lowPrecedence(in);
            Node n= new Node(in.charAt(a));
            n.left=(infixTET(in.substring(0, a)));
            n.right=(infixTET(in.substring(a+1, in.length())));
            return n;
        }
    }
    public static int lowPrecedence(String in){
        int low=-1;
        for (int i = 0; i < in.length(); i++)
        {
            if((in.charAt(i)=='+'||in.charAt(i)=='-'||in.charAt(i)=='*'||in.charAt(i)=='/'||in.charAt(i)=='^')&&low==-1){
                low=i;
            }
            else if((in.charAt(i)=='+'||in.charAt(i)=='-'||in.charAt(i)=='*'||in.charAt(i)=='/'||in.charAt(i)=='^')&&precedence(in.charAt(low),in.charAt(i))){
                    low=i;
            }
        }
        return low;
    }
    
    public static boolean precedence(char a,char b){
        if(a=='^') return true;
        else if(a=='/'&&(b!='^'&&b!='*')) return true;
        else if(a=='*'&&(b!='/'&&b!='^')) return true;
        else if(a=='+'&&b=='-') return true;
        else if(a=='-'&&b=='+') return true;
        else return false;
    }
    
    public static Node postFixTET(String in){
        Stack<Node> s = new Stack<>();
         for (int i = 0; i < in.length(); i++)
        {
            if(in.charAt(i)=='+'||in.charAt(i)=='-'||in.charAt(i)=='*'||in.charAt(i)=='/'||in.charAt(i)=='^'){
                Node right=s.pop();
                Node left =s.pop();
                Node n = new Node(in.charAt(i));
                n.left=left;
                n.right=right;
                s.push(n);
                
            }
            else {
                 Node n = new Node(in.charAt(i));
                 s.push(n);
            }
        }
        return s.pop();
    }
    public static void inOrder(Node n){
        if(n!=null){
            inOrder(n.left);
            System.out.print(n.data);
            inOrder(n.right);
        }
    }
    
    public static void preOrder(Node n){
        if(n!=null){
            System.out.print(n.data);
            preOrder(n.left);
            preOrder(n.right);
        }
    }
    
     public static void postOrder(Node n){
        if(n!=null){
            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n.data);
        }
    }
    
}