import java.util.*;
public class coprime {
    int hcf(int a, int b)
    {
        int c=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
                c=i;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        coprime obj = new coprime();
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = obj.hcf(a,b);
        if(x==1)
            System.out.println("They are co-prime numbers");
        else 
            System.out.println("They are not co-prime numbers");
        sc.close();
    }
}