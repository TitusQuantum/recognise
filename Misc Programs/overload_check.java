class overload_check {
    void overload_check(String str,char ch)
    {
        int l=str.length(),f=0;
        for(int i=0;i<l;i++)
        {
            char ab=str.charAt(i);
            if(ab==ch)
                f++;
        }
        System.out.println(f);
    }
    void overload_check(String s1)
    {
        String s = s1.toLowerCase();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            if(ab=='a'||ab=='e'||ab=='i'||ab=='o'||ab=='u')
                System.out.print(ab+" ");
        }
    }
}
// ICSE 2017