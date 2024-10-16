
 class hello
{
  int partition(int arr[],int low,int high)
  {
    int pivot=arr[low];
    int i=low;
    int j=high;
    while(i<j)
    {
        while(arr[i]<=pivot && i<=high-1)
        {
          i++;
        }
        while(arr[j]>pivot  && j>=low+1)
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
       int temp=arr[low];
       arr[low]=arr[j];
       arr[j]=temp;
      return j;
    }
    
  void qs(int arr[],int low,int high)
  {
    if(low<high)
    {
      int p=partition(arr,low,high);
      System.out.println(p);
      qs(arr,low,p-1);
      qs(arr,p+1,high);
    }
  }

  void print(int arr[])
  {
    for(int i=0;i<arr.length-1;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  
  public static void main(String[] args) {
    hello obj=new hello();
    int  arr[]={21,78,43,2,90,32,3,43};
    
    obj.qs(arr,0,arr.length-1);
    obj.print(arr);
  }
}
    

