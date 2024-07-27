package priorityqueuenew;

import java.util.Scanner;

public class PriorityQueueDemo {

    static Node root;
    
    public static void main(String[] args) {
        PQueue pq = new PQueue(20);
        Scanner scan = new Scanner(System.in);
        int ch,freq;
        char data;
        boolean runAgain = true;
        pq.insert(10, 'a');
        pq.insert(20, 'b');
        pq.insert(5, 'c');
        pq.insert(2, 'd');
        pq.insert(7, 'e');
        pq.insert(15, 'f');
       
        generateTree(pq);
        printCode(root, "");
        
    }
    
    public static void generateTree(PQueue pq) {
        while(pq.length() > 1) {
            Node n1 = pq.removeMin();
            Node n2 = pq.removeMin();
            Node n = new Node(n1.freq + n2.freq, n1, n2);
            pq.insert(n);
        }
        root = pq.removeMin();
    }
    
    
    public static void printCode(Node root, String s) {
    if (root.left == null && root.right == null) {

      System.out.println(root.data + "   |  " + s);

      return;
    }
    printCode(root.left, s + "0");
    printCode(root.right, s + "1");
  }
    
    
    
}
