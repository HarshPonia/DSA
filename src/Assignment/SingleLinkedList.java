package Assignment;

import CircularLinkedList.DemoCircular;

public class SingleLinkedList {
    Node head;
    int size;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
        }
    }
    SingleLinkedList(){
        size = 0;
        head = null;
    }
    public int length(){
        return size;
    }
    public boolean IsEmpty(){
        return  size==0;
    }

    public void InsertAtBeg(int d){
        Node new_node = new Node(d);
        if(IsEmpty()){
            head = new_node;

        }
        else{
            new_node.next = head;
            head = new_node;
        }
        size++;
    }
    public  void insertAtEnd(int d){
        Node new_node = new Node(d);
        if(IsEmpty()){
            head = new_node;
        }
        else{
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = null;
        }
        size++;
    }
    public void insertAtPos(int d,int pos){
        Node new_node = new Node(d);
        if (pos <= 0 || pos >= size) {
            System.out.println("Invalid position : ");
        }
        else {
            if (pos == 1) {
                new_node.next = head;
                head = new_node;
            }
            else {
                Node temp = head;
                int i = 1;
                while (i < pos - 1) {
                    temp = temp.next;
                    i = i + 1;
                }
                new_node.next = temp.next;
                temp.next = new_node;
            }
            size++;
        }
    }
    public void InsertAtPosWithNode(int d,Node n){
        if (n == null)
        {
            System.out.println("The given node cannot be null");
        }
        else {
            Node new_node = new Node(d);
            new_node.next = n.next;
            n.next = new_node;
            size++;
        }
    }
    public int  DeleteAtBeg(){
        int e = head.data;
        head = head.next;
        size--;
        return  e;
    }
    public int DeleteAtEnd(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int e = temp.next.data;
        temp.next = null;
        size--;
        return e;
    }
    public int DeleteAtPos(int pos){
    if(pos<= 0 || pos>size-1){
        System.out.println("Invalid position ");
    }
    Node temp = head;
    int i  =1;
    while(i<pos-1){
        temp = temp.next;
    }
    int e = temp.next.data;
    temp.next = temp.next.next;
    size--;
    return e;
    }
    public int deleteWithNode(Node n){
        if(IsEmpty()){
            System.out.println("List is Empty");
        }
        int i =1;
            Node temp = head;
            while(temp!=null){
                if(temp.next.data ==n.data)
                {
                   int e = temp.next.data;
                    temp.next = temp.next.next;
                    size--;
                    return e;
                }

                temp = temp.next;
                i++;
            }



        return  -1;
    }
    public int Searching(int e){
        int i = 1;
        Node temp = head;
        while(temp!=null){
            if(temp.data == e){

                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public  int Search(Node n){
        int i = 1;
        Node temp = head;
        while(temp!=null){
            if(temp.data == n.data){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public  void display(){
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data + " ");
            currnode = currnode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleLinkedList obj =  new SingleLinkedList();
        Node n = new Node(20);
        obj.InsertAtBeg(20);
        obj.InsertAtBeg(10);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtPos(35,3);
        obj.InsertAtPosWithNode(25,obj.head.next);
        obj.display();
//        System.out.println("deleted Element : " + obj.DeleteAtBeg());
//        System.out.println("Deleted Element : " + obj.DeleteAtEnd());
//        System.out.println("Deleted element : " + obj.DeleteAtPos(1));
//        System.out.println("Deleted element : " + obj.DeleteAtPos(1));
        System.out.println("Deleted Element  " + obj.deleteWithNode(n));
//        int pos =  obj.Searching(18);
//        int pos1 = obj.Search(n);
//        System.out.println("Result :"+pos);
//        System.out.println("Result: " + pos1);
//        System.out.println(obj.length());
        obj.display();
    }
}
