class number_rtriangle {
    public static void display()
    {
        int a=0,b=1,c=0;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                a=b;
                b=c;
                c=a+b;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        display();
    }
}
