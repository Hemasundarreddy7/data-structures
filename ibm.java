
import java.util.*;
public class ibm {
static int[] reverse(int arr[],int n)
{
    
    for(int i=0,j=n-1;i<n/2;i++,j--)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    return arr;
}
    public static void nextGreatest(int number) {
        int count=0;
        int maintemp=number;
        while(number>0)
        {
            count++;
            number=number/10;
        }
        int arr[]=new int[count];
        int i=0;
        while(maintemp>0)
        {
            int rem=maintemp%10;    
            //System.out.print(rem);
            arr[i]=rem;
            i++;
            maintemp=maintemp/10;
        }
        
        int n=arr.length;
        arr=reverse(arr,n); 
       
        for(i=n-1;i>0;i--)
        {
            if(arr[i]>arr[i-1])
            {
                break;
            }   
        }
        Arrays.sort(arr, i, n);
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum=sum*10+arr[i];
        }
        System.out.printf("%d",sum);
    }
    public static void main(String[] args) {
        nextGreatest(219764);
    }

}

