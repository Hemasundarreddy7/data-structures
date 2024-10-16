import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class number_of_provinces {
    static void  dfs(int node,ArrayList<ArrayList<Integer>>adj_list,int arr[])
    {
       
            arr[node]=1;
            for(Integer i:adj_list.get(node))
            {
                if(arr[i]!=1)
                {
                    arr[1]=1;
                    dfs(i, adj_list, arr);
                }
            }     
    }
    static int find_provinces(ArrayList<ArrayList<Integer>>adj_list,int arr[])
    {
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=1)
            {
                
                dfs(i,adj_list,arr);
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nodes=8;
        int vertices=5;
        System.out.println("Enter all vertices:");
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>adj_list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=nodes;i++)
        {
            adj_list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<vertices;i++)
        {
            int v=sc.nextInt();
            int u=sc.nextInt();
            adj_list.get(v).add(u);
            adj_list.get(u).add(u);
        }
        int arr[]=new int[nodes+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        int number_of_provinces=find_provinces(adj_list,arr);
        System.out.println("no of provinces are:"+number_of_provinces);
        sc.close();
    }

}
