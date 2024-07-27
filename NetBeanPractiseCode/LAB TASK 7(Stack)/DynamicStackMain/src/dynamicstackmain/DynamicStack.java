package dynamicstackmain;

public class DynamicStack<DT>{

    Node top;
    int size;
    DynamicStack(){
        top = null;
        size=-1;
    }

    boolean isEmpty() {
        return size == -1;
    }

    void push(DT item ){
        Node n = new Node(item);
        if(isEmpty()){
            top=n;
            size++;
        }
        else{
            n.next=top;
            top = n;
            size++;
        }
    }
    DT pop(){
        DT temp=(DT)"0";
        if(isEmpty()) System.out.println("UnderFlow Stack is empty");
        else if(size==0){
            temp=(DT)top.data;
            top=null;
            size--;
        }
        else{
            temp=(DT)top.data;
            Node p=top;
            top = top.next;
            p.next=null;
            size--;
        }
        return temp;
    }
    DT peek(){
        DT temp=(DT)"0";
        if(isEmpty()) System.out.println("UnderFlow Stack is empty");
        else{
            temp=(DT)top.data;
        }
        return temp;
    }


    void clear(){
        top = null;
        size=-1;
    }
    int length(){
        return size+1;
    }

    void copy(DynamicStack l){
        class rec{
            void recursion(Node p){
                DT temp;
                if(p==null) return;
                else{
                    temp=(DT)p.data;
                    recursion(p.next);
                    l.push(temp);
                }
            }
        }
        new rec().recursion(top);
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        int length=size;
        System.out.println("-    -");
        for (int i = 1; i <=length+1; i++) {
            System.out.println("| "+pop()+" |");
        }
        System.out.println(" ____");


    }


}