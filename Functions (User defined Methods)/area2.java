import java.util.*;
class area2 {
    void circle(double r)
    {
        double ar = (22/7)*r*r;
        System.out.println(ar);
    }
    void square(double s)
    {
        double ar = s*s;
        System.out.println(ar);
    }
    void rectangle(double l, double b)
    {
        double ar = l*b;
        System.out.println(ar);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        area2 obj = new area2();

        System.out.println("\tMenu");
        System.out.println("1. Find area of circle");
        System.out.println("2. Find area of square");
        System.out.println("3. Find area of rectangle");
        System.out.print("Eneter your choice : ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1: 
                System.out.print("Enter radius of circle : ");
                double r = sc.nextDouble();
                obj.circle(r);
            case 2:
                System.out.print("Eneter the side of square : ");
                double s = sc.nextDouble();
                obj.square(s);
            case 3:
                System.out.print("Enter the length of rectangle : ");
                double l = sc.nextDouble();
                System.out.print("Enter the breadth of rectange : ");
                double b = sc.nextDouble();
                obj.rectangle(l, b);
            default:
                System.out.println("Wrong choice");
        }
        sc.close();
    }
}