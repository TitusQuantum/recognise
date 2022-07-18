/*
 * Write a program in Java to accept a name(Containing three words) and Display only the initials (i.e., first letter of each word).
 * Sample Input: LAL KRISHNA ADVANI
 * Sample Output: L K A
*/

import java.util.*;
class name{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String s = sc.nextLine();
        s=" "+s;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            if(ab==32)
                System.out.print(Character.toUpperCase(s.charAt(i+1))+".");
        }
        sc.close();
    }
}
