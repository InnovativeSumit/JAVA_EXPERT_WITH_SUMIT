# Java Operator Precedence and Associativity

## Introduction

In Java, understanding the order in which operations are performed within an expression is crucial for writing correct and predictable code. This order is determined by two fundamental concepts: **operator precedence** and **operator associativity** [1]. These rules dictate how expressions are evaluated, especially when multiple operators are present.

*   **Operator Precedence** defines the priority of operators. Operators with higher precedence are evaluated before operators with lower precedence.
*   **Operator Associativity** determines the evaluation order when multiple operators of the same precedence appear in an expression.

## Operator Precedence

Operator precedence specifies which operator is applied first in an expression containing different operators. For instance, in the expression `1 + 2 * 3`, multiplication (`*`) has a higher precedence than addition (`+`). Therefore, `2 * 3` is evaluated first, resulting in `6`, and then `1 + 6` is computed, yielding `7`. Parentheses `()` can always be used to override the default precedence rules, ensuring that operations within them are evaluated first [2].

### Example of Precedence:

```java
public class PrecedenceExample {
    public static void main(String[] args) {
        int result = 10 + 20 * 30; // Multiplication has higher precedence
        System.out.println("Result: " + result); // Output: Result: 610

        int resultWithParentheses = (10 + 20) * 30; // Parentheses override precedence
        System.out.println("Result with parentheses: " + resultWithParentheses); // Output: Result with parentheses: 900
    }
}
```

## Operator Associativity

When an expression contains two or more operators with the same precedence, **operator associativity** comes into play. It defines the direction (left-to-right or right-to-left) in which these operators are evaluated [1].

### Left-to-Right Associativity

Most Java operators are left-to-right associative. This means that when operators of the same precedence appear, they are evaluated from the left side of the expression to the right. For example, in `a - b + c`, subtraction and addition have the same precedence and are left-associative. Thus, `a - b` is evaluated first, and then the result is added to `c` [1].

### Example of Left-to-Right Associativity:

```java
public class LeftToRightAssociativityExample {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        int result = a - b + c; // Evaluated as (10 - 5) + 2
        System.out.println("Result: " + result); // Output: Result: 7

        int divisionModulus = 100 / 10 % 3; // Evaluated as (100 / 10) % 3
        System.out.println("Division and Modulus: " + divisionModulus); // Output: Division and Modulus: 1
    }
}
```

### Right-to-Left Associativity

Some operators, notably assignment operators and unary operators, are right-to-left associative. This means they are evaluated from the right side of the expression to the left. A classic example is multiple assignments: `x = y = z = 17` is evaluated as `x = (y = (z = 17))`, assigning `17` to `z`, then `y`, and finally `x` [2].

### Example of Right-to-Left Associativity:

```java
public class RightToLeftAssociativityExample {
    public static void main(String[] args) {
        int a, b;
        a = b = 4; // Evaluated as a = (b = 4)
        System.out.println("a: " + a); // Output: a: 4
        System.out.println("b: " + b); // Output: b: 4

        int x = 5;
        int y = 10;
        int z = ++x * y--; // Unary operators ++ and -- are right-to-left, but here precedence matters more.
                           // ++x (pre-increment) happens before multiplication, y-- (post-decrement) happens after.
                           // This is a complex case where both precedence and evaluation order are important.
                           // ++x makes x=6. Then 6 * 10 (y's original value) = 60. Then y becomes 9.
        System.out.println("z: " + z); // Output: z: 60
        System.out.println("x: " + x); // Output: x: 6
        System.out.println("y: " + y); // Output: y: 9
    }
}
```

## Java Operator Precedence Table

The following table summarizes Java operators by precedence level (highest to lowest) and their associativity. Operators on the same level have equal precedence [2].

| Level | Operator | Description | Associativity |
| :---- | :------- | :---------- | :------------ |
| **16** | `()` `[]` `.` `::` | Parentheses, Array subscript, Member selection, Method reference | Left-to-Right |
| **15** | `++` `--` (postfix) | Unary Post-increment, Unary Post-decrement | Left-to-Right |
| **14** | `++` `--` (prefix) `+` `-` `!` `~` | Unary Pre-increment, Unary Pre-decrement, Unary plus, Unary minus, Logical NOT, Bitwise NOT | Right-to-Left |
| **13** | `(type)` | Cast | Right-to-Left |
| **12** | `*` `/` `%` | Multiplicative | Left-to-Right |
| **11** | `+` `-` | Additive (also String Concatenation for `+`) | Left-to-Right |
| **10** | `<<` `>>` `>>>` | Shift | Left-to-Right |
| **9** | `<` `<=` `>` `>=` `instanceof` | Relational | Left-to-Right |
| **8** | `==` `!=` | Equality | Left-to-Right |
| **7** | `&` | Bitwise AND | Left-to-Right |
| **6** | `^` | Bitwise XOR | Left-to-Right |
| **5** | `|` | Bitwise OR | Left-to-Right |
| **4** | `&&` | Logical AND | Left-to-Right |
| **3** | `||` | Logical OR | Left-to-Right |
| **2** | `? :` | Ternary (Conditional) | Right-to-Left |
| **1** | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `|=` `<<=` `>>=` `>>>=` | Assignment | Right-to-Left |
| **0** | `->` | Lambda expression | Right-to-Left |

## Order of Operand Evaluation

It is important to distinguish between operator precedence/associativity and the **order of operand evaluation**. While precedence and associativity determine how operators and operands are grouped, Java always evaluates the operands of an operator from left-to-right. This also applies to argument lists in method calls [2].

For example, in `A() + B() * C(D(), E())`, the subexpressions are evaluated in the order `A()`, `B()`, `D()`, `E()`, and then `C()`. Even though `C()` appears to the left of `D()` and `E()`, `D()` and `E()` must be evaluated first to provide arguments for `C()` [2].

### Short-Circuit Evaluation

Java's logical AND (`&&`) and logical OR (`||`) operators exhibit **short-circuit evaluation**. This means the second operand is evaluated only if it is necessary to determine the result of the expression. For instance, in `if ((s != null) && (s.length() < 10))`, `s.length()` is only called if `s` is not `null`, preventing a `NullPointerException` [2].

## Conclusion

Mastering operator precedence and associativity is fundamental for writing robust and error-free Java code. While the rules can seem extensive, using parentheses judiciously can enhance code readability and prevent unexpected behavior, even for experienced programmers. Always refer to the official Java Language Specification or reliable documentation when in doubt.

<!-- ## References

[1] GeeksforGeeks. "Operator Precedence and Associativity in Java." Available at: [https://www.geeksforgeeks.org/java/operator-precedence-and-associativity-in-java/](https://www.geeksforgeeks.org/java/operator-precedence-and-associativity-in-java/)
[2] Princeton University. "Appendix A: Operator Precedence in Java." Available at: [https://introcs.cs.princeton.edu/11precedence/](https://introcs.cs.princeton.edu/11precedence/) -->
