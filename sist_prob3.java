// You are using Java
import java.util.*;
class sist_prob3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1="captainCaptain";
        String s2="cap";
        int i=0;
        int len=s2.length();
        int flag=0;
        while(i<s1.length())
        {
            int res=i+len;
            if(res<s1.length()){
            String temp=s1.substring(i,res);
            if(temp.equalsIgnoreCase(s2))
            {
                flag=1;
                System.out.printf("Found at %d",i+1);
                System.out.println();
                i=i+len;
            }
            else
            i++;
        }
        else{
            break;
        }
    }
        if(flag==0)
        System.out.println("Not Found");
    }
}
