import java.util.Arrays;
//MEMORIZATION 
public class dp1 {
    
    static int fun(int i,int arr[],int dp[])
    {
         if(i==0)
         return 0;
         if(dp[i]!=-1)
         return dp[i];
         int left=fun(i-1,arr,dp)+Math.abs(arr[i]-arr[i-1]);
         int right=Integer.MAX_VALUE;
         if(i>1)
         right=fun(i-2,arr,dp);
         return dp[i]=Math.min(left,right);
    }
    //Tabulation from Memorization.
    static int tabulation(int j,int arr[],int dp[])
    {
        int n=arr.length;
        dp[0]=0;//base condition for 0th index
        for(int i=1;i<n;i++)//other than 0
        {
        int left=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
        int right=Integer.MAX_VALUE;
        if(i>1)//two steps can jump if only it has 2 steps available 
        {
            right=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
        }
        dp[i]=Math.min(left,right);
        }
        //answer was always stored in the last index or size of arr-1
        return dp[n-1];
    }
   public static void main(String[] args) {
    int arr[]={10,60,30,60,10};
    int n=arr.length;
    int[] dp=new int[n];
    for(int i=0;i<n;i++)
    {
        dp[i]=-1;
    }
    //Frog can either jump one or two
    int ans=tabulation(n-1,arr,dp);
    System.out.println(ans);
   }
}
