import java.util.*;
public class graph_creation {
   public static void main(String[] args) {
    int nodes=5;
    int vertices=6;

    //Storing list using adjacency matrix


    /* 
    int arr[][] =new int [nodes+1][nodes+1];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the vertices");
    /*for(int i=0;i<vertices;i++)
    {
    int v=sc.nextInt();
    int u=sc.nextInt();
    arr[v][u]=1;
    arr[u][v]=1;
    }
    for(int i=1;i<=nodes;i++)
    {
        for(int j=1;j<=nodes;j++)
        {
           System.out.print(arr[i][j]);
        }
        System.out.println();
    }*/



    //Storing a graph using adjacency list
    ArrayList<Integer>array_of_list[]=new ArrayList[5];
    for(int i=0;i<=nodes;i++)
    {
      array_of_list[i]=new ArrayList<Integer>();
    }
    //int arr[][] =new int [nodes+1][nodes+1];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the vertices");
    for(int i=0;i<vertices;i++)
    {
    int v=sc.nextInt();
    int u=sc.nextInt();
    array_of_list[v].add(u);
    array_of_list[u].add(v);
    }
    for(int i=0;i<array_of_list.length;i++)
    {
      System.out.println(i+":  "+ array_of_list[i]);
    }
   }
}
