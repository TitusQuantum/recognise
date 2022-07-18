// My first array program :)

import java.util.*;
class first_java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10], sum=0;
        for(int i=0;i<n.length;i++)
            n[i]=sc.nextInt();
        for(int j=0;j<n.length;j++)
            sum=sum+n[j];
        System.out.println("Sum of entered numbers is "+sum);
        sc.close();
    }
}