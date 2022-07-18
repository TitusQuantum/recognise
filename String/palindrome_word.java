import java.util.*;
class palindrome_word {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String s = sc.nextLine(), s1="";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab = s.charAt(i);
            s1=ab+s1;
        }
        if(s.equals(s1))
            System.out.println("Palindrome Word");
        else 
            System.out.println("Not a Palindrome Word");
        sc.close();
    }
}
