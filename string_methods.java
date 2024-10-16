public class string_methods {
    public static void main(String[] args) {
        String str="CoMe_on_baby";
        //str.toUpperCase() toLowerCase()
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        //trim->remove the spaces in the String only before and after string
        String str1="   hii hello EveryBody  ";
        System.out.println("String after trim:"+str1.trim());
        //str.startsWith(parameter) end with
        String s="hemasundar";
        System.out.println(s.startsWith("h"));
        //charAt(Index)->returns value at specific index
        System.out.println(s.charAt(1));
        // String.valueOf() returns integer to string
        int a=10;
        String ar=String.valueOf(a);
        System.out.println(ar+10);
        //String replace-> replace string with new string
        String ss="old string";
        ss=ss.replace("old","new");
        System.out.println(ss);
    }
}
