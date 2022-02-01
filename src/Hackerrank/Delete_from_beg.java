package Hackerrank;

import java.util.Scanner;

public class Delete_from_beg {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insert(int d){
        Node new_node = new Node(d);
        if(head == null){
            head = new_node;
            new_node.next = null;

        }
        else{
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }
    public  void print(){
        Node curnode = head;
        while(curnode!=null)
        {
            System.out.print(curnode.data + " ");
            curnode = curnode.next;
        }

    }
    public int delete(){
        Node temp = head;
        if(head == null){
            System.out.println("invalid operation \n");
        }
        else {

            head = head.next;

        }
        System.out.println(head.data);
        return temp.data;

    }
    public static void main(String[] args) {
        Delete_from_beg obj = new Delete_from_beg();
        Scanner sc = new Scanner(System.in);
//        obj.delete();
        for(int i =0;i<5;i++){
            obj.insert(sc.nextInt());
        }
        System.out.println(obj.delete());
        obj.print();
    }


}
