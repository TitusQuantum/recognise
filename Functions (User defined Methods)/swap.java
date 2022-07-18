import java.util.*;
class swap {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        xyswap(x,y);
        sc.close();
    }
    static void xyswap(int a, int b)
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("Values of x and y after swaping -");
        System.out.println("x: "+a+" "+"y: "+b);
    }
}