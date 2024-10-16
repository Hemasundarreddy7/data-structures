import java.util.*;

public class Lnt_company {
    public static void main(String args[])
    {
        int arr[]={5,3,5,2,5,4};
        int n=6;
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)
            min=arr[i];
            if(arr[i]>max)
            max=arr[i];
        }
        List<Integer>list=new LinkedList<>();
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=max && arr[j]!=min && list.contains(arr[j])==false)
            {
                list.add(arr[j]);
            }
        }
        int sum=0;
        for(Integer i : list)
        {
            sum=sum+i;
        }
        System.out.print(sum/list.size());
    }
}
