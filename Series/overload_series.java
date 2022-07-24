class overload_series {
    double sum=0;
    double series(double n)
    {
        for(int i=1;i<=n;i++)
        {
            sum+=1/i;
        }
        return sum;
    }
    double series(double a, double n)
    {
        int c=1;
        for(int i=1;i<=n;i++)
        {
            sum+=c/Math.pow(a,c+1);
            c+=3;
        }
        return sum;
    }
}
