import java.util.*;

public class right_triangle{
    void triangle(int x)
    {
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        right_triangle obj = new right_triangle();
        System.out.print("Enter the no. of rows you want to print : ");
        int n = sc.nextInt();
        obj.triangle(n);
        sc.close();
    }
}