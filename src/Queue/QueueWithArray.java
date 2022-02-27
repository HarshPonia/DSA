package Queue;

public class QueueWithArray {
    int arr[];
    int front;
    int rear;
    int size;

    public QueueWithArray(int n){
        arr = new int[n];
        front = 0;
        rear = 0;
        size =0;
    }
    public int length(){
        return size;
    }
    public boolean isfull(){
        return  size==arr.length;
    }public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(int d){
        if(isfull()){
            System.out.println("Queue is full ");
        }
        else {
            arr[rear] = d;
            rear++;
            size++;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return -1;
        }
        else {
            int e  = arr[front];
            front++;
            size--;
            return e;
        }
    }
    public int front(){
        if (isEmpty()){
            System.out.println("Queue is empty ");
            return -1;
        }
        else {
            return arr[front];
        }
    }
    public void display(){
        for(int i = front;i<rear;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static  void main(String args[]){
        QueueWithArray obj = new QueueWithArray(20);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        System.out.println("Length " + obj.size);
        System.out.println("Deleted element  : "+ obj.dequeue());
    obj.display();
        System.out.println("front element is " + obj.front());
    }
}
