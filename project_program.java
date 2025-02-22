import java.util.*;
class Project{
    Scanner sc = new Scanner(System.in);
    static Project obj = new Project();
    public static void main(String[] args)
    {
        obj.run();
    }
    void run()
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
                System.out.println("3. Dudeney Number");
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
                        obj.Dudeney();
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
                System.out.println("3. Display all primes numbers in ascending order from an array");
                System.out.println("4. Display all perfect squares in asceding order from an array");
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
                        obj.PrimeArray();
                        break;
                    case 4:
                        obj.PerfectSquare();
                        break;
                    case 5:
                        obj.ArraySum();
                        break;
                }
                break;
            case 4:
                System.out.println("\tPattern");
                System.out.println("1. Fibonacci Triangle");
                System.out.println("2. Diamond");
                System.out.println("3. Right angled Triangle");
                System.out.println("4. Reversed Right angled Triangle");
                System.out.println("5. Floyd's Triangle");
                System.out.print("Enter the choice : ");
                int ch4 = sc.nextInt();
                switch(ch4)
                {
                    case 1:
                        obj.FibonacciTriangle();
                        break;
                    case 2:
                        obj.Daimond();
                        break;
                    case 3:
                        obj.R_Triangle();
                        break;
                    case 4:
                        obj.Rev_R_Triangle();
                        break;
                    case 5:
                        obj.Floyds();
                        break;
                }
                break;
            case 5:
                System.out.println("\tIf Else If");
                System.out.println("1. Equable Triangle");
                System.out.println("2. Determine the Nature of Roots of a Quadratic Equation");
                System.out.println("3. Check for a triangle that whether it is a Equilateral/Icoceles/Scalane");
                System.out.println("4. Check whether an entered number is a positive or negative or 0");
                System.out.println("5. Check whether a year is a leap year or not");
                System.out.print("Enter your choice : ");
                int ch5 = sc.nextInt();
                switch(ch5)
                {
                    case 1:
                        obj.Equable_Triangle();
                        break;
                    case 2:
                        obj.NOR();
                        break;
                    case 3:
                        obj.Type_of_Tri();
                        break;
                    case 4:
                        obj.po_ne_0();
                        break;
                    case 5:
                        obj.leap_year();
                        break;
                }
                break;
            case 6:
                System.out.println("\tString");
                System.out.println("1. Print entered sentence in reverse order of words");
                System.out.println("2. Print the longest word in the entered sentence");
                System.out.println("3. Replace vowels with * in the entered sentence");
                System.out.println("4. Unique String");
                System.out.println("5. Palindrome String");
                System.out.print("Enter your choice : ");
                int ch6 = sc.nextInt();
                switch(ch6)
                {
                    case 1:
                        obj.Reverse_sen();
                        break;
                    case 2:
                        obj.Longest_word();
                        break;
                    case 3:
                        obj.Replace_vowels();
                        break;
                    case 4:
                        obj.Unique();
                        break;
                    case 5:
                        obj.Palindrome();
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
    void Dudeney()
    {
        /*
         * Numbers in which the cube of sum of digits is equal to the number are called Dudeney number.
         * Ex:- 512 : (5+1+2)^3 = 8^3 = 512
        */
        System.out.print("Enter the number : ");
        int n = sc.nextInt(), d=0, s=0, c=0, dup=n;
        while(n>0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        c=s*s*s;
        if(c==dup)
            System.out.println("Entered number is a Dudeney number");
        else 
            System.out.println("Entered number is not a Dudeney number");
    }
    void Automorphic()
    {
        System.out.print("Enter the number : ");
        int n=sc.nextInt(), c=0, d=0, dup=n;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        d = (int)Math.pow(10,c);
        if((dup*dup)%d==dup)
            System.out.println("Entered number is a automorphic number");
        else
            System.out.println("Entered number is not a automorphic number");
    }
    void Spy()
    {
        /*
         * A number is spy if its sum of digits is equal to its product of digits. 
         * Ex:- 22 : 2+2=4 and 2*2=4
        */
        System.out.print("Enter the number");
        int n = sc.nextInt(), d=0, sum=0, prod=1;
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            prod=prod*d;
            n=n/10;
        }
        if(sum==prod)
            System.out.println("Entered number is a Spy number");
        else
            System.out.println("Entered number is not a Spy number");
    }
    void Fibonacci()
    {
        System.out.print("Enter the limit (till how many terms you want to print) : ");
        int n = sc.nextInt(), a=0,b=1,c=0;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    void Sum1()
    {
        System.out.print("Enter the number (till which number you want to find sum of reciprocals) : ");
        int n = sc.nextInt();
        double s = 0.0;
        for(double i=1;i<=n;i++)
        {
            s=s+(1/i);
        }
        System.out.println("Sum : "+s);
    }
    void Sum2()
    {
        System.out.print("Enter the number (till which you want to find the sum of squares) : ");
        int n=sc.nextInt(), s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+(int)Math.pow(i,2);
        }
        System.out.println("Sum of squares till "+n+" is : "+s);
    }
    void Seriesdisplay()
    {
        System.out.print("Enter the number of terms you want to print : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(((int)Math.pow(i,3)-1)+" ");
        }
    }
    void Sum3()
    {
        int s=0,p=1;
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=i;j++)
            {
                p=p*j;
            }
            s=s+p;
        }
        System.out.println("Sum : "+s);
    }
    void Sorting()
    {
        System.out.print("Enter the length of array : ");
        int l = sc.nextInt();
        int n[] = new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter the "+(i+1)+"th term : ");
            n[i] = sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(n[i]>n[j])
                {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.print("Sorted array : ");
        for(int i=0;i<l;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
    void ArrayCompare()
    {
        System.out.print("Enter the length of array : ");
        int l = sc.nextInt();
        int n[] = new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter the "+(i+1)+"th element : ");
            n[i] = sc.nextInt();
        }
        int max = n[0], min = n[0];
        for(int i=0;i<l;i++)
        {
            if(n[0]<n[i])
                max = n[i];
            else if(n[0]>n[i])
                min = n[i];
        }
        System.out.println("Largest element : "+max);
        System.out.println("Smallest element : "+min);
    }
    void PrimeArray()
    {
        System.out.print("Enter the length of array : ");
        int l = sc.nextInt();
        int n[] = new int[l];
        // taking input from the user
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter the "+(i+1)+"th element : ");
            n[i] = sc.nextInt();
        }
        //sorting the array
        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(n[i]>n[j])
                {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        //printing prime numbers present in array
        System.out.println("Prime numbers present in the array");
        int c=1;
        for(int i=0;i<l;i++)
        {
            for(int j=2;j<n[i];j++)
            {
                if(n[i]%j==0)
                    c=0;
            }
            if(c==1)
            {
                System.out.println(n[i]);
            }
            c=1;
        }
    }
    void PerfectSquare()
    {
        System.out.print("Enter the length of array : ");
        int l = sc.nextInt();
        int n[] = new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter "+(i+1)+"th element : ");
            n[i] = sc.nextInt();
        }
        //sorting the array
        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(n[i]>n[j])
                {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        //printing all perfect squares
        System.out.println("Perfect squares present in the array : ");
        for(int i=1;i<l;i++)
        {
            for(int j=1;j<n[i];j++)
            {
                if(j*j==n[i])
                    System.out.println(n[i]);
            }
        }
    }
    void ArraySum()
    {
        System.out.print("Enter the length of array : ");
        int l = sc.nextInt();
        int n[] = new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter "+(i+1)+"th element : ");
            n[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<l;i++)
        {
            sum=sum+n[i];
        }
        System.out.println("Sum of all elements of array is : "+sum);
    }
    void FibonacciTriangle()
    {
        System.out.print("Enter the number of rows to print : ");
        int n = sc.nextInt(),a=0,b=1,c=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                a=b;
                b=c;
                c=a+b;
            }
            System.out.println();
        }
    }
    void Daimond()
    {
        System.out.print("Enter the number of rows to print : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    void R_Triangle()
    {
        System.out.print("Enter the number of rows to print : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void Rev_R_Triangle()
    {
        System.out.print("Enter the number of rows to print : ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void Floyds()
    {
        System.out.print("Enter the number of rows to print : ");
        int n = sc.nextInt(),k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;i++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    void Equable_Triangle()
    {
        System.out.println("Enter the three sides of the triangle");
        System.out.print("1st side : ");
        double a = sc.nextDouble();
        System.out.print("2nd side : ");
        double b = sc.nextDouble();
        System.out.print("3rd side : ");
        double c = sc.nextDouble();
        double p = (a+b+c);
        double s = (a+b+c)/2;
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        if(p==area)
            System.out.println("Entered triangle is equable");
        else
            System.out.println("Entered triangle is not a equable triangle");
    }
    void NOR()
    {
        System.out.println("General expression for a quadratic equation : ax^2 + bx + c = 0");
        System.out.println("Enter the value for a,b and c (it can be negative also)");
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        double d = b*b - 4*a*c;
        if(d>0)
            System.out.println("Real and distinct roots");
        else if(d==0)
            System.out.println("Real and equal roots");
        else if(d<0)
            System.out.println("Imaginary roots");
    }
    void Type_of_Tri()
    {
        System.out.println("Enter the sides of triangle");
        System.out.print("1st side : ");
        double a = sc.nextDouble();
        System.out.print("2nd side : ");
        double b = sc.nextDouble();
        System.out.print("3rd side : ");
        double c = sc.nextDouble();
        if((a==c)&&(b==c)&&(c==a))
            System.out.println("Equilateral Triangle");
        else if((a==b) || (b==c) || (a==c))
            System.out.println("Isoceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
    void po_ne_0()
    {
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n>0)
            System.out.println("Positive number");
        else if(n<0)
            System.out.println("Negative number");
        else
            System.out.println("Nor negative not positive");
    }
    void leap_year()
    {
        System.out.print("Enter the year : ");
        int n = sc.nextInt(),d=0,c=0,dup=n;
        while(dup>0)
        {
            d=dup%10;
            c++;
            dup=dup/10;
        }
        if(c<4)
        {
            System.out.println("Wrong input");
            System.out.println("The year should be in 4 digits only");
        }
        else
        {
            if(n%4==0)
                System.out.println("Entered year is a leap year");
            else
                System.out.println("Entered year is not a leap year");
        }
    }
    void Reverse_sen()
    {
        System.out.print("Enter the sentence : ");
        String s = sc.nextLine();
        String display="",word="";
        s = s+" ";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab = s.charAt(i);
            if(ab!=32)
            {
                word = word + ab;
            }
            else
            {
                display=word+" "+display;
                word="";
            }
        }
        System.out.println(display);
    }
    void Longest_word()
    {
        System.out.print("Enter the sentence : ");
        String s = sc.nextLine(),lw="",w="";
        s=s+" ";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab = s.charAt(i);
            if(ab!=32)
            {
                w=w+ab;
            }
            else
            {
                if(w.length()>lw.length())
                    lw=w;
                w="";
            }
            System.out.println("Longest word present in sentence : "+lw);
            System.out.println("Length of the word : "+lw.length());
        }
    }
    void Replace_vowels()
    {
        System.out.print("Enter the sentence : ");
        String s = sc.nextLine(),display="";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab = s.charAt(i);
            if(ab=='A'||ab=='a'||ab=='E'||ab=='e'||ab=='I'||ab=='i'||ab=='O'||ab=='o'||ab=='U'||ab=='u')
                display = display + "*";
            else
                display = display + ab;
        }
        System.out.println(display);
    }
    void Unique()
    {
        System.out.print("Enter the sentence : ");
        String s = sc.nextLine();
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            for(int j=i+1;i<l;i++)
            {
                char cd = s.charAt(j);
                if(ab==cd)
                    System.out.println("Magic String");
                else
                    System.out.println("Not a Magic String");
            }
        }
    }
    void Palindrome_String()
    {
        System.out.print("Enter the String : ");
        String s = sc.nextLine(), rev="";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            rev = ab + rev;
        }
        if(s.equals(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}