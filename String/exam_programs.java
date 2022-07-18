/*
 * Write a program in java to print the following output in given format.
 * Sample Input : COMPUTER APPLICATIONS
 * Sample Output : APPLICATIONS COMPUTER
*/

import java.util.*;
class exam_programs{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        s=" "+s;
        int l = s.length();
        int sp = s.lastIndexOf(32);
        String s1 = s.substring(0,sp);
        String s2 = s.substring(sp,l);
        System.out.println(s2+" "+s1);
        sc.close();
    }
}
