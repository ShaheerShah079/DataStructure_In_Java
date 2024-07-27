package labmidzakaullah;

public class Q1
{
    public static void main(String[] args)
    {
        
      int [] stack = {12,45,14,19,24};
      StaticStack l = new StaticStack(5);
      l.a=stack;
      l.top=stack.length-1;
        System.out.print("[");
      while(!l.isEmpty()){
          System.out.print(l.pop()+",");
      }
        System.out.println("]");
        
        
    }
   
}
class StaticStack{
    int []a;
    int top;
    StaticStack(int size){
        a= new int[size];
        top=-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return  top==a.length-1;
    }
    void push(int item){
        if(isFull()) System.out.println("Overflow Stack is full");
        else{
            a[++top]=item;
        }
    }
    int pop(){
        int temp= 0;
        if(isEmpty()) System.out.println("Ünderflow Stack is Empty");
        else{
            temp=a[top--];
        }
        return temp;
    }
}