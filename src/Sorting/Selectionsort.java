package Sorting;

import java.util.Scanner;

public class Selectionsort {
    public void sort(int arr[],int n) {
        for (int i = 0; i < n - 1; i++) {
            int x = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[x])
                    x = j;
            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
        }
    }
    public void display(int arr[],int n){
        for(int i  =0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Selectionsort ss= new Selectionsort();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array : ");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i =0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        int arr[] = {3,5,2,6,8,4};
        ss.sort(arr,6);
        ss.display(arr,6);
    }
}
