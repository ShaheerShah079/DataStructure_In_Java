package priorityqueuenew;

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
            a[++size] = new Node(freq,data);
            buildHeapify(a);
        }
    }
    
    public void insert(Node n) {
        if(isFull())
            System.out.println("Queue is Full");
        else {
            a[++size] = n;
            buildHeapify(a);
        }
    }
    
    public void buildHeapify(Node[] a) {
        int n = size;
        for(int i= n/2 ; i>=1 ; i= i/2) {
//            maxHeapify(a, i, n);
            minHeapify(a, i, n);
        }
    }
    
    public void maxHeapify(int[] a, int i, int n) {
        int l = 2*i;
        int r = (2*i)+1;
        int largest;
        if(l<=n && a[l]>a[i])
            largest = l;
        else 
            largest = i;
        if(r<=n && a[r]>a[largest])
            largest = r;
        if(largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            maxHeapify(a, largest, n);
        }
    }
    
    private void minHeapify(Node[] a, int i, int n) {
        int l = 2*i;
        int r = (2*i)+1;
        int smallest;
        if(l<=n && a[l].freq<a[i].freq)
            smallest = l;
        else 
            smallest = i;
        if(r<=n && a[r].freq<=a[smallest].freq)
            smallest = r;
        if(smallest != i) {
            Node temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
            minHeapify(a, smallest, n);
        }
    }
    
    public void display() {
        
        for(int i=1 ; i<=size ; i++)
            System.out.print(a[i].data + " - ");
        System.out.println("");
    }
    
    Node removeMin() {
        Node temp = null;
        if(isEmpty()) {
            return temp;
        }
        temp = a[1];
        a[1] = a[size];
        size--;
        buildHeapify(a);
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
