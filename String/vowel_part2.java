import java.util.*;
public class vowel_part2 {
    static void display(String a)
    {
        int l = a.length();
        for(int i=0;i<l;i++)
        {
            char ab=a.charAt(i);
            if(ab=='A'||ab=='a'||ab=='E'||ab=='e'||ab=='I'||ab=='i'||ab=='O'||ab=='o'||ab=='U'||ab=='u')
                System.out.println(ab);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        display(s);
        sc.close();
    }
}
