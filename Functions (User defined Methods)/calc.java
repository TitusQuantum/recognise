class calc {
    void num_calc(int num, char ch)
    {
        int val;
        if(ch=='s')
            val = num*num;
        else 
            val = num*num*num;
        System.out.print(val);
    }
    void num_calc(int a, int b, char ch)
    {
        int val;
        if(ch=='p')
            val = a*b;
        else 
            val = a+b;
        System.out.print(val);
    }
    void num_calc(String s1, String s2)
    {
        if(s1.equals(s2) == true)
            System.out.print("Equal");
        else 
            System.out.print("Not equal");
    }
}
