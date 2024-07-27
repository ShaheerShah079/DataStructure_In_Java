
package huffmanalgorithm;

public class PiorityQueue
{
    BSTNode []arr;
    int size;
    PiorityQueue(int n){
        arr= new BSTNode[n+1];
        size=0;
    }
    PiorityQueue(){
        size=0;
    }
    
    void generatePQ(String in){
        BinarySearchTree bst= new BinarySearchTree();
        BSTNode root=bst.generateTree(in);
        arr=new BSTNode[bst.size+1];
        insertInPQ(root);
        nullifyref();
    }
   private void insertInPQ(BSTNode root){
         if(root!=null){
             this.insertion(root);
             insertInPQ(root.left);
             insertInPQ(root.right);
         }
     } 
   private void nullifyref(){
       for (int i = 1; i <=size; i++)
       {
           arr[i].left=null;
           arr[i].right=null;
           
       }
   }
    void insertion(BSTNode n){
            arr[++size]=n;
            for (int i = size/2; i >0; i=i/2)
            {
             minHeapify(arr,i,size);  
            }
    }
    BSTNode deletion(){
        BSTNode temp=null;
        if(size==0)
            System.out.println("Empty");
        else{
            temp=arr[1];
            arr[1]=arr[size];
            size--;
           minHeapify(arr,1,size);
        }
        return temp;
    }
    
    void minHeapify(BSTNode[] arr,int parent ,int size){
        int left=2*parent,right=2*parent+1,smallest=parent;
        BSTNode swap;
        if(left<=size&&arr[left].freq<arr[smallest].freq)
            smallest=left;
        if(right<=size&&arr[right].freq<arr[smallest].freq)
            smallest=right;
        
        if(smallest!=parent){
            swap=arr[smallest];
            arr[smallest]=arr[parent];
            arr[parent]=swap;
            minHeapify(arr,smallest,size);
        }
    }
    void Heapify(BSTNode[] arr,int size){
        for (int i = size/2; i > 0; i--)
        {
          minHeapify(arr,i,size);  
        }
    } 
    
    public void printArray(){
        for (int i = 1; i < size; i++)
        {
            System.out.print(" Character "+arr[i].data+" Frequency "+arr[i].freq);
        }
        System.out.println("");
    } 
}
