// #include <bits/stdc++.h>
// using namespace std;
// int main()
// {
//     int age;
//     cout << " Enter your age: ";
//     cin >> age;
//     if (age <= 18)
//     {
//         cout << "You are not an adult";
//     }
//     else
//     {
//         cout << "You are  an adult";
//     }

//     return 0;
// }





// // Ask user to enter marks and print the corresponding grade.
// int main()
// {
//     int marks;
//     cin >> marks;
//     if (marks <= 25)
//     {
//         cout << "F";
//     }
//     else if (marks <= 44)
//     {
//         cout << "E";
//     }
//     else if (marks <= 49)
//     {
//         cout << "D";
//     }
//     else if (marks <= 59)
//     {
//         cout << "C";
//     }
//     else if (marks <= 79)
//     {
//         cout << "B";
//     }
//     else if (marks <= 100)
//     {
//         cout << "A";
//     }
//     return 0;
// }




//Nested if-else dtatement
#include <iostream>
using namespace std;

int main() {
    int age;
    cin >> age;

    if (age < 18) {
        cout << "not eligible for job";
    }
    // >= 18
    else if (age <= 57) {
        cout << "eligible for job";
        if (age >= 55) {
            cout << ", but retirement soon";
        }
    } else {
        cout << "retirement time";
    }

    return 0;
} 