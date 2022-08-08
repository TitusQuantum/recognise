import java.util.*;
class Project{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Project obj = new Project();
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

    }
    void Palindrome()
    {

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