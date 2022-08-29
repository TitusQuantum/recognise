import java.util.*;
public class unique_string {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        int l = s.length();
        boolean unique = false;
        for(int i=0;i<l;i++)
        {
            char ab = s.charAt(i);
            for(int j=i+1;j<l;j++)
            {
                char cd = s.charAt(j);
                if(ab==cd)
                    unique = false;
                else
                    unique = true;
            }
        }
        if(unique)
            System.out.println("Unique String");
        else 
            System.out.println("Not a unique string");
        sc.close();
    }
}