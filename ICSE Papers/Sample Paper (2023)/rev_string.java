import java.util.*;
class rev_string {
    String reverse(String s)
    {
        String rev = "";
        for(int i=0;i<s.length();i++)
        {
            char ab = s.charAt(i);
            rev=ab+rev;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        rev_string obj = new rev_string();
        System.out.print("Enter the String : ");
        String x = sc.nextLine();
        System.out.println("Reverse String : "+obj.reverse(x));
        sc.close();
    }
}