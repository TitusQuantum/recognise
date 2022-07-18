/*
 * Write a program in Java to accept a name containing three words and display the surname first, followed by the first and middle names.
 * Sample Input: MOHANDAS KARAMCHAND GANDHI
 * Sample Output: GANDHI MOHANDAS KARAMCHAND
*/

import java.util.*;
class reverse_name {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String s = sc.nextLine(), s1="";
        int l = s.length(), x = s.lastIndexOf(32);
        for(int i=x;i<l;i++)
        {
            char ab=s.charAt(i);
            s1=s1+ab;
        }
        s1=s1+" ";
        String initial = s.substring(0,x+1);
        System.out.println(s1+initial);
        sc.close();
    }
}
