import java.util.*;
class quadratic {
    static void input(double x)
    {
        double val = 3*x*x - 8*x + 4;
        System.out.print("At x="+x+" the value is "+val);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for x : ");
        double n = sc.nextDouble();
        input(n);
        sc.close();
    }
}