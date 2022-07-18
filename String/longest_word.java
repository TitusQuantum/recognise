/*
 * Write a program in Java to enter a String/Sentence and display the longest word and the length of the longest word present in the String.
 * Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN”
 * Sample Output: The longest word: FOOTBALL ; The length of the word: 8
*/

import java.util.*;
class longest_word {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String s = sc.nextLine();
        s+=" ";
        String w="",lw="";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            if(ab==32){
                if(w.length()>lw.length())
                    lw=w;
                w="";
            }
            else{
                w+=ab;
            }
        }
        System.out.println("The longest word is: "+lw+", The length of words is: "+lw.length());
        sc.close();
    }
}
