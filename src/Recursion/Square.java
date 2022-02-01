package Recursion;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Square {
    int n;
    void print(int n){
        if(n>0)
        {
            System.out.println("Square of " + n + " " + n*n);
            print(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Square obj = new Square();
        obj.print(n);
    }
}
