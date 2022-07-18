/*
 * Write a program to input a sentence. Find and display the following:
 * (i) Number of words present in the sentence
 * (ii) Number of letters present in the sentence
 * Assume that the sentence has neither include any digit nor a special character.
*/

import java.util.*;
class sentence{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        s=" "+s;
        int l = s.length(),c=0,n=0; //c for no. of letters , n for no. words
        for(int i=0;i<l;i++)
        {
            char ab = s.charAt(i);
            if(ab!=32)
                c++;
            else if(ab==32)
                n++;
        }
        System.out.println("No. of words present in sentence : "+n);
        System.out.println("No. of letters present in sentence : "+c);
        sc.close();
    }
}