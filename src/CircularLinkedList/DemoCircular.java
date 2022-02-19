package CircularLinkedList;
import Assignment.SingleWithTail;

import java.util.Scanner;

public class DemoCircular {
    Node tail;
    int size;
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
        }
    }
    DemoCircular(){
        tail = null;

        size = 0;
        head = null;
    }
    public  int length(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void InsertAtEnd(int d){
     Node new_node = new Node(d);
     if(isEmpty()){
         new_node.next = new_node;
         head =  new_node;
     }
     else{
         new_node.next = tail.next;
         tail.next = new_node;
     }
     tail = new_node;
        size++;
    }
    public void insertAtBeg(int d){
        Node new_node = new Node(d);
        if(isEmpty()){
            new_node.next = new_node;
            head = new_node;
            tail = head;
        }
        else{
            tail.next = new_node;
            new_node.next = head;
            head = new_node;

        }
//        tail = new_node;
        size++;
    }
    public void InserAtPos(int d,int pos) {
//        Node new_node = new Node(d);
//        if(isEmpty()){
//            if(pos!= 1){
//                System.out.println("Invalid position");
//            }
//            else {
//                new_node.next = new_node;
//                head = new_node;
//            }
//        }
//        else{
//            if(pos>size+1){
//                System.out.println("Invalid Position ");
//            }
//            else{
//                int i = 1;
//                Node currnode = head;
//                while(i<pos-1){
//                    currnode = currnode.next;
//                    i++;
//                }
//                new_node.next = currnode.next;
//                currnode.next = new_node;
//                size++;
//            }
//        }
        Node new_node = new Node(d);
        if (pos <= 0 || pos >= size) {
            System.out.println("Invlid position : ");
        }
        else {
            if (pos == 1) {
                tail.next = new_node;
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
    public void InsertWithNode(Node n,int pos) {
        if (pos<=0 || pos>size+1) {
            System.out.println("Invalid Postion ");
        }
        else {
            if (pos == 1) {
                tail.next = n;
                n.next = head;
                head = n;
            }
            else {
                Node temp = head;
                int i = 1;
                while (i < pos - 1) {
                    temp = temp.next;
                    i = i + 1;
                }
                n.next = temp.next;
                temp.next = n;
            }
            size++;
        }
    }

    public void display(){
        int i =1;
        Node currnode = head;
        while (i<size){
            System.out.print(currnode.data + " ");
            currnode = currnode.next;
            i++;
        }
        System.out.println();

    }
    public int  DeleteAtBeg() {
        if (head == null) {
            System.out.println("No element ");
            return -1;
        } else {
            int e = head.data;
            head = head.next;
            tail.next = head;
            size--;
            return e;
        }
    }
    public  int  DeleteAtEnd(){
        Node temp = head;
        int i =1;
        while (i<size){
            temp = temp.next;
            i++;
        }
        int e = temp.data;
        temp.next = head;
        tail = temp;
        size--;
        return e;
    }
    public  int DeleteAtPos(int pos) {
        if (pos <= 0 || pos >= size - 1) {
            System.out.println("Invalid position");
        } else {
            if (pos == 1) {
                head = head.next;
                tail.next = head;
            } else {
                Node temp = head;
                int i = 1;
                while (i < pos - 1) {
                    temp = temp.next;
                    i = i + 1;
                }
                int e = temp.next.data;
                temp.next = temp.next.next;
                return e;
            }
            size--;
        }
        return -1;
    }
    public int  DeleteWithNode(Node n){
        int e = -1;
        if(isEmpty()){
            System.out.println("No Element ");
            return e;
        }
        else {
            if(head.data == n.data){
                e = head.data;
                head = head.next;
                tail.next = head;
                size--;
                return e;
            }
            else {
                Node temp = head;
                while (temp.next!=head){
                    if ((temp.next.data == n.data)){
                        e = temp.next.data;
                        temp.next = temp.next.next;
                        break;
                    }
                    temp = temp.next;
                }
                size--;
            }

            return e;
        }
    }
    public int search(int d){
        if(head == null){
            return  -1;
        }
        else {
            Node temp = head;
            int i = 1;
            while (temp.next!=head){
                if(temp.data == d){
                    return i;
                }
                temp =temp.next;
                i++;
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        DemoCircular obj = new DemoCircular();
//        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();
//        for(int i =0;i<n;i++){
//            obj.InsertAtEnd(sc.nextInt());
//        }
////        obj.insertAtBeg(sc.nextInt());
////        obj.display();
//        System.out.println("Enter the element and position : ");
//        obj.InserAtPos(sc.nextInt(), sc.nextInt());
//        System.out.println("Length of Linked List  : " + obj.length());
//        obj.display();
        obj.insertAtBeg(10);
        System.out.println("Length of Linked List  : " + obj.length());
        obj.InsertAtEnd(20);
        obj.InsertAtEnd(30);
//        obj.insertAtBeg(10);
        obj.InsertAtEnd(40);
        obj.InsertAtEnd(50);
//        obj.InserAtPos(40 ,1);
//        obj.display();
//        System.out.println("The size of Linked List is : "+ obj.length());
//        System.out.println("Deleted element : " + obj.DeleteAtBeg());
        System.out.println("Deleted Element : " + obj.DeleteWithNode(new Node(10)));
//        obj.display();
//        System.out.println("The size of Linked List is : "+ obj.length());
//        System.out.println("Deleted element  : " + obj.DeleteAtEnd());
//        System.out.println("Deleted element : " + obj.DeleteAtPos(3));
//        obj.InsertWithNode(new Node(61),1);
        System.out.println("Result : "+ obj.search(20));
        obj.display();
        System.out.println("The size of Linked List is : "+ obj.length());
    }
}
