public class strings1 {
    public static void main(String [] args)
    {
        //creation 1)string literal 2)new keyword
        char ch[]={'h','i','i'};
        String s1=new String(ch);
        String s2="hello";
        System.out.println(s1);
        System.out.println(s2);
        //string is immutable
        String str="hema";
        str.concat("sundar");
        System.out.println(str);
        //here "hema" is output,new string "hema sundar " is created in string constant pool but str is reference to hema
        str=str.concat("sundar");
        System.out.println(str);
        //here we can change by assigning same reference explicitly
        
    }
}
