package Queue;

import java.util.Scanner;

public class Dequeue {
    Node front;
    Node rear;
    int size;
    class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
        }
    }
    Dequeue(){
        size = 0;
        rear = null;
        front = null;
    }
    boolean IsEmpty(){
        return size == 0;
    }
    public  void Insertfornt(int d){
        Node new_node = new Node(d);
        if(IsEmpty()){
            front = new_node;
            rear = new_node;
        }
        else{
            new_node.next = front;
            front = new_node;
        }
        size++;
    }
    public  void insertRear(int d){
        Node new_node =  new  Node(d);
        if(IsEmpty()){
            front = new_node;
        }
        else {
            rear.next = new_node;
        }
        rear = new_node;
        size++;
    }

    public int deletefront(){
        if(IsEmpty()){
            System.out.println("Queue is empty");
        }
        int e= front.data;
        front = front.next;
        size--;
        return  e;
    }
    public int deleteRear(){
        if (IsEmpty()){
            System.out.println("Queue is empty ");
        }
        Node temp = front;
        int i = 1;
        while (i<size-1) {
            temp = temp.next;
            i++;
        }
        rear = temp;
        int e = rear.data;
        rear.next = null;
        size--;
        return  e;
    }
    public void display(){
        Node temp = front;
        while(temp != null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Dequeue obj =  new Dequeue();
        Scanner sc = new Scanner(System.in);
        obj.Insertfornt(10);
        obj.Insertfornt(20);
        obj.insertRear(30);
        obj.insertRear(40);
        obj.display();
        System.out.println("Deleted element : : " + obj.deletefront());
        System.out.println("Deleted Element : " + obj.deleteRear());
        obj.display();
    }
}
