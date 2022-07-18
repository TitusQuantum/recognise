import java.util.*;
class perfect_sq {
    void sqrt(int n[])
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<n[i];j++)
            {
                if(j*j==n[i])
                    System.out.println(n[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        perfect_sq obj = new perfect_sq();
        int x[] = new int [10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter the "+(i+1)+"th number : ");
            x[i]=sc.nextInt();
        }
        obj.sqrt(x);
        sc.close();
    }
}