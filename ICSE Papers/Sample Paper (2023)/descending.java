import java.util.*;
class descending {
    void bubbleSort(int n[])
    {
        int t=0,l=n.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1-i;j++)
            {
                if(n[j]<n[j+1])
                {
                    t=n[j+1];
                    n[j+1]=n[j];
                    n[j]=t;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for(int i=0;i<l;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        descending obj = new descending();
        int x[] = new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter "+(i+1)+"th element : ");
            x[i]=sc.nextInt();
        }
        System.out.println("Original Array : ");
        for(int i=0;i<10;i++)
        {
            System.out.print(x[i]+" ");
        }
        obj.bubbleSort(x);
        sc.close();
    }
}
