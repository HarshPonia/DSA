package Recursion;


public class Fabonacci {
    static int a = 0,b= 1,x;
    public void print(int n){
        if(n-2>0){
            x = a+b;
            System.out.print( x+ " ");
            a = b;
            b = x;

            print(n-1);
        }
    }

    public static void main(String[] args) {
        Fabonacci obj = new Fabonacci();
        System.out.print(a + " "+ b + " ");
        obj.print(10);


    }
}
