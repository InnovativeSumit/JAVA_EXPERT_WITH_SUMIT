# Java Variables, Data Types & Naming Conventions

## 📌 Variables

A **variable** is a named memory location used to store data. The value stored in a variable can change during program execution.

### Syntax

```java
dataType variableName = value;
```

### Example

```java
int age = 20;
String name = "Sumit";
double salary = 55000.50;
boolean isStudent = true;
```

# 📌 Java Data Types
Java data types are divided into **two categories**:

## 1. Primitive Data Types

Primitive data types store simple values.

| Data Type | Size | Default Value | Example |
|-----------|------|---------------|---------|
| byte | 1 byte | 0 | `byte a = 100;` |
| short | 2 bytes | 0 | `short b = 2000;` |
| int | 4 bytes | 0 | `int c = 100000;` |
| long | 8 bytes | 0L | `long d = 123456789L;` |
| float | 4 bytes | 0.0f | `float e = 10.5f;` |
| double | 8 bytes | 0.0d | `double f = 20.75;` |
| char | 2 bytes | '\u0000' | `char g = 'A';` |
| boolean | 1 bit (JVM dependent) | false | `boolean h = true;` |

### Example

```java
byte age = 20;
int marks = 95;
long population = 1400000000L;
float pi = 3.14f;
double salary = 25000.75;
char grade = 'A';
boolean passed = true;
```

## 2. Non-Primitive Data Types

These store references (addresses) to objects.

Examples:

- String
- Array
- Class
- Interface
- Object
- Enum

### Example

```java
String name = "Sumit";

int[] numbers = {10, 20, 30, 40};

Student student = new Student();
```



# 📌 Variable Naming Rules

✅ Variable names can contain:

- Letters (A-Z, a-z)
- Digits (0-9)
- Underscore (_)
- Dollar sign ($)

❌ Variable names cannot:

- Start with a digit
- Contain spaces
- Use Java keywords
- Contain special symbols like `@`, `#`, `%`, `!`

### Valid Examples

```java
int age;
double totalMarks;
String studentName;
int _count;
int $price;
```

### Invalid Examples

```java
int 1age;
int student name;
int class;
int @price;
```



# 📌 Naming Conventions

Java follows standard naming conventions to improve readability.

## 1. **camelCase (Most Used in Java)**

The first word starts with a lowercase letter.
Every new word starts with a capital letter.

### Used For

- Variables
- Methods

### Examples

```java
studentName
totalMarks
calculateSalary()
printDetails()
isLoggedIn
```

## 2. **PascalCase**

Every word starts with a capital letter.

### Used For

- Classes
- Interfaces
- Records

### Examples

```java
Student
BankAccount
EmployeeDetails
BinarySearchTree
```


## 3. **snake_case**

Words are separated using underscores (`_`).

> **Not commonly used in Java** (more common in Python and C).

### Examples

```text
student_name
total_marks
employee_salary
```

## 4. **kebab-case**

Words are separated using hyphens (`-`).

> **Cannot be used as Java variable names** because `-` is treated as the subtraction operator.

### Used In

- URLs
- CSS Classes
- File Names

### Examples

```text
student-name
employee-details
java-notes
```


# 📌 Java Identifier Examples

| Identifier | Valid | Reason |
|------------|-------|--------|
| age | ✅ | Valid |
| studentName | ✅ | camelCase |
| _count | ✅ | Starts with underscore |
| $price | ✅ | Dollar sign allowed |
| 1age | ❌ | Starts with digit |
| student name | ❌ | Contains space |
| class | ❌ | Java keyword |
| student-name | ❌ | Hyphen not allowed |


# 📌 Complete Example

```java
public class Student {

    public static void main(String[] args) {

        int age = 21;
        double cgpa = 8.95;
        char grade = 'A';
        boolean placed = true;
        String name = "Sumit";

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Grade : " + grade);
        System.out.println("Placed : " + placed);
    }
}
```

# 📌 Best Practices

- ✔ Use meaningful variable names.
- ✔ Follow **camelCase** for variables and methods.
- ✔ Use **PascalCase** for class names.
- ✔ Keep variable names short but descriptive.
- ✔ Use constants in **UPPER_SNAKE_CASE**.

Example:

```java
final double PI = 3.14159;
final int MAX_SIZE = 100;
final String COMPANY_NAME = "OpenAI";
```



# 📖 Summary

| Topic | Example |
|--------|---------|
| Variable | `int age = 20;` |
| Primitive Type | `int`, `double`, `char`, `boolean` |
| Non-Primitive Type | `String`, `Array`, `Object` |
| camelCase | `studentName` |
| PascalCase | `StudentDetails` |
| snake_case | `student_name` |
| kebab-case | `student-name` (Not valid in Java variables) |
| Constant | `MAX_SIZE` |

