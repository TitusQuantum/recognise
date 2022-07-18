import java.util.*;
public class calculate {
    int num,f,rev;
    calculate(int n)
    {
        num=n;
        f=0;
        rev=0;
    }
    int prime()
    {
        f=1;
        if(num==0 || num==1)
            f=0;
        else
            for(int i=2;i<num/2;i++)
            {
                if(num%i == 0)
                    f = 0;
                    break;
            }
        return f;
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
        if(f==1 && num==rev)
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
    }
}
