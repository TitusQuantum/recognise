import java.util.*;
class arraySum2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int l = sc.nextInt();
        int n[] = new int [l];
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter the "+(i+1)+"th term : ");
            n[i] = sc.nextInt();
        }
        int evenSum=0, oddSum=0;
        for(int i=0;i<l;i++)
        {
            if(n[i]%2==0)
                evenSum = evenSum + n[i];
            else
                oddSum = oddSum + n[i];
        }
        System.out.println("Sum of even elements present in array : "+evenSum);
        System.out.println("Sum of odd elements present in array : "+oddSum);
        sc.close();
    }
}