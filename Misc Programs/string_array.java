/*
 * Convert a string to string array
 * String x = "Im a dumb"
 * String x[] = [Im a dumb]
*/

import java.util.*;
public class string_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        string_array obj = new string_array();

        System.out.println("Enter the string : ");
        String x = sc.nextLine();

        int l = x.length();
        String y[] = new String[l] ;

        obj.array(x,y);
        sc.close();
    }
    void array(String a, String b[])
    {
        for(int i=0;i<a.length();i++)
        {
            char ab=a.charAt(i);
            String t = "" + ab;
            b[i] = t;
        }
    }
}