import java.util.*;
class magic_string{
    void magic(String x)
    {
        boolean magic = false;
        String s = x.toUpperCase();
        int l = s.length();

        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)+1==s.charAt(i+1))
            {
                magic = true;
                break;
            }
        }
        if(magic=true)
            System.out.print("Magic String");
        else
            System.out.print("Not a magic string");
            System.out.print(magic);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        magic_string obj = new magic_string();

        System.out.println("Eneter the string : ");
        String s = sc.nextLine();
        obj.magic(s);

        sc.close();
    }
}