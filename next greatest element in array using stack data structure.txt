import java.util.*;

import java.util.*;

 class stack {
   static void next_greater_element(int arr[],int ans[],int n)
   {
      Stack<Integer>st=new Stack<>();
      st.push(arr[n-1]);
      for(int i=0;i<n;i++)
      {
         if(arr[i]>arr[n-1])
         {
            ans[n-1]=arr[i];
            break;
         }
      }
      for(int i=n-2;i>=0;i--)
      {
        while(!st.empty() && st.peek()<=arr[i])
        {
         st.pop();
        }
        if(i<n)
        {
         if(!st.empty())
         {
            ans[i]=st.peek();
         }
         else
         {
            ans[i]=-1;
         }
      }
      st.push(arr[i]);
      }
   }
   public static void main(String args[])
   {
      int arr[]={3,10,4,2,1,2,6,1,7,2,9};
      int n=arr.length;
      int ans[]=new int[arr.length];
      next_greater_element(arr,ans,n);
      for(int i=0;i<ans.length;i++)
      System.out.println(ans[i]);
   }
 }