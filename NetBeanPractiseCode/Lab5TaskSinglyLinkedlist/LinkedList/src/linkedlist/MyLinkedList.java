package linkedlist;

public class MyLinkedList<DT>
{
    Node<DT> head;
    Node<DT> tale;
    int size;
    MyLinkedList(){
        head = null;
        tale = null;
        size=0;
    }
    class Node<DT>{
        DT data;
        Node next;
        Node(DT el){
            data = el;
            next=null;
        }
    }
    
    boolean isEmpty(){
        return head==null;
    }
    void insertAtStart(DT el){
        Node<DT> n = new Node(el);
        if(isEmpty()){
            head=n;
            tale=n;
            size++;
                    
        }
        else{
            n.next=head;
            head=n;
            size++; 
        }
    }
    
    void insertAtEnd(DT el){
        Node<DT> n = new Node(el);
        if(isEmpty()){
            head = n;
            tale= n;
            size++;
        }
        else{
            tale.next=n;
            tale=n;
            size++;
            
        }
    }
    void insertAt(int pos,DT el){
        Node<DT> n = new Node(el);
        if(pos>size+1||pos<0){
            System.out.println("Invalid");
        }
        else{
            Node p=head;
            for(int i=1;i<pos-1;i++){
             p=p.next;
            }
            n.next=p.next;
            p.next=n;
            size++;
        }
                
        
    }
    void display(){
        Node p=head;
        for (int i = 1; i <=size; i++){
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println("");
        {
            
        }
    }
    
}
