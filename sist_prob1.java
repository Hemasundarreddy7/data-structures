import java.util.*;
public class sist_prob1 {
     static Boolean check(List<Integer>l1,int ele)
    {
        for(int i=0;i<l1.size();i++)
        {
            if(ele==l1.get(i))
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr[]={4,2,-3,3,-2,-2,8};
        int n=arr.length;
        List<Integer>l1=new LinkedList<>();
        List<Integer>l2=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                Boolean check=check(l1,arr[i]);
                if(check==true)
                l2.add(arr[i]);
                else
                l1.add(arr[i]);
            }
            else
            {
                l2.add(arr[i]);
            }
        }
        int sum1=0;
        int sum2=0;
        for(int k=0;k<l1.size();k++)
        sum1+=l1.get(k);
        for(int k1=0;k1<l2.size();k1++)
        sum2+=l2.get(k1);
        System.out.println(sum2-sum1);
    }
}
