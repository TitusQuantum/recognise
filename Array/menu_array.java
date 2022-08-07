/*
 * Write a program to input integer elements into an array of size 20 and perform the following operations:
 * 1. Display largest number from the array
 * 2. Display smallest number from the array
 * 3. Display sum of all the elements of the array
*/
import java.util.*;
class menu_array {
    int largest(int n[])
    {
        int x = n[0];
        int l = n.length;
        for(int i=0;i<l;i++)
        {
            if(n[i]>x)
                x=n[i];
        }
        return x;
    }
    int smallest(int n[])
    {
        int x = n[0];
        int l = n.length;
        for(int i=0;i<l;i++)
        {
            if(n[i]<x)
                x=n[i];
        }
        return x;
    }
    int sum(int n[])
    {
        int s=0;
        int l = n.length;
        for(int i=0;i<l;i++)
        {
            s=s+n[i];
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        menu_array obj = new menu_array();
        int a[] = new int[20];
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter the "+(i+1)+"th element : ");
            a[i] = sc.nextInt();
        }
        System.out.println("The largest element : "+obj.largest(a));
        System.out.println("The smallest element : "+obj.smallest(a));
        System.out.println("The sum of the elements : "+obj.sum(a));
        sc.close();
    }
}