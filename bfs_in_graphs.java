import java.util.*;

public class bfs_in_graphs {
    static List<Integer> bfs(int node,ArrayList<ArrayList<Integer>>adj_list,List<Integer> ans,int arr[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty())
        {
           int b=q.poll();
           if(arr[b]!=1)
           {
           ans.add(b);
           arr[b]=1;
           }
           ArrayList<Integer> specificList = adj_list.get(b);
           for(Integer j:specificList)
           {
            if(arr[j]!=1)
            {
             q.offer(j);
             ans.add(j);
             arr[j]=1;
            }
           }
        }
        return ans;  
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
        int arr[]=new int[nodes+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        List<Integer> list=new LinkedList<>();
        List<Integer>ans=new LinkedList<>();
        list=bfs(1,adj_list,ans,arr);
        System.out.println(list);
    }
}
