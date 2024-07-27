
package dequeue;

import java.util.Scanner;

/**
 *
 * @author Personal's PC
 */
public class DEQueue
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
       int ch,val,ins,temp;
       MyDEQueue q = new MyDEQueue(5);
        do{
            System.out.println("1.enqueuefront 2.dequeuefront 3.enqueuerear 3.dequeuerear");
            val=in.nextInt();
            switch(val){
                case 1:
                    System.out.println("enter value enqueue");
                    ins=in.nextInt();
                    q.enqueueFront(ins);
                    q.display();
                break;
                case 2:
                    System.out.println(q.degueueFront());
                    q.display();
                break;
                case 3:
                    
                    System.out.println("enter value enqueue");
                    ins=in.nextInt();
                    q.enqueueRear(ins);
                    q.display();
                break;
                case 4:
                    System.out.println(q.dequeueRear());
                    q.display();
                break;
                   
            }
            System.out.println("-1 to stop");
            ch=in.nextInt();
        }while(ch!=-1);
   
        
//        System.out.println(" "+plus(6,3));
        
    }
//    public static int plus(int val,int time){
//        if(time==1){
//            return val;
//        }
//        else{
//            return val+plus(val,time-1);
//        }
//    }
}
class MyDEQueue{
    int []a;
    int size,front,rear;
    MyDEQueue(int size){
        a= new int[size];
        this.size=0;
        front=rear=-1;
    }
    boolean isFull(){
      return  size==a.length;
    }
    boolean isEmpty(){
       return size==0; 
    }
    
    void enqueueRear(int item){
        if(isFull())
            System.out.println("Array is full");
        else if(isEmpty()){
            front=rear=0;
            a[rear]=item;
            size++;
        }
        else{
           rear = (rear+1)%a.length;
            size++;
            a[rear]=item;
        }
    }
    void enqueueFront(int item){
        if(isFull())
            System.out.println("Array is full");
        else if(isEmpty()){
            front=rear=0;
            a[front]=item;
            size++;
        }
        else {
            if(front==0){
            front=a.length;
            }
            
            a[--front]=item;
            size++;
            
        }
        
    }
    int degueueFront(){
        int temp=0;
        if(isEmpty()) System.out.println("Queue is Empty");
        else if(size==1){
           temp=a[front];
           size--;
           front=rear=-1;
        }
        else{
            temp=a[front];
            front = (front+1)%a.length;
            size--;
        }
        return temp;
    }
    
    int dequeueRear(){
        int temp=0;
        if(isEmpty()) System.out.println("Queue is Empty");
        else if(size==1){
           temp=a[rear];
           size--;
           front=rear=-1;
        }
        else{
            temp=a[rear--];
            size--;
         if(rear==-1){
             rear=a.length-1;
         }
         
        }
        return temp;
    }
    void display(){
        int trav=front;
        for(int i=0;i<size;i++){
            System.out.print(a[trav]+"  ");
            trav=(trav+1)%a.length;
        }
       
    }
}
