public class overloading{
    void compare(int a ,int b)
    {
        if(a>b)
            System.out.println(a);
        else if(b>a)
            System.out.println(b);
        else 
            System.out.println("they are equal");
    }
    void compare(char ab1, char ab2)
    {
        if((int)ab1 > (int)ab2)
            System.out.println(ab1);
        else if((int)ab1 < (int)ab2)
            System.out.println(ab2);
        else 
            System.out.println("they are equal");
    }
    void compare(String s1, String s2)
    {
        int l1 = s1.length();
        int l2= s2.length();
        if(l1>l2)
            System.out.println(s1);
        else if(l1<l2)
            System.out.println(s2);
        else 
            System.out.println("they are equal strings");
    }
}
