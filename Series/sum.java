import java.util.*;
class sum{
    static void Sum(int n)
    {
        int S=0;
        for(int i=0;i<=n;i++)
        {
            S+=i*(i+1);
        }
        System.out.print(S);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int :");
        int x = sc.nextInt();
        Sum(x);
        sc.close();
    }
}