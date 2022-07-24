class SunSeries2 {
    void series(int x, int n)
    {
        double s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+Math.pow(x,i);
        }
        System.out.println(s);
    }
    void series(int p)
    {
        for(int i=1;i<=p;i++)
        {
            System.out.print(((i*i*i)-1)+" ");
        }
    }
    void series()
    {
        double sum=0;
        for(int i=2;i<=10;i++)
        {
            sum=sum+(double)1/i;
        }
        System.out.println(sum);
    }
}
// ICSE 2019