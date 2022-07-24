class SumSeries {
    double s=0;
    void SumSeries(int n,double x)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                s=s-x/i;
            else 
                s=s+x/i;
        }
        System.out.println(s);
    }
    void SumSeries()
    {
        int f=1;
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=i;j++)
            {
                f=f*j;
            }
            s=s+f;
        }
        System.out.println(s);
    }
}
// ICSE 2016