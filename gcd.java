public class gcd {
    public static void main(String args[])
    {
        int a=20;
        int b=15;
        while(a!=0 && b!=0)
        {
            if(a>b)
            a=a%b;
            else
            b=b%a;
        }
        if(a==0)
        System.out.print(b);
        if(b==0)
        System.out.print(a);
    }
}
