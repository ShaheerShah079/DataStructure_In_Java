package lab5tasksinglylinkedlist;

class SinglyLinkedList{
    class Node{
        private int data;
        private Node next;
        Node(int el){
            data =el;
            next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    SinglyLinkedList(){
        head = null;
        tail=null;
        size=0;
    }
    boolean isEmpty(){
        return head==null;
    }
    void insertAtStart(int el){
        Node n = new Node(el);
        if(isEmpty()){
            head=n;
            tail=n;
            size++;
        }
        else{
            n.next=head;
            head=n;
            size++;
        }
    }

    void insertAtEnd(int el){
        Node n = new Node(el);
        if(isEmpty()) {
            head = n;
            tail = n;
            size++;
        }
        else{
            tail.next=n;
            tail=n;
            size++;
        }
    }
    void insertAt(int pos,int el) {
        Node n = new Node(el);
        if (pos > size + 1 || pos < 0) {
            System.out.println("Invalid");
        } else if (pos == 1) {
            insertAtStart(el);
        } else {
            Node p = head;
            for (int i = 1; i < pos - 1; i++) {
                p = p.next;
            }
            n.next = p.next;
            p.next = n;
            size++;
        }
    }
        void insertAfter(int val,int item){
        int pos=LinearSearch(val);
        if(pos==-1){
            System.out.println("Value not found");
        }
        else{
            insertAt(pos+1,item);
        }
        }
        private int LinearSearch(int val){
        Node p=head;
        int location=-1;
            for (int i = 1; i <=size; i++) {
                if(p.data==val){
                    location=i;
                    break;
                }
                else{
                    p=p.next;
                }
            }
            return location;
    }
    void display(){
        Node p=head;
        for (int i = 1; i <=size; i++){
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println("");
    }    
    int deleteATStart(){
        int temp;
        if(isEmpty()) {
            System.out.println("List is empty ");
            return 0;
        }
        else if(head.next==null){
            temp=head.data;
            head =null;
            tail=null;
            size--;
        }
        else{
            temp=head.data;
            head = head.next;
            size--;
        }
        return temp;
    }

    int deleteATEnd(){
        int temp;
        if(isEmpty()) {
            System.out.println("List is empty ");
            return 0;
        }
        else if(head.next==null){
            temp=tail.data;
            deleteATStart();
        }
        else{
            Node p=head;
            temp=tail.data;
            for (int i=1;i<size-1;i++){
                p=p.next;
            }
            tail=p;
            tail.next=null;
            size--;
        }
        return temp;
    }
    int deleteAT(int pos){
        int temp;
        if(pos>size+1||pos<0) {
            System.out.println("Invalid");
            return 0;
        }
        else if(pos==1){
            temp=head.data;
            deleteATStart();
        }
        else{
            Node p=head;
            for (int i=1;i<pos-1;i++){
                p=p.next;
            }
            temp=p.next.data;
            p.next=p.next.next;
            size--;
        }
        return temp;
    }
    int deleteValue(int val){
        int pos=LinearSearch(val);
        if(pos==-1){
            System.out.println("Value Not found");
            return 0;
        }
        else{
            return deleteAT(pos);

        }
    }
    int length(){
        return size;
    }
    void clear(){
        head=null;
        tail=null;
        size=0;
        System.out.println("List Clear!!!!");
    }
    void copy(SinglyLinkedList l){
        Node p=head;
        for (int i = 1; i <=size; i++) {
            l.insertAtEnd(p.data);
            p=p.next;
        }
        System.out.println("List copied!!!!!!");
    }

}


