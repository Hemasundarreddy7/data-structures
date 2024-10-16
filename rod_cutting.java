public class rod_cutting {
    static int fun(int arr[],int ind,int N)
    {
        if(N==0)
        return 0;
        if(ind==0)
        {
            if(N%arr[ind]==0)
            return N%arr[0]*arr[0];
            else 
            return 0;
        }
        int not_take=fun(arr,ind-1,N);
        int take=Integer.MIN_VALUE;
        int cut_length=ind+1;
        if(cut_length<=N)
        {
           take=arr[ind]+fun(arr,ind,N-cut_length);
        }
        return Math.max(take,not_take);
        
    }
    public static void main(String args[]){
        int arr[]={2,5,7,8,10};
        int n=5;
        int size=5;//size of rod that to be cutted
        int ans=fun(arr,n-1,size);
        System.out.println(ans);
    }
}
