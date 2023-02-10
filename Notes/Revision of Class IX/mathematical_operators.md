# Mathematical Operators
There are a wide of mathematical operators provided by Java. 
Name | Argument | Return Type
--- | --- | ---
pow() | double,double | double
sqrt() | double | double
ceil() | double/float | double
floor() | double/float | double
round() | double/float | int or long
abs() | double/float | double
max() | double,double | double
min() | double,double | double
random() | - | double
cbrt() | double | double

### pow()
`Syntax : Math.pow([double],[double])`
Returns power value of double type where the function first parameter is base, second parameter is index.

### sqrt()
`Syntax : Math.sqrt([double])`
Returns square root of double type value of a given number passed as the argument.

### ceil()
`Syntax : Math.ceil([double])`
Returns the double value greater then the argument value (counts up).

### floor()
`Syntax : Math.floor([double])`
Returns the double value less than the argument value (counts down).

### round()
`Syntax : Math.round([double]) or double([float])`
Rounds to the nearest integer.

### abs()
`Syntax : Math.abs([double]) or abs([float])`
Returns absolute value of variable passed as argument.

### max()
`Syntax : Math.max([double],[double])`
Returns maximum value of the two numeric values passed as arguments.

### min()
`Syntax : Math.min([double],[double])`
Returns minimum value of the two numeric values passed as arguments.

### random()
`Syntax : Math.random()`
Returns random poitive real value between 0 and 1.

### cbrt()
`Syntax : Math.cbrt([double])`
Returns the cube root of value passed as argument.

## Example : 
```
class Program{
    public static void main(String args[])
    {
        double a = Math.pow(2,2); //2^2 = 4
        double b = Math.sqrt(9);
        double c = Math.ceil(4.2);
        double d = Math.floor(5.6);
        double e = Math.round(22.8);
        double f = Math.abs(-4);
        double g = Math.max(4.99,5);
        double h = Math.min(5.4,5.3);
        double i = Math.random();
        double j = Math.cbrt(27);
    }
}
```
