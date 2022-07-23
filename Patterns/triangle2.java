import java.util.*;
class triangle2 {
    void pattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        triangle2 obj = new triangle2();
        System.out.print("Enter the number of rows : ");
        int x = sc.nextInt();
        obj.pattern(x);
        sc.close();
    }
}