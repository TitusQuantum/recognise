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
        String s = sc.nextLine(), word="", display="";
        s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            char ab=s.charAt(i);
            if(ab==32)
            {
                display = word + " " + display;
                word="";
            }
            else
                word = word + ab;
        }
        System.out.println(display);
        sc.close();
    }
}