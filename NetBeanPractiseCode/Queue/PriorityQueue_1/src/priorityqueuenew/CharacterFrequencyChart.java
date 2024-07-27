
package priorityqueuenew;
public class CharacterFrequencyChart
{
    public Node root;
    int size;
    public PQueue pq;
    CharacterFrequencyChart(){
        root =null;
        size=1;
    }
   
    public void generateChart(String s){
        root = new Node(s.charAt(0),1);
        for (int i = 1; i < s.length(); i++)
        {
            generate(s.charAt(i));
        }
    }
    private void generate(char item){
        Node p,q;
        p=q=root;
        while(q!=null&&item!=p.data){
            p=q;
            if(p.data>item){
                q=p.left;
            }
            else{
                q=p.right;
            }
        }
        if(p.data==item){
            p.freq++;
        }
        else if(p.data>item){
            p.left=new Node(item,1);
            size++;
        }
        else{
            p.right=new Node(item,1);
            size++;
        }
    }
    public void insertInPiorityQueue(Node n){     
//        System.out.println("size "+size);
            pq = new PQueue(size+1);//size+1 because Priority queue started from index 1
            traversal(root);
        }
    
    private void traversal(Node n){
         if(n!=null){
//             System.out.println("Character "+n.data+" frequency "+n.freq);
             pq.insert(n.freq, n.data);
            traversal(n.left);
            traversal(n.right);
    }
  }
}