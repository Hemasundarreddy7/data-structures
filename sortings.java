
import java.util.*;
public class sortings {


    static int[] selection_sort(int n,int arr[])
    {
        //select minimum and swap and go next
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }

    static int[] bubble_sort(int n,int arr[])
    {
        //PUSH THE LARGEST ELEMENT TO THE LAST BY ADJACENT SWAPS
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }

    static int[] insertion_sort(int arr[],int n)
    {
        //always takes an element and place it in correct order
        //swap until it get swapped
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }



    static void merge_sort(int arr[],int low,int high)
    {
        //divide and merge
        //use temp space so we prefer quicksort
        if(low>=high)
        return ;//base condition
        int mid=(low+high)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
        
    }

    static void merge(int arr[],int low,int mid,int high)
    {
        List<Integer>temp=new LinkedList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }    
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
       
    }



    static void quicksort(int arr[],int start,int end)
    {
        if(start>=end)
        return; //Base Condition

        int partition_index=partition(arr,start,end);
        quicksort(arr,start,partition_index);
        quicksort(arr,partition_index+1,end);
    }

    static int partition(int arr[],int start,int end)
    {
        int i=start;
        int j=end;
        int pivot=arr[i];
        while(i<j)
        {
            while(i<=end && arr[i]<=pivot)
            {
                i++;
            }
            while(j>=start && arr[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[start];
        arr[start]=temp;
        return j;
    }

    static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int n=9;
        int arr[]={13,46,24,52,8,9,32,1,45};
        //int ans[]=new int[n];
        quicksort(arr,0,n-1);
        print(arr,n);
    }
}

