package Sorting;

public class InsertionSort {
    public void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public void print(int arr[],int n){
        for(int i =0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[ ]  = {10 ,5,20, 15, 30 ,25};
        InsertionSort obj = new InsertionSort();
        obj.sort(arr);
        obj.print(arr, arr.length);
    }
}
