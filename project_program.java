import java.util.*;
class Project{
    Scanner sc = new Scanner(System.in);
    Project obj = new Project();
    void main(String args[])
    {
        System.out.println("\tMain Menu");
        System.out.println("1. Number System");
        System.out.println("2. Series");
        System.out.println("3. Array");
        System.out.println("4. Pattern");
        System.out.println("5. If else if");
        System.out.println("6. String");
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1: 
                System.out.println("\tNumber System");
                System.out.println("1. Armstrong Number");
                System.out.println("2. Palindrome Number");
                System.out.println("3. Dudeny Number");
                System.out.println("4. Automorphic Number");
                System.out.println("5. Spy Number");
                System.out.print("Enter your choice : ");
                int ch1 = sc.nextInt();
                switch(ch1)
                {
                    case 1:
                        obj.Armstrong();
                        break;
                    case 2:
                        obj.Palindrome();
                        break;
                    case 3:
                        obj.Dudeny();
                        break;
                    case 4:
                        obj.Automorphic();
                        break;
                    case 5:
                        obj.Spy();
                        break;
                }
                break;
            case 2: 
                System.out.println("\tSeries");
                System.out.println("1. Fibonacci Series");
                System.out.println("2. Sum of series 1/1 + 1/2 + .... + 1/n");
                System.out.println("3. Sum of squares of numbers till n");
                System.out.println("4. Display the series : 0,7,26,63,.... p terms");
                System.out.println("5. Sum of the series : 1+(1*2)+(1*2*3)+(1*2*3*4)+.....+(1*2*3.....*20)");
                System.out.print("Enter your choice : ");
                int ch2 = sc.nextInt();
                switch(ch2)
                {
                    case 1:
                        obj.Fibonacci();
                        break;
                    case 2:
                        obj.Sum1();
                        break;
                    case 3:
                        obj.Sum2();
                        break;
                    case 4:
                        obj.Seriesdisplay();
                        break;
                    case 5:
                        obj.Sum3();
                        break;
                }
                break;
            case 3:
                System.out.println("\tArray");
                System.out.println("1. Sorting an array");
                System.out.println("2. Finding smallest and largest element of an array");
                System.out.println("3. Searching an element in an array using Linear Search Technique");
                System.out.println("4. Searching an element in an array using Binary Search Technique");
                System.out.println("5. Sum of all elements of an array");
                System.out.print("Enter your choice : ");
                int ch3 = sc.nextInt();
                switch(ch3)
                {
                    case 1:
                        obj.Sorting();
                        break;
                    case 2:
                        obj.ArrayCompare();
                        break;
                    case 3:
                        obj.Linear();
                        break;
                    case 4:
                        obj.Binary();
                        break;
                    case 5:
                        obj.ArraySum();
                        break;
                }
                break;
        }
        sc.close();
    }
    void Armstrong()
    {
        /*
         * Armstrong number is a number whose sum of cubes of its digits is equal to the number.
         * Ex:- 153 
         * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        */
        System.out.print("Enter the number : ");
        int n = sc.nextInt(), d=0, s=0, dup=n;
        while(n>0)
        {
            d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(dup==s)
            System.out.println("Entered number is a Armstrong number");
        else
            System.out.println("Entered number is not a Armstrong Number");
    }
    void Palindrome()
    {
        /*
         * Numbers which are still same after reversing its digits are called Palindrome Number.
         * Ex:- 121 , 12521 , etc.
        */
        System.out.print("Enter the number : ");
        int n=sc.nextInt(), d=0, rev=0, dup=n;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==dup)
            System.out.println("Entered number is a Palindrome number");
        else 
            System.out.println("Entered number is not a Palindrome Number");
    }
    void Dudeny()
    {

    }
    void Automorphic()
    {

    }
    void Spy()
    {

    }
    void Fibonacci()
    {

    }
    void Sum1()
    {

    }
    void Sum2()
    {

    }
    void Seriesdisplay()
    {

    }
    void Sum3()
    {

    }
    void Sorting()
    {

    }
    void ArrayCompare()
    {

    }
    void Linear()
    {

    }
    void Binary()
    {

    }
    void ArraySum()
    {

    }
}