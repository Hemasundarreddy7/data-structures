import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class topological_sort_dfs {
static void dfs(int node,int vis[],ArrayList<ArrayList<Integer>> adj_list,Stack<Integer>st)
{
    vis[node]=1;
    for(Integer i:adj_list.get(node))
    {
        if(vis[i]==0)
        dfs(i,vis,adj_list,st);
    }
    st.push(node);
    

}
static List<Integer> topology_sort(ArrayList<ArrayList<Integer>>adj_list)
{
    List <Integer>list=new LinkedList<>();
    int vis[]=new int[adj_list.size()];
    Stack<Integer>st=new Stack<>();
    for(int i=0;i<adj_list.size();i++)
    {
        if(vis[i]==0)
        {
            dfs(i,vis,adj_list,st);
        }
    }
    while(!st.isEmpty())
    {
        list.add(st.pop());
    }
    return list;
}

/*static List<Integer> find_short_path(ArrayList<ArrayList<Integer>>adj_list,int source)
{
    //List<Integer>list=new LinkedList<>();
    //list=topology_sort(adj_list);

}*/
    public static void main(String args[])
    {
        int nodes=6;
        int vertices=6;
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>adj_list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<nodes;i++)
        {
            adj_list.add(new ArrayList<Integer>());
        }
        System.out.println("Enter edges");
        for(int i=0;i<vertices;i++)
        {
            int v=sc.nextInt();
            int u=sc.nextInt();
            adj_list.get(v).add(u);
        }
        int arr[]=new int[nodes+1];
        sc.close();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        List<Integer>ans=new LinkedList<>();
        ans=topology_sort(adj_list);
        //ans=find_short_path(adj_list,0);
        System.out.println(ans);
    }

}
