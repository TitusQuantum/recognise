import java.util.*;
public class perfect_palin {
    void perfect_no(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(n==s)
            System.out.println("Perfect number");
        else
            System.out.println("Not a Perfect number");
    }
    void Palin(int n)
    {
        int rev=0,d,dup=n;
        while(n>0)
        {
            d=n%10;
            rev = rev*10 + d;
            n=n/10;
        }
        if(rev==dup)
            System.out.println("Palindrome Number");
        else 
            System.out.println("Not a Palindrome Number");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        perfect_palin obj = new perfect_palin();
        System.out.println("\tMenu");
        System.out.println("1. Check for perfect number.");
        System.out.println("2. Check for palindrome number.");
        System.out.print("Enter your choice (1/2) : ");
        int choice = sc.nextInt();
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        switch(choice)
        {
            case 1:
                obj.perfect_no(x);
                break;
            case 2:
                obj.Palin(x);
                break;
            default:
                System.out.println("Wrong choice");
        }
        sc.close();
    }
}