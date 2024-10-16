
class node
{
  int data;
  node next;
  node back;
  node(int data1,node next1,node back1)
  {
    this.data=data1;
    this.next=next1;
    this.back=back1;
  }
  node(int data1)
  {
    this.data=data1;
    this.next=null;
    this.back=null;
  }
}

public class doublelinkedlist {
    static node convertinto2dll(int[] arr)
    {
        node first=new node(arr[0]);
        node prev=first;
        for(int i=1;i<arr.length;i++)
        {
            node temp=new node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return first;
    }
    static void display(node first)
    {
        while(first!=null)
        {
            System.out.println(first.data);
            first=first.next;
        }
    }


    static node deletehead(node first)
    {
      node temp=first;
      temp=temp.next;
      temp.back=null;
      first.next=null;
      return temp;
    }

    static node deletetail(node first)
    {
      node temp=first;
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      node prev=temp.back;
      prev.next=null;
      temp.back=null;
      return first;
    }

    static node deleteatpos(node first,int pos)
    {
      if(first==null)
      return null;
      node temp=first;
        int count=0;
        
        while(temp.next!=null)
        {
          count++;
          if(count==pos)
          {
            break;
          }
          temp=temp.next;
        }
         node prev=temp.back;
         node front=temp.next;
         if(temp.back==null && temp.next==null)
         {
           return null;
         }
         else if(temp.back==null)
         {
          first=deletehead(first);
          return first;
         }
          else if(temp.next==null)
          {
           first=deletetail(first);
           return first;
          }
            prev.next=front;
            front.back=prev;
            temp.next=null;
            temp.back=null;
        return first;
      }

      //Insert at head
      static node insertathead(node first,int data)
      {
        node temp=new node(data);
        first.back=temp;
        temp.next=first;
        temp.back=null;
        return temp;
      }
//Insert at tail
      static node insert_at_tail(node first,int data)
      {
        node newnode=new node(data);
        node temp=first;
        while(temp.next!=null)
        {
          temp=temp.next;
        }
        temp.next=newnode;
        newnode.back=temp;
        newnode.next=null;
      return first;
      }


      // Insert at specific position :
      static node insert_at_position(node first,int pos,int data)
      {
        node newnode=new node(data);
        if(first==null)
        {
          first=newnode;
          return first;
        }
        int count=0;
        node temp=first;
        while(temp!=null)
        {
          count++;
          if(count==pos)
          {
            break;
          }
          temp=temp.next;
        }
        node prev=temp.back;
        node front=temp.next;
        if(temp.back==null || temp.back==null && temp.next==null)
        {
          temp.back=newnode;
          newnode.next=temp;
          return newnode;
        }
        else if(temp.next==null)
        {
           first=insert_at_tail(first, data);
          return first;
        }
        else
        {
          prev.next=newnode;
          newnode.back=prev;
          newnode.next=temp;
          return first;
        }
      }


      //check if doublylinkedlist is palindrome or not:
      static boolean check_palindrome(node first)
      {
        node temp=first;
        int count=0;
        while(temp.next!=null)
        {
          count++;
          temp=temp.next;
        }
        int i=0;
      while(i<count/2+1)
      {
        if(first.data==temp.data)
        {
          i++;
          first=first.next;
          temp=temp.back;
          continue;
        }
        else
        {
          return false;
          
        }
      }
      return true;
      } 


      static node reverse_doubly_linkedlist(node first)
      {
        node temp=first;
        while(temp.next!=null)
        {
          temp=temp.next;
        }
        node temp1=temp;
        while(temp!=first)
        { node prev=temp.back;
          temp.next=prev;
          temp=temp.back;
        }
        first.back=temp;
        first.next=null;
        return temp1;
      }
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        node first=convertinto2dll(arr);
        //first=deletehead(first);
        //first=deletetail(first);
        //first=deleteatpos(first,3);
        //first=insertathead(first,6);
       // first=insert_at_tail(first,6);
       //first=insert_at_position(first,4,40);
      
        /*boolean ans=check_palindrome(first);
        if(ans==true)
        {
          System.out.println("yes it is palindrome");
        }
        else
        {
          System.out.println("not a palindrome");
        }*/
        first=reverse_doubly_linkedlist(first);
        display(first);
    }
}
