import java.util.*;
class armstrong {
    public int check(int n)
    {
        int num=n, sum=0;
        while(n>0)
        {
            int d = num % 10;
            sum = sum + (d*d*d);
            num=num/10;
        }
        if(num==sum)
            return 1;
        else 
            return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tEnter the number you want to check : ");
        int x = sc.nextInt();

        armstrong obj = new armstrong();
        int val = obj.check(x);

        if(val==1)
            System.out.print("Armstrong number");
        else 
            System.out.print("Not an armstrong number");
        sc.close();
    }
}