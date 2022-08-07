import java.util.*;
class piglatin{
    static String Piglatin(String s)
    {
        s = s.toUpperCase();
        int l = s.length();
        int i;
        for(i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            if(ab=='A'||ab=='E'||ab=='I'||ab=='O'||ab=='U')
                break;
        }
        String s1 = s.substring(0,i);
        String s2 = s.substring(i);
        return s2+s1+"AY";
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String x = sc.nextLine();
        String a = Piglatin(x);
        System.out.println(a);
        sc.close();
    }
}