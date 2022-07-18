/*
 * Write a program in Java to enter a sentence. Display the words which are only palindrome.
 * Sample Input: MOM AND DAD ARE NOT AT HOME
 * Sample Output: MOM
 *                DAD
*/

import java.util.*;
class palindrome_in_sentence{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String s = sc.nextLine(), pw=""; //w for palindrome words
        s=s+" ";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            if(ab==32)
            {
                int pwl = pw.length();
                boolean palindrome = true;
                for(int j=0;j<pwl/2;j++)
                {
                    if(pw.charAt(j)!=pw.charAt(pwl-1-j))
                    {
                        palindrome = false;
                        break;
                    }
                }
                if(palindrome)
                    System.out.println(pw);
                pw="";
            }
            else
            {
                pw=pw+ab;
            }
        }
        sc.close();
    }
}
