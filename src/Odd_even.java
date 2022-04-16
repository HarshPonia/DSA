import Assignment.SingleLinkedList;

public class Odd_even {
    int size;
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
    }
    Odd_even(){
        head=null;
        size =0;
    }
    public boolean IsEmpty(){
        return  size==0;
    }
    public  void insert(int d){
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
    public void check(){
        Node evenh = head.next;
        Node even = head.next;
        Node odd = head;
        while(even.next !=null){
            odd.next = even.next;
            odd = odd.next;
            even = odd.next;
            even = even.next;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Odd_even obj = new Odd_even();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);

    }
}
