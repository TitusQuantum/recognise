import java.util.*;
class frequency {
    static frequency obj = new frequency();
    String sen, search, word=" ";
    int c = 0;
    int count()
    {
        sen=sen+" ";
        for(int i=0;i<sen.length();i++)
        {
            char ch=sen.charAt(i);
            if(ch==32)
            {
                if(search.equalsIgnoreCase(word))
                    c++;
            }
            else 
                word = word + ch;
        }
        return c;
    }
    void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        sen = sc.nextLine();
        System.out.print("Enter the word to search for : ");
        search = sc.nextLine();
        int x = obj.count();
        if(x>0)
            System.out.println("Frequency of "+search+" in the sentence is : "+c);
        else 
            System.out.println("Word is not present in the sentence");
        sc.close();
    }
    public static void main(String args[])
    {
        obj.run();
    }
}