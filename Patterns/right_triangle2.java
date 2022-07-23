import java.util.*;

class right_triangle2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        right_triangle2 obj = new right_triangle2();
        System.out.print("Enter the no, of rows you want to print : ");
        int n = sc.nextInt();
        obj.pattern(n);
        sc.close();
    }
    void pattern(int x)
    {
        for(int i=x;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}