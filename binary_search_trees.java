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
class binary_search_trees
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
    static int find_ceil(node root,int key)
    {
        int ceil=Integer.MAX_VALUE;
        if(root==null)
        return ceil;
        while(root!=null)
        {
            if(ceil>root.data&&root.data>key)
            ceil=root.data;
            root= key<root.data?root.left:root.right;
        }
        return ceil;
    }
    static node Insert_node(node root,int value)
    {
        node new_node=new node(value);
        if(root==null)
        return null;
        node temp=root;
        node prev=null;
        while(temp!=null)
        {
            if(value<temp.data)
            {
                prev=temp;
                temp=temp.left;
        }
            else
            {
                prev=temp;
                temp=temp.right;
            }
        }
        if(prev.data>value)
        prev.left=new_node;
        else
        prev.right=new_node;
        return root;
    }
    static node deletion_at_leaf(node root,int element)
    {
       node temp=root;
       while(temp!=null)
       {
        if(temp.data==element)
            return null;  
        else if(element<temp.data)
          deletion_at_leaf(temp.left, element);
        else if(element>temp.data)
            deletion_at_leaf(temp.right, element);
       }
       return root;
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
        /*int val=search(root,9);
        if(val==1)
        System.out.println("Element is found");
        else
        System.out.println("Element is not found");
       
        int ceil=find_ceil(root,8);
        System.out.println("ceil of given key :"+ceil);
        
        node root_after_insertion=Insert_node(root,2);
        pre_order(root_after_insertion);
        */
        node temp=deletion_at_leaf(root,4);
        System.out.println(temp.data);
    }

}
