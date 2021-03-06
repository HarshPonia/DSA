package DoublyLinkedList;

import Assignment.SingleWithTail;
import Single_LinkedList.Linked_List;

public class DemoDoubly {
    static Node head;
    static Node tail;
    static int size;

    static class Node {
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
    public void insertAtPos(Node n,int pos){
        if(pos<=0 || pos>size+1){
            System.out.println("Invalid position ");
        }
        else {
            if(pos == 1){
                head.prev = n;
                n.next = head;
                head = n;
            }
            else {
                Node temp = head;
                int i =1;
                while(i<pos-1){
                   temp = temp.next;
                   i++;
                }
                n.next = temp.next;
                temp.next = n;
                n.prev = temp.prev;
                temp.prev = n;
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
            size--;
            if(IsEmpty())
                tail = null;
           else {
               head.prev = null;
            }
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
    public int DeleteWithNode(Node n){
        int e = -1;
        if(head == null){
            System.out.println("No element ");
            return e;
        }
        else{
            if(head.data == n.data){
                e  = head.data;
                head = head.next;
                head.prev = null;
                size--;
                return  e;

            }
            else {
                Node temp = head;
                while (temp != null) {
                    if (temp.next.data == n.data) {
                        e = temp.next.data;
                        temp.next = temp.next.next;
                        break;
                    }
                    temp = temp.next;
                }
                size--;
                return e;
            }
        }
    }
    public int count_Node(){
        Node temp = head;
        int c = 0;

        if(temp!=null){
            c++;
            count_Node();

            temp = temp.next;
        }
        return c;
    }
    public int Search(int d){
        if(head == null){
            return  -1;
        }
        else {
            Node temp = head;
            int i = 1;
            while (temp!=null){
                if(temp.data == d){
                    return i;
                }
                temp =temp.next;
                i++;
            }
            return -1;
        }
    }
    public int SearchWithNde(Node n){
        if(head == null){
            return  -1;
        }
        else {
            Node temp = head;
            int i = 1;
            while (temp!=null){
                if(temp.data == n.data){
                    return i;
                }
                temp =temp.next;
                i++;
            }
            return -1;
        }
    }
    public static void main(String args[]){
        DemoDoubly obj = new DemoDoubly();
        obj.InsertAtBeg(10);
//        obj.InsertAtBeg(5);
//        obj.InsertAtEnd(15);
//        obj.InsertAtEnd(20);
//        obj.InsertAtEnd(25);
        obj.InsertAtPos(17,1);
        System.out.println("Deleted element is : " + obj.DeleteAtBeg());
        System.out.println("Deleted element is : " + obj.DeleteAtBeg());
        System.out.println("Deleted element is : " + obj.DeleteAtBeg());
////        System.out.println("Deleted element is : " + obj.DeleteAtEnd());
////        System.out.println("Deleted element is : " + obj.DeleteAtpos(2));
////        obj.insertAtPos(new Node(21),6);
//        obj.Display();
////        System.out.println("Result : "+ obj.Search(20));
////        System.out.println("Result "+ obj.SearchWithNde(new Node(20)));
////        System.out.println("Deleted elemen is :"+ obj.DeleteWithNode(new Node(20)));
////        obj.Display();
//        System.out.println("the Size of The linkedList is : "+ obj.length());
        System.out.println(obj.count_Node());
    }
}
