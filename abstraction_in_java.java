abstract class a{
    int a;
    abstract void fun();
}
public class abstraction_in_java extends a {

  
    void fun()
    {
        System.out.println("Abstract method should be empty while declaring");
    }
    public static void main(String args[])
    {
        a obj=new abstraction_in_java();
        obj.fun();
    }
}
