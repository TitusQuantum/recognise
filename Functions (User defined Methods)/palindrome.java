import java.util.*;
class palindrome {
    int reverse(int n)
    {
        int t=n,r=0;
        while(n!=0)
        {
            r=(r*10)+(t%10);
            t/=10;
        }
        return r;
    }
    void isPalin(int a)
    {
        if(a==reverse(a))
            System.out.println("Palindrome Number");
        else 
            System.out.println("Not a Palindrome Number");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        palindrome obj = new palindrome();
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        obj.isPalin(x);
    }
}
