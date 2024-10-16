import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair{
    int node;
    int distance;
    public Pair(int distance,int node){
        this.node = node;
        this.distance = distance;
    }
}
class Solution
{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int dis[]=new int[V];
        PriorityQueue<Pair>pq=new PriorityQueue<>((x,y)->x.distance -y.distance);
        
        for(int i=0;i<dis.length;i++)
        {
            dis[i]=(int)(1e9);//assigning array with infinity
        }
        dis[S]=0;
        pq.add(new Pair(0, S));
        while(pq.size()!=0)
        {
            int distance=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();
            for(int i=0;i<adj.get(node).size();i++)
            {
                int adj_node=adj.get(node).get(i).get(0);
                int wt=adj.get(node).get(i).get(1);
                if(wt+distance<dis[adj_node])
                {
                    dis[adj_node]=wt+distance;
                    pq.add(new Pair(dis[adj_node],adj_node));
                }
            }
        }
        return dis;

    }
}
public class dijistra_algorith {

public static void main(String[] args) {
    int V = 3, E=3,S=2;
    ArrayList<Integer> node1 = new ArrayList<Integer>() {{add(1);add(1);}};//1 is destination from node 0 and 1 is weight
    ArrayList<Integer> node2 = new ArrayList<Integer>() {{add(2);add(6);}};//2 is des from node 0 and 6 is weight
    ArrayList<Integer> node3 = new ArrayList<Integer>() {{add(2);add(3);}};//2 id des from node 1 and 3 is weight
    ArrayList<Integer> node4 = new ArrayList<Integer>() {{add(0);add(1);}};//0 is destination from node 1 and 1 is weight
    ArrayList<Integer> node5 = new ArrayList<Integer>() {{add(1);add(3);}};
    ArrayList<Integer> node6 = new ArrayList<Integer>() {{add(0);add(6);}};
    ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>(){
        {
            add(node1);
            add(node2);
        }  
      };
      ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>(){
        {
            add(node3);
            add(node4);
        }  
      };
      ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>(){
        {
            add(node5);
            add(node6);
        }  
      };
      ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<ArrayList<ArrayList<Integer>>>(){
          {
              add(inter1); // for 1st node
              add(inter2); // for 2nd node
              add(inter3); // for 3rd node
          }
      };
      Solution obj = new Solution();
    int[] res= obj.dijkstra(V,adj,S);
    
    for(int i=0;i<V;i++){
        System.out.print(res[i]+" ");
    }
    System.out.println();
}
}
