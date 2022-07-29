import java.util.*;
public class duck_number {
    int duck(int n)
    {
        int d, c=0;
        while(n>0)
        {
            d=n%10;
            if(d==0)
            {
                c++;
            }
            n=n/10;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        duck_number obj = new duck_number();
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        int c = obj.duck(x);
        if(c==0)
            System.out.println("Its not a duck number");
        else
            System.out.println("Its a duck number");
        sc.close();
    }
}
