package Graph;

import java.util.Scanner;

public class Undirect_graph {
    int v;
    int arr[][];

    public Undirect_graph(int n) {
        arr = new int[n][n];
        this.v = n;
    }

    public void insertedge(int x, int y) {
        arr[x][y] = 1;
        arr[y][x] = 1;
    }

    public void remove(int x, int y) {
        arr[x][y] = 0;
        arr[y][x] = 0;
    }

    public int vertice_count() {
        return v;
    }

    public boolean edgeExist(int x, int y) {
        return arr[x][y] != 0;
    }

    public void edges() {
        System.out.println("Edges are : ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (arr[i][j] != 0)
                    System.out.println(i + "-->" + j);
            }
        }
    }

    public int  egde_count() {
        int c = 0;
        System.out.println("total Edges are : ");
        for (int i = 0; i < v; i++)
            for (int j = 0; j < v; j++) {
                if (arr[i][j] != 0)
                    c++;
            }
        return c;
    }
    public int  indegree(int x){
        int c  =0;
        for(int y=0;y<v;y++){
            if(arr[y][x] !=0)
                c++;
        }
        return c;
    }
    public int outdegree(int x){
        int c =0;
        for (int i =0;i<v;i++){
            if(arr[x][i]!=0)
                c++;
        }
        return c;
    }
    public void display() {
        for (int x = 0; x < v; x++) {
            for (int y = 0; y < v; y++) {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the verticres");
        Undirect_graph obj = new Undirect_graph(sc.nextInt());
        obj.insertedge(1,2);
        obj.insertedge(2,3);
        obj.insertedge(3,1);
        obj.insertedge(1,4);
        obj.insertedge(1,4);
        obj.insertedge(4,3);
        obj.display();

    }
}
