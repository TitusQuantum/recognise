import java.util.*;
class capital {
    void update(String s)
    {
        s=s.toLowerCase();
        s=" "+s;
        int l=s.length();
        for(int i=0;i<l-1;i++)
        {
            char ab=s.charAt(i);
            if(ab==32)
                System.out.print(Character.toUpperCase(s.charAt(i+1)));
            else
                System.out.print(s.charAt(i+1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        capital obj = new capital();
        System.out.print("Enter the string : ");
        String x = sc.nextLine();
        obj.update(x);
        sc.close();
    }
}
