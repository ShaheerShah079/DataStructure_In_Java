
package listdemo;

public class ListDemo
{
    public static void main(String[] args)
    {
    MyList<Integer> l=new MyList<>(10);
    System.out.println(l.deleteAtEnd());
    l.insertAtEnd(2);
    l.insertAtEnd(3);
    l.insertAtEnd(4);
    l.insertAtEnd(5);
    l.display();
    l.insertAtFirst(1);
    l.display();
    l.insertAtFirst(0);
    l.display();
    l.insert(6, 7);
    l.display();
    l.insert(6, 9);
    l.display();
    l.insert(7,3);
    l.display();
    l.insert(8, 4);
    l.display();
    l.insert(9, 3);
    l.display();
    l.insertAtEnd(5);
    l.display();
    System.out.println(l.deleteAtEnd());
    l.display();
    System.out.println(l.deleteAtFirst());
    System.out.println(l.deleteAtFirst());
    System.out.println(l.deleteAtFirst());
    System.out.println(l.deleteAtFirst());
    l.display();
    System.out.println(l.delete(3));
    l.insertAtEnd(45);
    l.display();
    l.update(2, 39);
    l.display();
    MyList<Integer> l2=new MyList<>(20);
    l.copy(l2);
    l2.display();
    System.out.println(l.delete(23));
    
    }
    
}
class MyList<DT> {
    DT [] a;
    int size;
    MyList(int n){
        a=(DT[])new Object[n];
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==a.length;
    }
    
    void insertAtEnd(DT el){
    if(isFull()){
        System.out.println("Array is full");
    }
    else{
        a[size]=el;
        size++;
    }
    }
    void insertAtFirst(DT el){
        if(isFull()){
            System.out.println("Array is full");
        }
        else{
          for(int i=size;i>=1;i--){
              a[i]=a[i-1];
          }
          a[0]=el;
          size++;
        }
    }
    void insert(DT el,int pos){
        if(isFull()){
            System.out.println("Array is full");
        }
        else if((pos-1)>size){
            
            System.out.println("invalid position");
        }
        else{
          for(int i=size;i>=pos;i--){
              a[i]=a[i-1];
          }
          a[pos-1]=el;
          size++;
    }
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println("");    
    }
    
    DT deleteAtEnd(){
        if(isEmpty()){
            System.out.println("List is empty");
            return (DT)"0";
        }
        else{
            size--;
        }
        return a[size];
    }
    DT deleteAtFirst(){
        DT temp;
        if(isEmpty()){
            System.out.println("List is empty");
            return (DT)"0";        
        }
        else{
            temp=a[0];
            for(int i=0;i<size-1;i++){
                a[i]=a[i+1];
            }
            size--;
            
        }
        return temp;
    }
    DT delete(int pos){
        DT temp;
        if(isEmpty()){
            System.out.println("List is empty");
            return (DT)"0";
        }
        else if(pos>size||pos<1){
            System.out.println("Invalid index");
            return (DT)"0";
        }
        else{
            temp=a[pos-1];
            for(int i=pos-1;i<size-1;i++){
                a[i]=a[i+1];
            }
            size--;
        }
        return temp;
    }
    void update(int pos,DT el){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else if(pos>size||pos<1){
            System.out.println("Invalid index");
        }
        else{
            a[pos-1]=el;
        }
    }
    void copy(MyList l){
        for(int i=0;i<this.size;i++){
            l.insertAtEnd(a[i]);
        }
    }
    
    
    
    
    
}