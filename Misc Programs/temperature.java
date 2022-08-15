import java.util.*;
class temperature {
    static temperature obj = new temperature();
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tMenu");
        System.out.println("1. Fahrenheit to Celcius");
        System.out.println("2. Celcius to Fahrenheit");
        System.out.print("Enter your choice (1/2) : ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: 
            System.out.print("Enter the temperature : ");
            double tf = sc.nextDouble();
            obj.f_to_c(tf);
            break;
            case 2:
            System.out.print("Enter the temperature : ");
            double tc = sc.nextDouble();
            obj.c_to_f(tc);
            break;
            default:
            System.out.println("Wrong choice");
            break;
        }
        sc.close();
    }
    void f_to_c(double f)
    {
        double c = (5/9)*(f-32);
        System.out.println(f+"F in celcius is : "+c+"C");
    }
    void c_to_f(double c)
    {
        double f = (9/5)*(c+32);
        System.out.println(c+"C in fahrenheit is : "+f+"F");
    }
}