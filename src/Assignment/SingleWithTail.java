package Assignment;

import javax.naming.NameNotFoundException;

public class SingleWithTail {
    static Node head,tail;
   static int size = 0;
   static class Node {
        int data;
        Node next;

       @Override
       public String toString() {
           return data+"";
       }

       Node(int d){
            next = null;
            this.data = d;
        }
    }
//    public boolean Isempty(){
//        return  size==0;
//    }
    public int length()
    {
        return size;
    }
    public static void InsertAtbeg(int d){
        Node new_node = new Node(d);
        if(head == null){
            head = new_node;
            tail = new_node;
        }
        else {
            new_node.next = head;
            head = new_node;
        }
        size++;
    }
    public void InsertAtEnd(int d){
        Node new_node = new Node(d);
        if (head==null){
           head = new_node;
           tail = new_node;
        }
        else {
            tail.next = new_node;
            tail = new_node;
        }
        size++;
    }
    public void InsertAtPos(int d,int pos){
        Node new_node = new Node(d);
        if(pos<=0 || pos>size+1){
            System.out.println("Invalid position : ");
        }
        else {
            if(pos==1){
                InsertAtbeg(d);
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
        }
        size++;
    }
    public Node deleteAtEnd(){
       if(head==null){
           return head;
       }
       else {
           Node temp = tail;
           tail = head;
           while (tail.next.next!=null)
               tail = tail.next;
           tail.next = null;
           size--;
           return temp;
       }

    }
    public Node DeleteAtPos(int pos){
       if (head == null){
           return head;
       }
       else {
           Node temp = head,t;
           int i = 1;
           while(i<pos-1){
               temp = temp.next;
               i++;
           }
           t= temp.next;
           temp.next = temp.next.next;
           size--;
           return t;
       }
    }
    public Node DeleteAtPosition(int d) {
        if (head == null) {
            return head;
        }
        else {
            Node temp = head, t = null;
            if (head.data == d) {
                t = head;
                head = head.next;
                size--;
            } else {
                while (temp != null) {
                    if (temp.next.data == d) {
                        t = temp.next;
                        temp.next = temp.next.next;
                        break;
                    }
                    temp = temp.next;
                }
            }
            size--;
            return t;
        }
    }
    public Node DeleteWithNode(Node n){
       if(head == null){
           return head;
       }
       else {
           Node temp = head, p = null;
           if (head.data == n.data) {
               p = head;
               head = head.next;
               size--;
           } else {
               while (temp != null) {
                   if (temp.next.data == n.data) {
                       p = temp.next;
                       temp.next = temp.next.next;
                       break;
                   }
                   temp = temp.next;
               }
               size--;
           }
           return p;
       }
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

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        SingleWithTail obj = new SingleWithTail();
        obj.InsertAtbeg(40);
        obj.InsertAtbeg(30);

        obj.InsertAtbeg(20);
        obj.InsertAtEnd(50);
        SingleWithTail.InsertAtbeg(10);
        obj.InsertAtPos(50 ,2);
        obj.InsertAtPos(60,6);
        System.out.println("Deleted Eelement : " + obj.deleteAtEnd());
        System.out.println(obj.DeleteAtPos(3));
        System.out.println(obj.DeleteAtPosition(50));
        System.out.println(obj.DeleteWithNode(new Node(50)));
        System.out.println("Result: " + obj.Search(50));
        System.out.println("result " + obj.SearchWithNde(new  Node(50)));
        System.out.println("lenght : " + obj.length());
        obj.display();

    }

}
