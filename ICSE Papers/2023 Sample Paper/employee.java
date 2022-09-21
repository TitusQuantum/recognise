import java.util.*;
class employee
{
    double eno,basic,net;
    String ename;
    int age;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee number : ");
        eno  = sc.nextDouble();
        System.out.print("enter the name of employee : ");
        ename = sc.nextLine();
        System.out.print("Enter the age of the employee : ");
        age = sc.nextInt();
        System.out.print("Enter the basic salary : ");
        basic = sc.nextDouble();
        sc.close();
    }
    void calculate()
    {
        double hra = (18.5/100)*basic;
        double da = (17.45)*basic;
        double pf = (8.10/100)*basic;
        net = basic + hra + da - pf;
        if(age>50)
            net = net + 5000;
    }
    void print()
    {
        System.out.println(eno+"   "+ename+"   "+"   "+age+"   "+basic+"   "+net);
    }
    public static void main(String args[])
    {
        employee obj = new employee();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}