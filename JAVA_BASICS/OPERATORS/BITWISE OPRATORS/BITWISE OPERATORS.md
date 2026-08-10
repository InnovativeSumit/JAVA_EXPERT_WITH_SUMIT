# Java Bitwise Operators (Quick Review)

This document provides a brief overview of Java's bitwise operators with examples, ideal for a quick review before an examination.

## 1. Introduction

**Bitwise operators** in Java operate directly on the individual bits of integer types (`long`, `int`, `short`, `char`, `byte`). They are useful for low-level programming, flag manipulation, and optimizing certain calculations [1].

## 2. Bitwise Logical Operators

These operators perform logical operations on corresponding bits of two operands (except `~`, which is unary).

### 2.1. Bitwise AND (`&`)

Sets a bit to `1` if **both** corresponding bits are `1`. Otherwise, it's `0`.

```java
int a = 6;  // 0110 in binary
int b = 5;  // 0101 in binary
int result = a & b; // 0100 (4 in decimal)
System.out.println(result); // Output: 4
```

### 2.2. Bitwise OR (`|`)

Sets a bit to `1` if **at least one** of the corresponding bits is `1`. Otherwise, it's `0`.

```java
int a = 6;  // 0110
int b = 5;  // 0101
int result = a | b; // 0111 (7 in decimal)
System.out.println(result); // Output: 7
```

### 2.3. Bitwise XOR (`^`)

Sets a bit to `1` if the corresponding bits are **different**. Otherwise, it's `0`.

```java
int a = 6;  // 0110
int b = 5;  // 0101
int result = a ^ b; // 0011 (3 in decimal)
System.out.println(result); // Output: 3
```

### 2.4. Bitwise Complement (`~`)

Inverts all the bits of its single operand (`0` becomes `1`, `1` becomes `0`). For positive numbers, this often results in a negative number due to two's complement representation [1].

```java
int a = 6;  // 0000 0110 (assuming 8-bit for simplicity, actual is 32-bit)
int result = ~a; // 1111 1001 (which is -7 in two's complement)
System.out.println(result); // Output: -7
```

## 3. Bitwise Shift Operators

These operators shift the bits of a number to the left or right.

### 3.1. Left Shift (`<<`)

Shifts bits to the left. Vacated rightmost bits are filled with `0`s. Equivalent to multiplying by `2^n` (where `n` is the shift amount) for positive numbers [2].

```java
int a = 6;  // 0000 0110
int result = a << 2; // 0001 1000 (24 in decimal)
System.out.println(result); // Output: 24
```

### 3.2. Signed Right Shift (`>>`)

Shifts bits to the right. Vacated leftmost bits are filled with the sign bit (maintaining the number's sign). Equivalent to dividing by `2^n` for positive numbers [2].

```java
int a = 24; // 0001 1000
int result = a >> 2; // 0000 0110 (6 in decimal)
System.out.println(result); // Output: 6

int b = -24; // 1110 1000 (two's complement)
int resultNegative = b >> 2; // 1111 1010 (-6 in two's complement)
System.out.println(resultNegative); // Output: -6
```

### 3.3. Unsigned Right Shift (`>>>`)

Shifts bits to the right. Vacated leftmost bits are always filled with `0`s, regardless of the sign bit. This operator is only available for `int` and `long` [2].

```java
int a = -24; // 1110 1000 (two's complement)
int result = a >>> 2; // 0011 1010 (12288 in decimal for 32-bit int)
System.out.println(result); // Output: 1073741818 (for 32-bit int)
```

## 4. Key Takeaways for Exam

*   **`&` (AND)**: Both bits must be 1.
*   **`|` (OR)**: At least one bit must be 1.
*   **`^` (XOR)**: Bits must be different.
*   **`~` (Complement)**: Inverts all bits (watch out for negative numbers).
*   **`<<` (Left Shift)**: Multiplies by powers of 2, fills with 0s.
*   **`>>` (Signed Right Shift)**: Divides by powers of 2, preserves sign (fills with sign bit).
*   **`>>>` (Unsigned Right Shift)**: Divides by powers of 2, fills with 0s (always positive result for positive numbers, can change sign for negative numbers).

<!-- ## References

[1] Baeldung. "Java Bitwise Operators." Available at: [https://www.baeldung.com/java-bitwise-operators](https://www.baeldung.com/java-bitwise-operators)
[2] Programiz. "Java Bitwise and Shift Operators (With Examples)." Available at: [https://www.programiz.com/java-programming/bitwise-operators](https://www.programiz.com/java-programming/bitwise-operators) -->
