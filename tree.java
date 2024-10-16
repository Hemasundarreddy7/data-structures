import java.util.Scanner;

class node 
{
    int data;
    node left;
    node right;
    node(int data)
    {
        this.data=data;
    }
}
class tree
{
    static void pre_order(node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        pre_order(root.left);
        pre_order(root.right);
    }
    static int search(node root,int element)
    {
      if(root==null)
      return 0;
      while(root!=null)
      {
        if(element==root.data)
        {
        return 1;
        }
        if(element<root.data)
        root=root.left;
        else
        root=root.right;
      }
      return 0;
    }
    public static void main(String args[])
    {
        node root=new node(8);
        root.left=new node(3);
        root.right=new node(10);
        root.left.left=new node(1);
        root.left.right=new node(6);
        root.left.right.left=new node(4);
        root.left.right.right=new node(7);
        root.right.left=new node(9);
        root.right.right=new node(14);
        root.right.right.left=new node(13);
        int val=search(root,9);
        if(val==1)
        System.out.println("Element is found");
        else
        System.out.println("Element is not found");
    }

}
