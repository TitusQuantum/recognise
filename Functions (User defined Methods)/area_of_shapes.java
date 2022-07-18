class area_of_shpaes{
    double area(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return ar;
    }
    double area(int a, int b, int h)
    {
        double ar = (h*(a+b))/2;
        return ar;
    }
    double area(double d1, double d2)
    {
        double ar = (d1*d2)/2;
        return ar;
    }
}
