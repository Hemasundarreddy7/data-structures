import java.util.Scanner;

class student {
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
    static double red=0;
    static double calculate(double per)
    {
        
        if(51<per &&per<=60)
        
           red=10;
        
        
        else if(61<per &&per<=70)
        
           red=20;
           
        
        else if(71.0<per &&per<=80.0)
        
           red=30;
           
           
        
        else if(81<per &&per<=90)
        
           red=40;
          
        
       else if(91<per &&per<=100)
        
           red=50;
          
        return red;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        char gender=sc.next().charAt(0);
        double percentage=sc.nextDouble();
        student obj=new student(name,age,gender,percentage);
        double per=obj.per;
        System.out.println(per);
        double reduce=calculate(per);
        System.out.println(reduce);
        double dis=((250000*reduce)/100);
        System.out.println(250000-dis);
    }
}
