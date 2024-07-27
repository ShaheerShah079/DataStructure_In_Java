
package piorityqueuealgorithm;

public class PiorityQueueAlgorithm
{

    public static void main(String[] args)
    {
        // TODO code application logic here
          PQ pq = new PQ(6);
            pq.insertion(72);
            pq.insertion(32);
            pq.insertion(54);
            pq.insertion(7);
            pq.insertion(18);
            pq.insertion(47);
            pq.insertion(7);
            
          
            System.out.print(pq.deletion()+ " ");
            System.out.print(pq.deletion()+ " ");
            System.out.print(pq.deletion()+ " ");
            System.out.print(pq.deletion()+ " ");
            System.out.print(pq.deletion()+ " ");
            System.out.print(pq.deletion()+ " ");
            System.out.print(pq.deletion()+ " ");
            
            
        
    }
    
}
