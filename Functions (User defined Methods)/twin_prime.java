class twin_prime {
    static int prime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                c++;
        }
        return c;
    }
    static void display()
    {
        for(int i=10;i<=99;i++)
        {
            if(prime(i)==0 && prime(i+2)==0)
                System.out.println("("+i+","+(i+2)+")");
        }
    }
    public static void main(String args[])
    {
        display();
    }
}
