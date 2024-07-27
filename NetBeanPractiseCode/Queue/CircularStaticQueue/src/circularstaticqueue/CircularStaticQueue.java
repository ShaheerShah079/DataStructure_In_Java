package circularstaticqueue;

public class CircularStaticQueue
{
    public static void main(String[] args)
    {
    MyCsQueue q = new MyCsQueue(5);
    q.enqueue(0);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
        q.dequeue();
        q.dequeue();
    q.enqueue(4);
    q.enqueue(5);
    q.enqueue(6);
    q.display();
        System.out.println("");
    q.dequeue();
    q.dequeue();
    q.enqueue(7);
    q.dequeue();
    q.display();
        System.out.println("");
    q.enqueue(8);
    q.enqueue(9);
    q.display();
    q.enqueue(10);
    MyCsQueue q1 = new MyCsQueue(10);
        System.out.println(q.length());
        System.out.println(q.front());
     q.dequeue();
     q.copy(q1);
     q.dequeue();
     q1.display();
        System.out.println("");
     q.display();
        System.out.println("");
        System.out.println(q1.length());
        System.out.println(q.length());
    MyCsQueue q2 = new MyCsQueue(10);
    q2.merge(q, q1);
    q2.display();
    
    
    }
    
}

class MyCsQueue{
    int[] arr;
    int size,rear,front;
    MyCsQueue(int n){
        arr= new int[n];
        size=0;
        front=rear=-1;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==arr.length;
    }
    void enqueue(int item){
        if(isFull())System.out.println("Queue is full");
        else if(isEmpty()){
            rear=front=0;
            size++;
            arr[rear]=item;
        }
        else{
            rear = (rear+1)%arr.length;
            size++;
            arr[rear]=item;
        }
    }
    int dequeue(){
        int temp=0;
        if(isEmpty()) System.out.println("Queue is Empty");
        else if(size==1){
           temp=arr[front];
           size--;
           front=rear=-1;
        }
        else{
            temp=arr[front];
            front = (front+1)%arr.length;
            size--;
        }
        return temp;
    }
    int front(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        else{
            return arr[front];
        }
    }
    int length(){
        return size;
    }
    void display(){
        int trav=front;
        for(int i=0;i<size;i++){
            System.out.print(arr[trav]+"  ");
            trav=(trav+1)%arr.length;
        }
       
    }
    void copy(MyCsQueue q){
        int trav=this.front;
        for (int i = 0; i < this.size; i++)
        {
            q.enqueue(this.arr[trav]);
            trav=(trav+1)%arr.length;
        }
    }
    void merge(MyCsQueue q1,MyCsQueue q2){
        int trav=q1.front;
        for (int i = 0; i < q1.size; i++)
        {
            this.enqueue(q1.arr[trav]);
            trav=(trav+1)%arr.length;
        }
        trav = q2.front;
        for (int i = 0; i < q2.size; i++)
        {
            this.enqueue(q2.arr[trav]);
            trav=(trav+1)%arr.length;
        }
    }
    
}