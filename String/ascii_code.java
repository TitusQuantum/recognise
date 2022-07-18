/*
 * Write a program in Java to accept a word and display the ASCII code of each character of the word.
 * Sample Input: BLUEJ
 * Sample Output:
 * ASCII of B = 66
 * ASCII of L = 76
 * ASCII of U = 85
 * ASCII of E = 69
 * ASCII of J = 74
*/

import java.util.*;
class ascii_code {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        String s = sc.nextLine();
        int l = s.length();
        
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            System.out.println("The ASCII code of "+ab+" is "+(int)ab);
        }
        sc.close();
    }
}
