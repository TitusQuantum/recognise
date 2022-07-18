/*
 * Write a program to accept a sentence. Display the sentence in reversing order of its word.
 * Sample Input: Computer is Fun
 * Sample Output: Fun is Computer
*/

import java.util.*;
class reverse_sentence {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine(), s1="";
        s=" "+s;
        int l = s.length();
        for(int i=l-1;i>=0;i--)
        {
            char ab=s.charAt(i);
            if(ab==32)
            {
                System.out.print(s1+" ");
                s1="";
            }
            else
                s1=ab+s1;
        }
        sc.close();
    }
}