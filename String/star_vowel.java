/*
 * Write a program in Java to accept a String in upper case and replace all the vowels present in the String with Asterisk (*) sign.
 * Sample Input: "TATA STEEL IS IN JAMSHEDPUR"
 * Sample output: T*T* ST**L *S *N J*MSH*DP*R
*/

import java.util.*;
class star_vowel{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine(), s1="";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab = Character.toUpperCase(s.charAt(i));
            if(ab=='A'||ab=='E'||ab=='I'||ab=='O'||ab=='U')
                s1=s1+"*";
            else 
                s1=s1+ab;
        }
        System.out.println(s1);
        sc.close();
    }
}