package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_iterations {
    public int searchBinary(int Arr[],int len , int data){
        Arrays.sort(Arr);
        int l = 0;
        int r = len-1;
        while(l<=r){
            int m  = (l+r)/2;
            if(data==Arr[m]){
                return m;
            }
            else if(data<Arr[m])
                r = m-1;
            else if(data>Arr[m])
                l = m+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch_iterations bs = new BinarySearch_iterations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n  =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Element : ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search : ");
        System.out.println("Result : "+ bs.searchBinary(arr,n,sc.nextInt()) );
    }
}
