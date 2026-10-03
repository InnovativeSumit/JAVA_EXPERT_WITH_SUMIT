// MULTIPLE RECURSION CALL
//  PRINT THE FIRST N FIBONCCI SERIES NUMBERS
// TC ==> O(2^N)
// SC ==> O(N)
#include <bits/stdc++.h>
using namespace std;
int fibo(int n) {
    if (n <= 1) return n;
    return fibo(n - 1) + fibo(n - 2);
}
int main() {
    int n = 5;
    int sum = 0;
    cout << "The first " << n << " Fibonacci numbers are: ";
    fibo(n);
    for (int i = 0; i < n; i++) {
        cout << fibo(i) << " ";
        sum += fibo(i); 
    }
    cout << endl;
    cout << " The sum of the series is: " << sum << endl;
    return 0;
}
