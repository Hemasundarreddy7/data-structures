import java.util.HashMap;

public class acc {
    public static void main(String args[])
    {
        String str="apple is gooood to heeelth";
        HashMap<Character,Integer>mpp=new HashMap<>();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(!mpp.containsKey(ch))
            {
                mpp.put(ch,1);
            }
            else{
                int value=mpp.get(ch);
                mpp.put(ch,value+1);
            }
        }
        int maxi=0;
        char ans='a';
        for(HashMap.Entry<Character,Integer>entry:mpp.entrySet())
        {
           if(maxi<entry.getValue())
           {
            maxi=entry.getValue();
            ans=entry.getKey();
           }
        }
        
        System.out.println(maxi+" : "+ans);
    }
}
