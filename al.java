abstract class al{
    abstract void fun();
}

public class abstraction_in_ extends al {

  
    void fun()
    {
        System.out.println("Abstract method should be empty while declaring");
    }
    public static void main(String args[])
    {
        al obj=new abstraction_in_();
        obj.fun();
    }
}
