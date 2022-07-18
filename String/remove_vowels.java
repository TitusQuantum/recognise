/*
 * Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.
 * Sample Input: COMPUTER APPLICATIONS
 * Sample Output: CMPTR PPLCTNS
*/

import java.util.*;
class remove_vowels {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.nextLine(), s1="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            if(ab=='A'||ab=='a'||ab=='E'||ab=='e'||ab=='I'||ab=='i'||ab=='O'||ab=='o'||ab=='U'||ab=='u')
            {
                continue;
            }
            s1=s1+ab;
        }
        System.out.println(s1);
        sc.close();
    }
}

/*
 * continue; statement keeps the rest of the elements of a string and exclude the condition statements
 */