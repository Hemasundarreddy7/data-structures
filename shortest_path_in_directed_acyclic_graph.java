import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
class Pair
{
    int u;
    int wt;
    Pair(int u,int wt)
    {
        this.u=u;
        this.wt=wt;
    }
}
public class shortest_path_in_directed_acyclic_graph {
static void dfs(int node,int vis[],ArrayList<ArrayList<Pair>>adj_list,Stack<Integer>st)
{
    vis[node]=1;
    for(Pair i:adj_list.get(node))
    {
        Pair<Integer,Integer>pair=i;
        if(vis[k]==0)
        dfs(i,vis,adj_list,st);
    }
    st.push(node);
}

static List<Integer> topology_sort(ArrayList<ArrayList<Pair>>adj_list)
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

static List<Integer> find_shortest_path(List<Integer>top_order)
{
    List<Integer>ans=new LinkedList<>();
    for()
}
    public static void main(String Args[])
    {
        int nodes=6;
        int vertices=6;
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Pair>>adj_list=new ArrayList<>();
        for(int i=0;i<nodes;i++)
        {
            adj_list.add(new ArrayList<Pair>());
        }
        System.out.println("Enter edges");
        for(int i=0;i<vertices;i++)
        {
            int v=sc.nextInt();
            int u=sc.nextInt();
            int wt=sc.nextInt();
            adj_list.get(v).add(new Pair(u,wt));
        }
        int arr[]=new int[nodes+1];
        sc.close();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        List<Integer>top_order=new LinkedList<>();
        top_order=topology_sort(adj_list);

    }
}

