/*
 * Write a program in Java to enter a sentence. Frame a word by joining all the first characters of each word of the sentence. Display the word.
 * Sample Input: Vital Information Resource Under Seize
 * Sample Output: VIRUS
*/

import java.util.*;
class short_form {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        s=" "+s;
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab = s.charAt(i);
            if(ab==32)
                System.out.print(s.charAt(i+1));
        }
        sc.close();
    }
}
