package priorityqueuenew;

public class TNode {
    
    TNode left, right;
    char data;
    int freq;
    
    TNode(int freq, char data) {
        this.data = data;
        this.freq = freq;
        left = right = null;
    }
    
}
