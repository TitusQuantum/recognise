import java.util.*;
class bubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5], t=0;
        for(int i=0;i<5;i++)
        {
            n[i] = sc.nextInt();
        }
        int l = n.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-i-1;j++)
            {
                if(n[j]>n[j+1])
                {
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t; // swap n[j] and n[j+1]
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }
        sc.close();
    }
}