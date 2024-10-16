public class sist_prob2 {
    public static void main(String args[])
    {
        String str1="i*mn?o";
        String str2="iaamneo";
        int i=0;
        int j=0;
        while(i<str1.length()&&j<str2.length())
        {
            if(str1.charAt(i)==str2.charAt(j))
            {
                i++;
                j++;
            }
            else if(str1.charAt(i)=='*')
            {
                i++;
                if(i>=str1.length())
                {
                    System.out.println("Strings are matched");
                    return;
                }
                char temp=str1.charAt(i);
                while(j<str2.length() && str2.charAt(j)!=temp)
                {
                    j++;
                }
            }
            else if(str1.charAt(i)=='?')
            {
                i++;
                j++;
                
            }
            else
            {
                System.out.println("Two strings are not same..");
                return;
            }
        }
        if (i == str1.length() && j == str2.length()) {
            System.out.println("Two strings are same..");
        } 
        else {
            System.out.println("Two strings are not same..");
        }
    }
}
