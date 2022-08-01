import java.util.*;
public class longest_word_length{
    static int longestword(String s)
    {
        int l=0,max=0;
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)==32)
            {
                if(max > l)
                    max = l;
                    l=0;
            }
            if(s.charAt(len-1) != 32)
            {
                if(max < l)
                    max = l;
                    l++;
            }
        }
        return max;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String x = sc.nextLine();
        int a = longestword(x);
        System.out.println(a);
        sc.close();
    }
}