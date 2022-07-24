/*
 * WAP to  accept a number and check and display whether it is a spy number or not. 
 * (A number is spy if its sum of digits is equal to its product of digits)           [ICSE 2017]
*/

import java.util.*;
class spy_number{
    static void spy(int n)
    {
        int s=0,p=1,d; //s - sum ; p - product ; d - digits 
        while(n>0)
        {
            d=n%10; 
            n=n/10;
            s+=d;
            p*=d;
        }
        if(s==p)
            System.out.println("Its a spy number");
        else
            System.out.println("Its not a spy number");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        spy(x);
        sc.close();
    }
}