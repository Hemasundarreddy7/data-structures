public class node {
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
class bst
{
    static node insert_node(int data,node root)
    {
        node new_node=new node(data);
        if(root==null)
        root=new_node;
        node temp=root,prev=null;
        while(temp!=null)
        {
            if(data<temp.data)
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
        if(data<prev.data)
        prev.left=new_node;
        else
        prev.right=new_node;
        return root;
    }
    public static void main(String args)
    {
        node root=null;
        insert(root,10);
        insert(root,7);
        insert(root,15);
        insert(root,4);
        insert(root,9);
        insert(root,5);
        insert(root,32);
    }
}
