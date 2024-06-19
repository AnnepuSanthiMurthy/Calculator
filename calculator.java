import java.util.*;

class cal
{
    int a;
    int b;
    public cal(int a,int b)
    {
        this.a = a;
        this.b =b;

    }

    public int add()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }
    public int mul()
    {
        return a*b;
    }
    public int div()
    {
        if(b!=0)
        {
            return a/b;
        }
        else
        {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }


}
class Advcal extends cal
{
    public Advcal(int a, int b) 
    {
        super(a, b);
    }
    public double pow()
    {
        return Math.pow(a,b);
    }
}
public class calculator 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner((System.in));
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        Advcal obj = new Advcal(a,b);


        System.out.println("enter the method you want the perform");
        System.out.println("1:Addition");
        System.out.println("2:Substraction");
        System.out.println("3:Multliplication");
        System.out.println("4:Division");
        System.out.println("5:power");


        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(obj.add());
                break;
            case 2:
                System.out.println(obj.sub());
                break;
            case 3:
                System.out.println(obj.mul());
                break;
            case 4:
            try {
                System.out.println("Result: " + obj.div());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            break;
            case 5:
                System.out.println(obj.pow());
                break;
            default:
                System.out.println("please select correct method");
                break;
        }




    }
}
