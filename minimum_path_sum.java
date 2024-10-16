public class minimum_path_sum {
    static int fun(int i,int j,int arr[][],int dp[][])
    {/* 
        if(i==0&&j==0)
        return arr[0][0];
        if(i<0&&j<0)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int up=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        if(i>0)
        up=arr[i][j]+fun(i-1,j,arr,dp);
        if(j>0)
        left=arr[i][j]+fun(i,j-1,arr,dp);
        return dp[i][j]=Math.min(up,left);
        */
        dp[0][0]=arr[0][0];
        for(int rows=0;rows<=i;rows++)
        {
            for(int col=0;col<=j;col++)
            {
                if(rows==0&&col==0)
                {
                dp[0][0]=arr[0][0];
                }
                else{
                    int up=Integer.MAX_VALUE;
                    int left=Integer.MAX_VALUE;
                    //up=arr[rows][col];
                    if(rows>0){up=arr[rows][col]+dp[rows-1][col];}
                    //left=arr[rows][col];
                    if(col>0){left=arr[rows][col]+dp[rows][col-1];}
                    dp[rows][col]=Math.min(up,left);  
                }   
            }
        }
        return dp[i][j];
    }
public static void main(String args[])
{
    int arr[][]={{5,9,6},{11,5,2}};
    int rows=arr.length;
    int cols=arr[0].length;
    int dp[][]=new int[rows][cols];
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            dp[i][j]=-1;
        }
    }
    
    int ans=fun(rows-1,cols-1,arr,dp);
    System.out.print(ans);
}
}
