import java.util.*;
class binarySearch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x[] = {5,10,15,20,25,30,35,40,45,50};
        int c=0,l=0,u=9,m=0;
        System.out.print("Enter the element to search for : ");
        int n = sc.nextInt();
        while(l<=u)
        {
            m=(l+u)/2;
            if(n>x[m])
                l=m+1;
                c=m;
            else if(n<x[m])
                u=m-1;
                c=m;
            else
            {
                c=1;
                break;
            }
        }
        if(c==1)
            System.out.println("Element present at position "+(m+1));
        else 
            System.out.println("Element not present");
        sc.close();
    }
}