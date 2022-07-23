import java.util.*;
class triangle {
    void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" "); //printing the no. of spaces before the star
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*"+" "); //priting the star with a space after it
            }
            System.out.println(); //changing the line 
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        triangle obj = new triangle();
        System.out.print("Enter the no. of rows : ");
        int x = sc.nextInt();
        obj.pattern(x);
        sc.close();
    }
}