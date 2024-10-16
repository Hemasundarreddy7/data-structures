import java.lang.reflect.Array;
import java.util.*;
public class gani {
    static ArrayList<Integer> calculate(int arr[])
    {
        ArrayList<Integer>res=new ArrayList<>();
        int n_sum=0;
        int p_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            n_sum=n_sum+arr[i];
            else
            p_sum=p_sum+arr[i];
        }
        res.add(n_sum);
        res.add(p_sum);
        return res; 
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    if(n>=2 && n<=20)
    {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>fine=new ArrayList<>();

        fine=calculate(arr);
        System.out.printf("Sum of all neg:%d",fine.get(0));
        System.out.printf("Sum of all pos:%d",fine.get(1));
    }
    else
    System.out.printf("%d is an in valid size",n);
}
}
