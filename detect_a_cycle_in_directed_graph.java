import java.util.*;
public class detect_a_cycle_in_directed_graph {
    static Boolean dfs(int j,ArrayList<ArrayList<Integer>>adj_list,int []vis,int[]path)
    {
        vis[j]=1;
        path[j]=1;
        for(Integer iter:adj_list.get(j))
        {
            if(vis[iter]==0)
            {
                if(dfs(iter,adj_list,vis,path)==true)
                return true;
            }
            // node is visited but it has to visit in the different path
            else if(path[iter]==1)
            {
                return true;
            }
        }
        path[j]=0;
        return false;
    }
    static Boolean fun(ArrayList<ArrayList<Integer>>adj_list,int n)
    {
        
        int vis[]=new int[n];
        int path[]=new int[n];
        for(int i=0;i<vis.length;i++)
        {
            vis[i]=0;
            path[i]=0;
        }
        for(int j=0;j<n;j++)
        {
            if(vis[j]==0)
            {
                if(dfs(j,adj_list,vis,path)==true)
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nodes=5;
        int vertices=5;
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
            adj_list.get(v).add(u);
            
        }
        int arr[]=new int[nodes+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        sc.close();
        Boolean b=fun(adj_list,nodes);
        if(b==true)
        {
        System.out.println("It is a cycle..");
        }
        else
        System.out.println("noo loop");
    }
}
