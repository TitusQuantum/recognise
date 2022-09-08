import java.util.*;
class city{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n[] = new String[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter the name of the city : ");
            n[i] = sc.nextLine();
        }
        for(int i=0;i<10;i++)
        {
            String s = n[i];
            s=s.toUpperCase();
            int l = s.length();
            char ab=s.charAt(0), cd=s.charAt(l-1);
            if((ab!='A'||ab!='E'||ab!='I'||ab!='O'||ab!='U') && (cd=='A'||cd=='E'||cd=='I'||cd=='O'||cd=='U'))
                System.out.println(s);
        }
        sc.close();
    }
}