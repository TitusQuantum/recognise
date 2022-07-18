import java.util.*;
class lcmhcf{
    int a,b;
    lcmhcf(int x, int y)
    {
        a=x;
        b=y;
    }
    void calculate()
    {
        int x=a, y=b;
        while(y!=0)
        {
            int t = y;
            y = x % y;
            x = t;
        }

        int hcf = x;
        int lcm = (a*b)/hcf;

        System.out.print("The HCF of given numbers is : "+hcf);
        System.out.print("\nThe LCM of given numbers is : "+lcm);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int m = sc.nextInt();
        System.out.print("\nEnter the second number : ");
        int n = sc.nextInt();

        lcmhcf obj = new lcmhcf(m,n);
        obj.calculate();

        sc.close();
    }
}