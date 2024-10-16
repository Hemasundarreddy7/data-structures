public class leet {
    
        static int[] twoSum(int[] arr, int target) {
            
            int arr1[]=new int[2];
            int i=0;
            int j=arr.length-1;
            while(true)
            {
            if(arr[i]>target)
            {
                i++;
            }
            if(arr[j]>target&&j>=0)
            {
                j--;
            }
            else if(arr[i]+arr[j]==target)
            {
                arr1[0]=i;
                arr1[1]=j;
                break;
            }
            else
            {
                i++;
                j++;
            }
            }
    
        return arr1;   
        }
    }
public static void main(String args[])
{
int arr[]={3,3};
int temp[]=new int[2];
temp=twoSum(arr,6);

}
