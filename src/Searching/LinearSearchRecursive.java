package Searching;

import java.util.Scanner;

public class LinearSearchRecursive {
//    int arr[];
//    LinearSearchRecursive(int n){
//        arr = new int[n];
//    }
    public int SearchRecursive(int arr[], int data,int i){
        if(data == arr[i]){
            return i;
        }
        if(i== arr.length){
            return -1;
        }
        return SearchRecursive(arr,data,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        LinearSearchRecursive obj = new LinearSearchRecursive();
        int arr [] = new  int[n];
        System.out.println("Enter the element : ");
       for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the You Want to search : ");
        System.out.println("Result: " + obj.SearchRecursive(arr, sc.nextInt(),0));
    }
}
