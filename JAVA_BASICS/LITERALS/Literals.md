# Java Literals

## What is a Literal?

A **literal** is a fixed value written directly in the source code. Java automatically determines the type of a literal based on its format.

**Example:**

```java
int age = 20;        // 20 is an integer literal
char grade = 'A';    // 'A' is a character literal
String name = "Sumit"; // "Sumit" is a string literal
```



# Types of Literals in Java

There are **6 main types of literals** in Java:

1. Integer Literals
2. Floating-Point Literals
3. Character Literals
4. String Literals
5. Boolean Literals
6. Null Literal


# 1. **Integer Literals**
Integer literals represent whole numbers (without a decimal point).

### Decimal (Base 10)

```java
int num = 100;
System.out.println(num);
```

**Output**

```
100
```

### Binary (Base 2)

Starts with `0b` or `0B`.

```java
int num = 0b1010;
System.out.println(num);
```

**Output**

```
10
```

### Octal (Base 8)

Starts with `0`.

```java
int num = 012;
System.out.println(num);
```

**Output**

```
10
```

### Hexadecimal (Base 16)

Starts with `0x` or `0X`.

```java
int num = 0xA;
System.out.println(num);
```

**Output**

```
10
```

### Long Literal

Append `L` or `l`.

```java
long population = 8000000000L;
System.out.println(population);
```


# 2. **Floating-Point Literals**

Floating-point literals represent decimal numbers.

### Double Literal (Default)

```java
double pi = 3.14159;
System.out.println(pi);
```

### Float Literal

Append `F` or `f`.

```java
float price = 99.99F;
System.out.println(price);
```

### Scientific Notation

```java
double value = 2.5e3;
System.out.println(value);
```

**Output**

```
2500.0
```


# 3. **Character Literals**

Character literals represent a single character enclosed in single quotes (`' '`).

```java
char letter = 'A';
System.out.println(letter);
```

## Escape Characters

| Escape Sequence | Meaning |
|-----------------|---------|
| `\n` | New Line |
| `\t` | Tab |
| `\\` | Backslash |
| `\'` | Single Quote |
| `\"` | Double Quote |

Example:

```java
System.out.println("Hello\nWorld");
```

Output:

```
Hello
World
```


# 4. **String Literals**

A string literal is a sequence of characters enclosed in double quotes.

```java
String name = "Sumit";
System.out.println(name);
```

Output

```
Sumit
```



# 5. **Boolean Literals**

Boolean literals have only two values:

- `true`
- `false`

Example:

```java
boolean isJavaEasy = true;
System.out.println(isJavaEasy);
```

Output

```
true
```

---

# 6. **Null Literal**

The `null` literal indicates that a reference variable does not refer to any object.

```java
String name = null;
System.out.println(name);
```

Output

```
null
```


# Complete Example

```java
public class LiteralsExample {
    public static void main(String[] args) {

        // Integer Literals
        int decimal = 100;
        int binary = 0b1010;
        int octal = 012;
        int hexadecimal = 0xA;
        long bigNumber = 123456789L;

        // Floating Point Literals
        float f = 12.5F;
        double d = 45.678;

        // Character Literal
        char grade = 'A';

        // String Literal
        String name = "Sumit";

        // Boolean Literal
        boolean status = true;

        // Null Literal
        String value = null;

        System.out.println(decimal);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexadecimal);
        System.out.println(bigNumber);

        System.out.println(f);
        System.out.println(d);

        System.out.println(grade);
        System.out.println(name);
        System.out.println(status);
        System.out.println(value);
    }
}
```


# Summary

| Literal Type | Example |
|--------------|---------|
| Integer | `10`, `0b1010`, `012`, `0xA` |
| Long | `1000L` |
| Float | `12.5F` |
| Double | `12.5` |
| Character | `'A'` |
| String | `"Hello"` |
| Boolean | `true`, `false` |
| Null | `null` |


# Important Interview Questions

### Q1. What is a literal in Java?
A literal is a constant value written directly in the source code.

### Q2. How many types of literals are there in Java?
There are **6 main types**:
- Integer
- Floating-Point
- Character
- String
- Boolean
- Null

### Q3. Which floating-point type is the default in Java?
**double**

### Q4. Which suffix is used for a float literal?
`F` or `f`

### Q5. Which suffix is used for a long literal?
`L` or `l`

### Q6. What is the difference between `'A'` and `"A"`?
- `'A'` → `char`
- `"A"` → `String`

### Q7. What does the `null` literal represent?
It represents a reference that does not point to any object.