package DoublyLinkedList;

public class DemoDoubly {
    Node head;
    Node tail;
    int size;

    class Node {
        Node prev;
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    DemoDoubly() {
        size = 0;
        tail = null;
        head = null;
    }

    public int length() {
        return size;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public void InsertAtBeg(int d) {
        Node new_node = new Node(d);
        if(IsEmpty()){
            head = new_node;
            tail = new_node;
        }
        else{
            head.prev = new_node;
            new_node.next = head;
            head = new_node;
        }
        size++;
    }
    public void InsertAtEnd(int d){
        Node new_node = new Node(d);
        if(IsEmpty()){
            head = new_node;
            tail = new_node;
        }
        else {
//            Node temp = head;
//            while(temp.next!=null){
//                temp = temp.next;
//            }
//            temp.next = new_node;
//            new_node.prev = temp;
//            tail = new_node;
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
        size++;
    }

    public void InsertAtPos(int d,int pos) {
        if (pos <= 0 || pos > size) {
            System.out.println("Invalid Position ");
        } else {
            Node new_node = new Node(d);
            if(pos == 1){
                head.prev = new_node;
                new_node.next = head;
                head = new_node;
            }
            else {

                Node temp = head;
                int i = 1;
                while (i < pos - 1) {
                    temp = temp.next;
                    i++;
                }
                new_node.next = temp.next;
                temp.next = new_node;
                new_node.prev = temp.prev;
                temp.prev = new_node;

            }
            size++;
        }
    }
    public void Display(){
        int i =0;
        Node temp = head;
        while(i<length()){
            System.out.print(temp.data + " ");
            temp = temp.next;
            i++;
        }
        System.out.println();
    }
    public int DeleteAtBeg(){
//        int e;
        if(IsEmpty()){
            System.out.println("LinkedList Is empty ");
        }
        else{
            int e = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return e;
        }
        return 0;
    }
    public int  DeleteAtEnd(){
        if(IsEmpty()){
            System.out.println("Linked List  is Already Empty ");
        }
        else {
            int e = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
            return e;
        }
        return 0;
    }
    public int DeleteAtpos(int pos){
        int e = 0;
        if(pos<=0 || pos>size){
            System.out.println("Invalid position ");
        }
        else {
            if(pos == 1){
                e =  head.data;
                head = head.next;
                head.prev = null;
            }
            else if(pos == size){
                e = tail.data;
                tail = tail.prev;
                tail.next = null;
            }
            else {
                Node temp = head;
                int i = 1;
                while(i<pos-1){
                    temp = temp.next;
                    i++;
                }
                e = temp.next.data;
                temp.next = temp.next.next;
                temp.prev = temp.next.prev;
            }
            size--;
        }
        return e;
    }
    public static void main(String args[]){
        DemoDoubly obj = new DemoDoubly();
        obj.InsertAtBeg(10);
        obj.InsertAtBeg(5);
        obj.InsertAtEnd(15);
        obj.InsertAtEnd(20);
        obj.InsertAtEnd(25);
        obj.InsertAtPos(17,1);
//        System.out.println("Deleted element is : " + obj.DeleteAtBeg());
//        System.out.println("Deleted element is : " + obj.DeleteAtEnd());
//        System.out.println("Deleted element is : " + obj.DeleteAtpos(2));
        obj.Display();
        System.out.println("the Size of The linkedList is : "+ obj.length());
    }
}
