import java.util.Scanner;

public class largest {
    static int large(int arr[]){
            int a = arr[0];
            for(int i =0;i< arr.length;i++)
            {
                if(arr[i]>a){
                    a = arr[i];
                }
            }
            return a;
    }
    static int small(int arr[]){
        int a = arr[0];
        for(int i =0;i<arr.length;i++){
            if(a>arr[i]){
                a =  arr[i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(small(arr));
        System.out.println(large(arr));

    }
}
