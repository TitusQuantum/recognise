# Operators
These are the special symbols that perform specific operations on operands (may be a constant or a variable). 

Expression is a combination of operators and operands that perform a specific operation.

## Forms of Operators
There are three forms of operators : Unary , Binary , Ternanry

### Unary
requires only one operand. Ex: increasing/decreasing, negating an expression or inverting a boolean value.
Symbol | Name | Operation
--- | --- | ---
`+` | Unary plus operator | indicates +ve value
`-` | Unary minus operator | negates an expression
`++` | Increment operator | incements a value by 1
`--` | Decrement operator | decrements a value by 1
`!` | Logical complememt operator | inverts a boolean value

### Binary Operators
requires two operands. The java lang provied operators that perform addition, substraction, multiplication, division and modulus on a integer and floating point numbers. 
Symbol | Name | Example
--- | --- | ---
`+` | Addition | `n=n+1`
`-` | Substractoin | `n=n-1`
`*` | Multiplication | `n=n*1`
`/` | Division | `n=n/1`
`%` | Remainder | `n=n%1`

### Ternary Operators
requires three operands.Its an conditional operator that provides a shorter syntax for thr _if else_ statement. "? : " , these symbols are used in ternary operators to declare a value to a variable. The first one `?` is a boolean expression; if the expression is true then the value of second operand is returned otherwise the value of third operand is returned.
`k = i < 0? -i : i //modulus function`
The above expression means that if i is <0 then -i will be stored in k otherwise i will be stored.

## Types od Operators
1. Arithmetic Operators : Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra. (Ex: `+`,`-`,`*`,`/`)
2. Relational Operators : These are used to compare two or more operands. Java provides six relational operators : greater than (>), less than (<), greater than or equal to (>=), less than or equal to (<=), equal (==), not equal (!=).
3. Logical Operators : These are used to perform "logical AND" and "logical OR" operation.
4. Increment and Decrement Operators : These are Pre Decrement/Pre Increment and Post Decrement/Post Increment operators.
5. Shorthand Operators : Its an easy way to write `x=x+20` as `x+=20`.