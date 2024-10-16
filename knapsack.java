public class knapsack {
    static int fun(int ind,int wt[],int val[],int given_wt)
    {
        if(given_wt==0)
        return 0;
        if(ind==0)
        {
            if(wt[ind]<=given_wt)
            return val[ind];
            else
            return 0;
        }
        int take=0;
        if(wt[ind]<=given_wt)
        {
            take=val[ind]+fun(ind-1,wt,val,given_wt-wt[ind]);   
        }
        int not_take=fun(ind-1, wt, val, given_wt);
        return Math.max(take,not_take);  
    }
    static int table(int n,int wt[],int val[],int given_wt,int dp[][])
    {
      for(int i=0;i<n;i++)
      {
        dp[i][0]=0;
      }  
      for(int w=1;w<=given_wt;w++)
      {
        if(wt[0]<=w)
        {
            dp[0][w]=val[0];
        }
        else
        dp[0][w]=0;
      }
      for(int i=1;i<n;i++)
      {
        for(int j=1;j<=given_wt;j++)
        {
            int take=0;
            if(wt[i]<=j)
            {
                take=val[i]+dp[i-1][j-wt[i]];
            }
            int not_take=dp[i-1][j];
            dp[i][j]=Math.max(take,not_take);
        }
      }
      return dp[n-1][given_wt];
    }
    public static void main(String args[])
    {
        int wt[]={4,4,5};
        int n=3;
        int val[]={30,50,60};
        int given_wt=9;
        int dp[][]=new int[n][given_wt+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=given_wt;j++)
            {
                dp[i][j]=-1;;
            }
        }
        int total=table(n,wt,val,given_wt,dp);
        System.out.println(total);
    }
}
