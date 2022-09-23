import java.util.*;
class double_array_range {
    double range(double n[])
    {
        double max=n[0],min=n[0];
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>max)
                max = n[i];
            else if(n[i]<min)
                min = n[i];
        }
        double range = max - min;
        return range;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double_array_range obj = new double_array_range();
        double x[] = new double[20];
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter the "+(i+1)+"th element : ");
            x[i] = sc.nextDouble();
        }
        double dis = obj.range(x);
        System.out.println("Range of the array : "+dis);
        sc.close();
    }
}