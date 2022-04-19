package Graph;

import java.util.Scanner;

public class Adjacent_matrix {
    public void display(int arr[][],int v){
        for(int i= 0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Adjacent_matrix obj = new Adjacent_matrix();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vertices : ");
        int v = sc.nextInt();
        int arr[][] = new int[v][v];
        System.out.println("Enter the number of edge : ");
        int e = sc.nextInt();
        for(int i =0;i<e;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        obj.display(arr,v);
    }


}
