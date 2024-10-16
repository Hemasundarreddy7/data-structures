
import java.math.*;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {
        val=x;
    }
}
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
class trees{
static void preorder(TreeNode root)
{
    if(root==null)
    return;
    System.out.println(root.val);
    preorder(root.left);
    preorder(root.right);
}
static void preorder_using_stack(TreeNode root)
{
    Stack<TreeNode> stack=new Stack<>();
    stack.push(root);
    while(!stack.isEmpty())
    {
       
        TreeNode x=stack.pop();
        System.out.println(x.val);
        if(x.right!=null)
        stack.push(x.right);
        if(x.left!=null)
        stack.push(x.left);
    }
}
static List<Integer> levelorder(TreeNode root)
{
    Queue<TreeNode> q=new LinkedList<>();
    q.offer(root);
    List list=new LinkedList<>();
    while(!q.isEmpty())
    {
        List<Integer>sublist=new LinkedList<>();
        int len=q.size();
        for(int i=0;i<len;i++)
        {
        if(q.peek().left!=null)
        q.offer(q.peek().left);
        if(q.peek().right!=null)
        q.offer(q.peek().right);
        sublist.add(q.poll().val);
        }
        list.add(sublist);
    }
    return list;
}
static int depth(TreeNode root)
{
    int lh=0,rh=0;
    if(root.left!=null)
    lh=depth(root.left);
    if(root.right!=null)
    rh=depth(root.right);
    return 1+Math.max(lh,rh);
}
static int check_balancedBt(TreeNode root)
{
    int lh=0,rh=0;
    if(root.left!=null)
    lh=check_balancedBt(root.left);
    if(root.right!=null)
    rh=check_balancedBt(root.right);
    if(Math.abs(lh-rh)>1)
    return -1;
    else return 1+Math.max(lh,rh);
}
static int maximum_diameter(TreeNode root,int maxi[])
{
    if(root==null)
    return 0;
    int lh=0,rh=0;
    if(root.left!=null)
    lh=maximum_diameter(root.left, maxi);
    if(root.right!=null)
    rh=maximum_diameter(root.right, maxi);
    maxi[0]=Math.max(lh+rh,maxi[0]);
    return 1+Math.max(lh,rh);
}
static int maximum_path_sum(TreeNode root,int sum[])
{
    if(root==null)
    return 0;
    int ls=0,rs=0;
    if(root.left!=null)
    ls=maximum_path_sum(root.left, sum);
    if(root.right!=null)
    rs=maximum_path_sum(root.right, sum);
    sum[0]=Math.max(sum[0],ls+rs+root.val);
    return root.val+Math.max(ls,rs);
}


    public static void main(String args[])
    {
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(4);
    root.left.left=new TreeNode(7);
    root.left.right=new TreeNode(10);
    root.right.left=new TreeNode(17);
    root.right.right=new TreeNode(19);
    root.right.left.left=new TreeNode(60);
    root.right.left.left.left=new TreeNode(90);
    /*preorder_using_stack(root);
    List<Integer> list=new LinkedList<>();
    list=levelorder(root);
    System.out.println(list);
    int depth=depth(root);
    System.out.println(depth);
   int a=check_balancedBt(root);
   if(a==-1)
   System.out.println("False:Not a balanced Tree");
   else
   System.out.println("Balanced binary tree");
   
   int maxi[]={0};
   maximum_diameter(root,maxi);
   System.out.println(maxi[0]);
   
  int sum[]={0};
  maximum_path_sum(root,sum);
  System.out.println(sum[0]);

top view is done in Solution.java in codes
*/
}
