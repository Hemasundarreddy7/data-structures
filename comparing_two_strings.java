public class comparing_two_strings {
    public static void main(String[] args)
    {
    //3 ways to ways to compare 1)equals() 2)using == operator 3)compareTo()
    //equalsIgnoreCase-->returns with sae string name even if string is diffent in uppercases and lowercases
    String str1="hello";
    String str2="hello";
    String str3="HELlO";
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str1.equalsIgnoreCase(str2));
    System.out.println(str1.equalsIgnoreCase(str3));
    System.out.println("using operator"+str1==str2);
    //compareTo() lexographically compares
    String str4="hem";
    String str5="Hem";
    System.out.println(str4.compareTo(str5));//ascii of h=104,H=72
}
}