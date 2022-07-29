/*
 * Write a program to display all the 'Buzz Numbers' between p and q (where p<q). A 'Buzz Number' is the number which ends with 7 or is divisible by 7.
*/

import java.util.*;
public class buzz_number {
    void buzz(int p,int q)
    {
        if(p<q)
        {
            for(int i=p;i<=q;i++)
            {
                if(i%10==7 || i%7==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        buzz_number obj = new buzz_number();
        System.out.println("Enter the numbers to find all the buzz between them (including these two) : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Buzz numbers between "+a+" and "+b+" are :");
        obj.buzz(a,b);
        sc.close();
    }
}
