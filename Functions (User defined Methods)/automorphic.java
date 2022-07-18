import java.util.*;
class automorphic {
    static void input(int n)
    {
        int digit = count(n);
        int div = (int)Math.pow(10,digit);
        compute(n,div);
    }
    static int count(int no)
    {
        int c=0;
        while(no>0)
        {
            c++;
            no=no/10;
        }
        return c;
    }
    static void compute(int a, int b)
    {
        if((a*a)%b==a)
            System.out.println("Autormorphic Number");
        else
            System.out.println("Not a automorphic number");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        input(x);
        sc.close();
    }
}
