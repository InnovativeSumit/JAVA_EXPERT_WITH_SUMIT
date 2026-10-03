// PRINT THE NUMBER FROM N TO  1 USING recursion
// TC==> O(N)
// SC==> O(N)
#include <bits/stdc++.h>
using namespace std;

void sumit(int i, int n) {
    if (i < 1) 
    return; // base condition
    cout << i << endl;
    sumit(i - 1, n); // recursive call with increment
}

int main() {
    int n;
    cout << "Enter the number: ";
    cin >> n;

    sumit(n, 1); // initial call

    return 0;
}
