package priorityqueuenew;

public class CharacterTree {
    
    int size;
    TNode root;

    public CharacterTree() {
        size = 0;
        root = null;
    }
    
    
    
    void insert(int freq, char data) {
        if(isEmpty()) {
            TNode n = new TNode(freq, data);
            root = n;
        } else {
            TNode n = new TNode(freq, data);
        }
    }
    
    boolean isEmpty() {
        return size == 0;
    }
    
    
}
