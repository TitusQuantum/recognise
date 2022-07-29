import java.util.*;
public class calculate {
    int num,c,rev;
    calculate(int n)
    {
        num=n;
        c=0;
        rev=0;
    }
    int prime()
    {
        c=1;
        if(num==0 || num==1)
            c=0;
        else
            for(int i=2;i<num/2;i++)
            {
                if(num%i == 0)
                    c = 0;
                    break;
            }
        return c;
    }
    int reverse()
    {
        int t=rev;
        while(t!=0)
        {
            int d = t%10;
            rev = rev*10+d;
            t=t/10;
        }
        return rev;
    }
    void display()
    {
        if(c==1 && num==rev)
            System.out.println("Prime Palindrome number");
        else 
            System.out.println("Not a prime palindrome number");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();

        calculate obj = new calculate(x);
        obj.prime();
        obj.reverse();
        obj.display();
        sc.close();
    }
}
