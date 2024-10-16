public class array_with_sum_true_false {
    static boolean fun(int ind,int sum,int arr[])
    {/* 
        if(sum==0)
        return true;
        if(ind==0)
        {
            if(sum==arr[0])
            return true;
            else
            return false;
        }
        
        boolean not_take=fun(ind-1,sum,arr);
        boolean take=false;
        if(arr[ind]<=sum)
        {
            take=fun(ind-1,sum-arr[ind],arr);
        }
        return take||not_take;
        */
        int n=arr.length;
        boolean dp[][]=new boolean[n][sum+1];
        for(int ik=0;ik<n;ik++)
        {
            dp[ik][0]=true;
        }
        //if(arr[0]<=sum)
        dp[0][arr[0]]=true;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                boolean not_take=dp[i-1][j];
                boolean take=false;
                if(arr[i]<=j)
                {
                take=dp[i-1][j-arr[i]];
                }
                dp[i][j]=take||not_take;
            }
        }
        return dp[n-1][sum];
    }


    public static void main(String args[])
    {
        int arr[]={1,5,4,3,8,7};
        int k=2;
        int n=arr.length;
        System.out.print(fun(n-1,k,arr));
    }
}
