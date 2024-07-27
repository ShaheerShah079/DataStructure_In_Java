package staticstackmain;

public class StaticStack<DT>{
    DT []a;
    int top;
    StaticStack(int size){
        a=(DT[]) new Object[size];
        top=-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return  top==a.length-1;
    }
    void push(DT item){
        if(isFull()) System.out.println("Overflow Stack is full");
        else{
            a[++top]=item;
        }
    }
    DT pop(){
        DT temp= (DT)"0";
        if(isEmpty()) System.out.println("Ünderflow Stack is Empty");
        else{
            temp=a[top--];
        }
        return temp;
    }
    DT peek(){
        DT temp= (DT)"0";
        if(isEmpty()) System.out.println("Ünderflow Stack is Empty");
        else{
            temp=a[top];
        }
        return temp;
    }
    void clear(){
        top=-1;
    }
    int length(){
        return top+1;
    }
    void copy(StaticStack l){
        for (int i = 0; i <=top ; i++) {
            l.push(a[i]);
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("-    -");
        for (int i = top; i >=0; i--) {
            System.out.println("| "+a[i]+" |");
        }
        System.out.println(" ____");
    }
}
