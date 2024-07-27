package priorityqueuenew;

public class Node {
    
    int freq;
    char data;
    Node left, right;
    
    Node(int freq, char data) {
        this.freq = freq;
        this.data = data;
        left = right = null;
    }
    
    Node(int freq, Node l, Node r) {
        this.freq = freq;
        left = l;
        right = r;
    }
    
}
