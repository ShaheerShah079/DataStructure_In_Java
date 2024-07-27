package huffmancodinglabterminal;

public class PQueue {
    
    private int size;
    private Node[] a;
    public PQueue(int size) {
        a = new Node[size];
        this.size = 0;
    }
    boolean isFull() { return size == a.length-1; }
    boolean isEmpty() { return size == 0; }
    
    public void insert(int freq, char data) {
        if(isFull())
            System.out.println("Queue is Full");
        else {
            a[++size] = new Node(data,freq);
            heapifyInsertingNode();
        }
    }
    
    public void insert(Node n) {
        if(isFull())
            System.out.println("Queue is Full");
        else {
            a[++size] = n;
            heapifyInsertingNode();
        }
    }
    private void heapifyInsertingNode(){
        for(int i= size/2 ; i>=1 ; i= i/2) {
            minHeapify(a, i, size);
        }
    }
    public void buildHeap() {
        for(int i= size/2 ; i>=1 ; i--) {
            minHeapify(a, i, size);
        }
    }
    
    private void maxHeapify(Node[] a, int i, int n) {
        int left = 2*i;
        int right = (2*i)+1;
        int largest;
        if(left<=n && a[left].freq>a[i].freq)
            largest = left;
        else 
            largest = i;
        if(right<=n && a[right].freq>a[largest].freq)
            largest = right;
        if(largest != i) {
            Node temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            maxHeapify(a, largest, n);
        }
    }
    private void minHeapify(Node[] a, int i, int n) {
        int left = 2*i;
        int right = (2*i)+1;
        int smallest;
        if(left<=n && a[left].freq<a[i].freq)
            smallest = left;
        else 
            smallest = i;
        if(right<=n && a[right].freq<=a[smallest].freq)
            smallest = right;
        if(smallest != i) {
            Node temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
            minHeapify(a, smallest, n);
        }
    }
    
    public void display() {
        
        for(int i=1 ; i<=size ; i++)
            System.out.print(a[i].data + " - "+a[i].freq);
        System.out.println("");
    }
    
    public Node removeMin() {
        Node temp = null;
        if(isEmpty()) {
            return temp;
        }
        temp = a[1];
        a[1] = a[size];
        size--;
        minHeapify(a, 1, size);
        return temp;
    }
    
    public int length () {
        return size;
    }
    
    public int peek() {
        int temp = 0;
        if(isEmpty())
            System.out.println("Queue is Empty");
        else 
            temp = a[1].freq;
        return temp;
    }
    
    public void clear() {
        size = 0;
    }
    
}
