public class student {
    String name;
    int age;
    char gen;
    double per;
    student(String name,int age,char gen,double per)
    {
        this.name=name;
        this.age=age;
        this.gen=gen;
        this.per=per;
    }
}
public class exam{
    public static void main(String args[])
    {
        student obj=new student("peter",20,'m',80);
       name= obj.name;
        System.out.println(name);
    }
}
