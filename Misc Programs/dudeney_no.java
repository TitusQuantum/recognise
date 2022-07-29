/*
 *  Print all dudeney number between 1 and 100000 (including them)
 *  A Dudeney number is a positive integer that is a perfect cube such that the sum of its digits is equal to the cube root of the number. Write a program to input a number and check and print whether it is a Dudeney number or not.
*/

public class dudeney_no {
    int dudeney(int n)
    {
        int dup=n,d=0,c=0,s=0,x;
        while(n>0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        c = s*s*s;
        if(dup==c)
            x=1;
        else
            x=0;
        return x;
    }
    public static void main(String args[])
    {
        dudeney_no obj = new dudeney_no();
        for(int i=1;i<100000;i++)
        {
            if(obj.dudeney(i)==1)
                System.out.println(i);
        }
    }
}