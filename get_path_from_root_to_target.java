import java.util.*;

// Node structure for the binary tree
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    
    // Constructor to initialize
    // the node with a value
    public TreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}
public class get_path_from_root_to_target
{
boolean get_path(TreeNode root,ArrayList<Integer>arr,int target)
{
    if(root==null)
    return true;
    arr.add(root.data);
    if(root.data==target)
    return true;
    if(get_path(root.left,arr,target) || get_path(root.right,arr,target))
    return true;
    arr.remove(arr.size()-1);
    return false;
}
ArrayList<Integer>solve(TreeNode root,int target)
{
    ArrayList<Integer>arr=new ArrayList<>();
    get_path(root,arr,target);
    return arr;
}
public static void main(String args[])
{
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(19);
        root.right.left = new TreeNode(9);

    get_path_from_root_to_target obj=new get_path_from_root_to_target();
    ArrayList<Integer>arr=new ArrayList<>();
    arr=obj.solve(root,10);
    System.out.println(arr);
}
}