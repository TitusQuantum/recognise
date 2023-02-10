# Data Types in Java
Java have data types catarogised in two categories : 
1. Primitive Data Types
2. Non - Primitive Data Types

## Primitive Data Types
TYPE | DESCRIPTION | DEFAULT | SIZE | RANGE
--- | --- | --- | --- | --- | ---
`boolean` | _true_ or _false_ | _false_ | 1 bit | _true_ , _false_
`byte` | two's complement integer | 0 | 8 bits | -127 to 128 | (none)
`char` | unicode character | \u0000 | 16 bits | ASCII Values from 0 to 265
`short` | two's complement integer | 0 | 16 bits | -32,768 to 32767
`int` | two's complement integer | 0 | 32 bits | -2,147,483,648 to 2,147,483,648
`long` | two's complement integer | 0 | 64 bits | -(18th figure) to (18th figure)
`float` | IEEE 754 floating point | 0.0 | 32 bits | upto 7 decimal places
`double` | IEEE 754 floating point | 0.0 | 64 bits | upto 16 decimal places

### boolean
`Syntax: boolean a = true` 
Example : 
```{java}
class Prog{
    public static void main(String args[])
    {
        boolean a;
        boolean b=true;
        if(a==b)
            System.out.print(a);
    }
}
```
### byte
`Syntax : byte a = 12`
Example : 
```{java}
class Prog{
    public static void main(String args[])
    {
        byte a = 126;
        System.out.println(a);
        a++;
        System.out.println(a);
    }
}
```
### char
`Syntax : char ab = 'b'`
Its values are encoded as Unicode in java. It varies from '\u0000' to '\uffff', '\u0000' being the default value.

### short 
`Syntax : short x = 323`
Size : **2 byte (=16 bits)** (1 byte = 8 bits)
Its values differ from -32,768 to 32,767 , 0 being the default value.

### int
`Syntax : int x = 33`
Size : **4 byte (=32 bits)** 
Default value : 0

### long 
`Syntax : long x = [from -ve 18th figure to +ve 18th figure]`
Size : **8 byte (=64 bits)**
Default value : 0

### float
`Syntax : float a = 2.924567` [upto 7th decimal places]
Size : **4 byte (=32 bits)**
Defalut value : **0.0**

### double
`Syntax : double a = 4.6516515151`
Size : **8 byte (=64 bits)** [upto 17th decimal places]
Defualt value : 0.0

### Example involving all data types
```
class Program{
    public static void main(String args[])
    {
        // assinging values to variables of different type of data types
        boolean a = true;
        byte b = 121;
        char ab = 'f';
        short c = 24;
        int d = 6542;
        long e = 54165214;
        float f = 54.5745;
        double g = 84.545162512;

        //printing valeues.
        System.out.println(a);
        System.out.println(b);
        System.out.println(ab);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
```
**Output** :
```
true
121
f
24
6542
54165214
54.5745
84.545162512
```

## Non- Primitive Data Types
These are also known as **Reference Data Type** , for a reason obviously. They contain a memory address of every variable values becuase reference types doesnt store variable value directly to memory. Examples :- String, Array, Objects, etc.
