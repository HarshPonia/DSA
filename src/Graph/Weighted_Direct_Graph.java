package Graph;

import java.util.Scanner;

public class Weighted_Direct_Graph {
    int vertices;
    int arr[][];
    public Weighted_Direct_Graph(int n){
        arr = new int[n][n];
        vertices = n;
    }
    public void insertEge(int x,int y,int w){
        arr[x][y] = w;
    }
    public void remove(int x,int y){
        arr[x][y] = 0;
    }
    public boolean EgdeExist(int x,int y){
        return arr[x][y]!=0;
    }
    public int vertex_count(){
        return vertices;
    }
    public  int egde_count(){
        int count = 0;
        for(int i =0;i<vertices;i++){
            for (int j =0;j<vertices;j++){
                if(arr[i][j]!=0)
                    count++;
            }
        }
        return count;
    }
    public void egde(){
        System.out.println("Edges : ");
        for ( int i =0;i<vertices;i++)
            for (int j =0;j<vertices;j++){
                if(arr[i][j]!=0){
                    System.out.println(i+"---"+j);
                }
            }
    }
    public int outdegree(int x){
        int count =0;
        for(int y =0;y<vertices;y++){
            if(arr[x][y]!=0)
                count++;
        }
        return count;
    }
    public int indegree(int x){
        int count =0;
        for(int y =0;y<vertices;y++){
            if(arr[y][x]!=0)
                count++;
        }
        return count;
    }
    public void display() {
        for (int x = 0; x < vertices; x++) {
            for (int y = 0; y < vertices; y++) {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Weighted_Direct_Graph g = new Weighted_Direct_Graph(5);
        g.insertEge(0,1,16);
        g.insertEge(1,2,28);
        g.insertEge(0,3,13);
        g.insertEge(0,4,15);
        g.insertEge(4,3,27);
        g.insertEge(3,2,20);
        g.display();
        System.out.println("Edge exist : "+g.EgdeExist(4,3));
        System.out.println("Total vertex are  : " +g.vertex_count());
        System.out.println("Total egde count  : " + g.egde_count());
        System.out.println("Edges Are : ");
        g.egde();
        System.out.println("Outdegree of vertex  : " +g.outdegree(0));
        System.out.println("Indegree  of the vertex is : " + g.indegree(3));

    }

}
