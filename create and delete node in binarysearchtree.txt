import java.util.LinkedList;
import java.util.Queue;

class node {
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
    static node insert_node(node root,int data)
    {
        node new_node=new node(data);
        if(root==null)
        root=new_node;
        else
       {
        node temp=root;
        while(true)
        {
            if(data<temp.data)
            {
               if(temp.left!=null)
               temp=temp.left;
               else
               {
               temp.left=new_node;
               break;
               }

            }
            else
            {
                if(temp.right!=null)
                temp=temp.right;
                else
                {
                temp.right=new_node;
                break;
                }
            }
        }
      }
      return root;
    }
    static node deletion(node root,int element)
    {
        if(root==null)
        return null;
        node temp=root;
        node prev=null;
        while(temp.data!=element)
         {
          if(element<temp.data)
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
          if(temp.left==null&&temp.right==null)
          {
            //leaf node
            if(temp.data<prev.data)
            prev.left=null;
            else
            prev.right=null;
          }
          //single child
          else if(temp.left!=null&&temp.right==null)
          {
            node next=temp.left;
            if(temp.data<prev.data)
            prev.left=null;
            else
            prev.right=null;
            prev.left=next;
          }
          else if(temp.right!=null&&temp.left==null)
          {
            node next=temp.right;
            if(temp.data<prev.data)
            prev.left=null;
            else
            prev.right=null;
            prev.right=next;
          }
          //node with two children
          else
          {
            node next=temp.left;
            next.right=temp.right;
            
            if(temp.data<prev.data)
            {
              prev.left=null;
              prev.left=next;
            }
            else
            {
              prev.right=null;
              prev.right=next;        
            }
            
          }
        return root;
    }
    
    static void level_order_traversal(node root)
    {
       if(root==null)
       System.out.println("no data");
       Queue<node>q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty())
       {
        if(q.peek().left!=null)
        q.offer(q.peek().left);
        if(q.peek().right!=null)
        q.offer(q.peek().right);
        System.out.print(q.poll().data+" ");
       }
    }
    public static void main(String args[])
    {
        node root=null;
        root=insert_node(root,8);
        root=insert_node(root,3);
        root=insert_node(root,10);
        root=insert_node(root,1);
        root=insert_node(root,6);
        root=insert_node(root,9);
        root=insert_node(root,14);
        root=insert_node(root,4);
        root=insert_node(root,7);
        root=insert_node(root,13);
        level_order_traversal(root);
        System.out.println();
        root=deletion(root, 6);
        level_order_traversal(root);

    }
}
