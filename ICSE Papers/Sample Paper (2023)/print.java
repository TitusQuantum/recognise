class print
{
    void print()
    {
        int k=1;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    boolean print(int n)
    {
        int d=0,s=0,c=0,dup=n;
        while(dup>0)
        {
            d=dup%10;
            s=s+d;
            dup=dup/10;
        }
        c=s*s*s;
        if(c==n)
            return true;
        else 
            return false;
    }
    void print(int a,char ch)
    {
        if(ch=='s'||ch=='S')
            System.out.println(a*a);
        else if(ch=='c'||ch=='C')
            System.out.println(a*a*a);
    }
}