import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class dfs_recursion {
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj_list,int arr[],List<Integer>list)
    {
        arr[node]=1;
        list.add(node);
        for(Integer i : adj_list.get(node))
        {
            if(arr[i]!=1)
            {
              dfs(i,adj_list,arr,list);
            }
        }
    }
    public static void main(String[] args) {
        int nodes=8;
        int vertices=8;
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>adj_list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=nodes;i++)
        {
            adj_list.add(new ArrayList<Integer>());
        }
        System.out.println("Enter edges");
        for(int i=0;i<vertices;i++)
        {
            int v=sc.nextInt();
            int u=sc.nextInt();
            adj_list.get(u).add(v);
            adj_list.get(v).add(u);
        }
        System.out.println("hii");
        List<Integer> list=new LinkedList<>();
        int arr[]=new int[nodes+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        
        dfs(1,adj_list,arr,list);
        System.out.println(list);
    }

}
