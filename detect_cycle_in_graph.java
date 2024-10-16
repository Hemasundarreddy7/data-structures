import java.util.*;
class Pair
{
    int node;
    int parent;
    Pair(int node,int parent)
    {
        this.node=node;
        this.parent=parent;
    }
}
public class detect_cycle_in_graph {
      static Boolean detect_cycle_in_undirected_graph(ArrayList<ArrayList<Integer>>adj_list)
      {
        Queue<Pair>q=new LinkedList<>();
        int n=adj_list.size();
        int vis[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            vis[i]=0;
        }
        q.add(new Pair(1,-1));
        vis[1]=1;
        while(!q.isEmpty())
        {
            int node=q.peek().node;
            int parent=q.peek().parent;
            q.remove();
            for(int adj_node:adj_list.get(node))
            {
                if(vis[adj_node]==0)
                {
                    vis[adj_node]=1;
                    q.add(new Pair(adj_node, node));
                }
                else if(adj_node!=parent)
                {
                    return true;
                }
            }
        }
        return false;
      }
    public static void main(String[] args) {
        int nodes=7;
        int vertices=7;
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
        int arr[]=new int[nodes+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        Boolean a=detect_cycle_in_undirected_graph(adj_list);
        System.out.println(a);
        sc.close();
    }
}
