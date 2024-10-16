//select minimum and swap and go next
public class selection_sort {
    public static void main(String args[])
    {
        int n=6;
        int arr[]={13,46,24,52,8,9};
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
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
