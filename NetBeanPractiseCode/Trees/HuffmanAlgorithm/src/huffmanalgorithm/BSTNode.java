
package huffmanalgorithm;

public class BSTNode
{
    char data;
    int freq;
    BSTNode left;
    BSTNode right;
    BSTNode(char data){
        this.data=data;
        this.freq=1;
        left=null;
        right = null;
    }
    BSTNode(char data,int freq){
        this.data=data;
        this.freq=freq;
        left=null;
        right = null;
    }
    
    BSTNode(char data,int freq,BSTNode left,BSTNode right){
        this.data=data;
        this.freq=freq;
        this.left=left;
        this.right = right;
    }
    BSTNode(int freq,BSTNode left,BSTNode right){
        this.freq=freq;
        this.left=left;
        this.right = right;
    }
    
    
    
}
