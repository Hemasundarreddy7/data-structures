public class double_try {
    int partition(int arr[],int start,int end)
    {
      int pivot=arr[start];
      int i=start;
      int j=end;
      while(i<j)
      {
        while(arr[i]<=pivot && i<=end-1)
        i++;
        while(arr[j]>pivot && j>=start+1)
        j--;
        if(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      }
      int temp=arr[start];
      arr[start]=arr[j];
      arr[j]=temp;
 return j;
    }
    void quicksort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int p=partition(arr,start,end);
            quicksort(arr,start,p-1);
            quicksort(arr,p+1,end);
        }
    }
void print(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String args[])
    {
      int arr[]={21,34,19,4,90,81,61,34};
      double_try obj=new double_try();
      obj.print(arr);
      System.out.println();
      obj.quicksort(arr,0,arr.length-1);
      obj.print(arr);
    }

}
