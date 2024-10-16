class loki {
   int partition(int arr[],int start,int end)
   {
     int pivot=arr[start];
     int i=start;
     int j=end;
     while(i<j)
     {
        while(arr[i]<=pivot && i<=end-1)
        {
            i++;
        }
        while(arr[i]>pivot && j>=start+1)
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
     int temp1=arr[start];
     arr[start]=arr[j];
     arr[j]=temp1;
   return j;
   }
  void quicksort(int arr[],int start,int end)
   {
    if(start<end)
    {
    int mid=partition(arr,start,end);
    quicksort(arr,start, mid-1);
    quicksort(arr, mid+1, end);
    System.out.println(mid);
    System.out.println();
    }
   }
   public static void main(String args[])
   {
    loki obj=new loki();
    int[] arr={21,78,43,2,90,32,3,43};
    obj.quicksort(arr,0,7);

    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" " );
   }
}
