import java.util.*;
public class sri{
    static sri obj = new sri();
    void input()
    {
        Scanner sc = new Scanner(System.in);
        String n[] = new String[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter "+(i+1)+"th name : ");
            n[i] = sc.nextLine();
        }
        System.out.print("Enter the name to search for : ");
        String s = sc.nextLine();
        obj.search(n,s);
        obj.print(n);
    }
    void search(String n[], String s)
    {
        for(int i=0;i<n.length;i++)
        {
            if(n[i].equals(s))
                System.out.println("Element found at "+i+"th position.");
            else 
                System.out.println("Element not found.");
        }
    }
    void print(String n[])
    {
        System.out.println("Names starting with 'SRI' : ");
        for(int i=0;i<n.length;i++)
        {
            String dup = n[i].toUpperCase();
            String a = "SRI";
            String b = dup.substring(0,3);
            if(a.equals(b))
                System.out.println(n[i]);
        }
    }
    public static void main(String args[])
    {
        obj.input();
    }
}