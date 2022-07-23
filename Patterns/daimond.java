import java.util.*;
class daimond {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        daimond obj = new daimond();

        System.out.print("Enter the no. of rows you want to print : ");
        int lol = sc.nextInt();
        int x = lol/2;

        obj.pattern(x);
        sc.close();
    }
    void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}