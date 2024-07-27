package huffmancodinglabterminal;

public class Node {
    
    int freq;
    char data;
    Node left, right;
    
    public Node( char data,int freq) {
        this.freq = freq;
        this.data = data;
        left = right = null;
    }
    public Node(int freq, Node l, Node r) {
        this.freq = freq;
        left = l;
        right = r;
    }
    
}
