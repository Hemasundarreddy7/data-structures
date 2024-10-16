class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }

    node(int data, node next) {
        this.data = data;
        this.next = next;
    }
}

public class linkedlist {

    static node createll(node head, int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return head;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }

    static void display(node head) {
        if(head==null)
        System.out.println("no head!..");
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    static node delete_At_begining(node head)
    {
        node temp=head;
        head=null;
        head=temp.next;
        return head;
    }

    static node delete_at_specific_position(node head,int pos)
    {
        node temp=head;
        int count=0;
        while(temp.next!=null && count<pos-2)
        {
            count++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

    static node delete_at_last(node head)
    {
        node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    static node reverse_ll(node head)
    {
        node q=head,r=null;
        while(q!=null)
        {
            node p=q.next;
            q.next=r;
            r=q;
            q=p;
        }
        return r;
    }


    static node find(node head,int k)
    {
        node temp=head;
        int count=0;
        while(temp!=null && count<k-1)
        {
            count++;
            temp=temp.next;
        }
        return temp;
    }
    static node reverse_by_k_elements(node head,int k)
    {
        node temp=head;
        node prev_node=null;
        node test=find(head, k);
        while(temp!=null)
        {
            node k_node=find(temp,k);
            if(k_node==null)
            {
               if(prev_node!=null)
               {
                prev_node.next=temp;
                break;
               }
            }
            node next_node=k_node.next;
            k_node.next=null;
            reverse_ll(temp);
            if(temp==head)
            head=k_node;
            else
            {
                prev_node.next=k_node;
            }
            prev_node=temp;
            temp=next_node;
            
        }
        return test;
    }



    static node find_nth_node(node head,int k)
    {
        node temp=head;
        int count=0;
        while(temp!=null && count<k-1)
        {
            temp=temp.next;
            count++;
        }
        return temp;
    }
    static node rotate_ll_by_k(node head,int k)
    {
        int count=0;
        node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(k%count==0)
        return head;
        k=k%count;
        node nth_node=find_nth_node(head,count-k);
        node newhead=nth_node.next;
        node temp2=newhead;
        while(temp2.next!=null)
        {
            temp2=temp2.next;
        }
        temp2.next=head;
        nth_node.next=null;
        return newhead;
    }



    static node merge_two_ll(node head1,node head2)
    {
        node temp1=head1;
        node temp2=head2;
        node dummy_node=new node(-1);
        if(temp1.data<temp2.data)
        {
            dummy_node.next=temp1;
            temp1=temp1.next;
        }
        else
        {
            dummy_node.next=temp2;
            temp2=temp2.next;
        }
        node temp3=dummy_node;
        while(temp1!=null && temp2!=null)
        {
          if(temp1.data<temp2.data)
          {
            temp3.next=temp1;
            temp3=temp1;
            temp1=temp1.next;
          }
          else
          {
            temp3.next=temp2;
            temp3=temp2;
            temp2=temp2.next;
          }
        }
        while(temp1!=null)
        {
            temp3.next=temp1;
            temp1=temp1.next;
            temp3=temp1;
        }
        while(temp2!=null)
        {
            temp3.next=temp1;
            temp2=temp2.next;
            temp3=temp2;
        }
        return dummy_node.next;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,7,9};
        int arr2[]={2,4,5,6,10,12};
        node head1 = new node(arr[0]);
        head1.next = null;
        int n = arr.length;
        int n2=arr2.length;
        node head2=new node(arr2[0]);
        head2.next=null;
        for (int i = 1; i < n; i++) {
            head1 = createll(head1, arr[i]);
        }
        for (int i = 1; i < n2; i++) {
            head2 = createll(head2, arr2[i]);
        }
        
       // head=delete_at_specific_position(head,2);
       // head=delete_At_begining(head);
      // head=delete_at_last(head);
     // head=reverse_ll(head);
      //head=reverse_by_k_elements(head,3);
      //head=rotate_ll_by_k(head,21);
      node head=merge_two_ll(head1,head2);
      display(head);
    }
}
