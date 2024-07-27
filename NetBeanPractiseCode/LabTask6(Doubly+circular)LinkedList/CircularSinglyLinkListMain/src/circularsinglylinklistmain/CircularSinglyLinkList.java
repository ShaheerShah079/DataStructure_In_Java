package circularsinglylinklistmain;

public class CircularSinglyLinkList<DT>
{
Node<DT> head;
   Node<DT> tale;
    int size;
    CircularSinglyLinkList(){
        head = null;
        tale = null;
        size=0;
    }
    boolean isEmpty(){
        return head==null;
    }
    void insertAtStart(DT el){
       Node<DT> n = new Node<>(el);
        if(isEmpty()){
            head=n;
            tale=n;
            tale.next=head;
            size++;
        }
        else{
            n.next=head;
            head=n;
            tale.next=head;
            size++;
        }
    }

    void insertAtEnd(DT el){
        Node<DT> n = new Node<>(el);
        if(isEmpty()) {
            head = n;
            tale = n;
            tale.next=head;
            size++;
        }
        else{
            tale.next=n;
            tale=n;
            tale.next=head;
            size++;

        }
    }
    void insertAt(int pos,DT el){
       Node<DT> n = new Node<>(el);
        if(pos>size+1||pos<0){
            System.out.println("Invalid");
        }
        else if(pos==1){
            insertAtStart(el);
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
    private int linearSearch(DT el){
       Node temp=head;
        int location=-1;
        for (int i = 1; i <=size; i++) {
            if(temp.data==el){
                location=i;
                break;
            }
            temp=temp.next;
        }
        return location;
    }
    void insertAfter(DT val,DT item){
        int pos=linearSearch(val);
        if(pos==-1){
            System.out.println("Element Not Found");
        }
        else{
            insertAt(pos+1,item);
        }
    }
    void display(){
        Node p=head;
        for (int i = 1; i <=size; i++){
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println("");
    }

    DT deleteATStart(){
        DT temp;
        if(isEmpty()) {
            System.out.println("List is empty ");
            return (DT) "0";
        }
        else if (size == 1) {
            temp = head.data;
            head = null;
            tale = null;
            size--;
        }
        else{
            temp=head.data;
            head = head.next;
            tale.next=head;
            size--;
        }
        return temp;
    }

    DT deleteATEnd(){
        DT temp;
        if(isEmpty()) {
            System.out.println("List is empty ");
            return (DT) "0";
        }
        else if (size == 1) {
            temp = head.data;
            head = null;
            tale = null;
            size--;
        }
        else{
            temp=tale.data;
           Node p=head;
            for (int i=1;i<size-1;i++){
                p=p.next;
            }
            tale=p;
            tale.next=head;
            size--;
        }
        return temp;
    }
    DT deleteAT(int pos){
        DT temp;
        if(pos>size+1||pos<0) {
            System.out.println("Invalid");
            return (DT) "0";
        }
        else if (size == 1) {
            temp = head.data;
            head = null;
            tale = null;
            size--;
        }
        else{
           Node sl=head;
            for (int i=1;i<pos-1;i++){
                sl=sl.next;
            }
            temp=(DT)sl.next.data;
            sl.next=sl.next.next;
            size--;
        }
        return temp;
    }
    DT deleteValue(DT el) {
        DT temp;
        int pos = linearSearch(el);
        if (pos == -1) {
            System.out.println("ELement not Found");
            return (DT) "0";

        }
        else{
            temp=deleteAT(pos);
        }
        return temp;
    }
    void update(DT el,int pos){
        if(pos>size||pos<0) {
            System.out.println("Invalid");
        }
        else{
            Node p=head;
            for (int i=1;i<pos;i++){
                p=p.next;
            }
            p.data=el;
        }
    }
    int length(){
        return size;
    }
    void clear(){
        size=0;
        head=null;
        tale=null;
    }
    void copy(CircularSinglyLinkList<DT> l){
       Node p=head;
        for (int i=1;i<=size;i++){
            l.insertAtEnd((DT)p.data);
            p=p.next;
        }
    }
    
}
