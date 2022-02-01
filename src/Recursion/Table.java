package Recursion;

import java.util.Scanner;

public class Table {
    public void print_table(int n){
        int i = 1;
       while(i<=10) {
           System.out.println(n * i);
           i++;
       }
    }

    public static void main(String[] args) {
        Table obj = new Table();
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        obj.print_table(n);
    }
}
