// PRINT THE NAME USING RECURSION
//Time Complexity is a way to describe how the runtime of an algorithm increases with the size of the input.
// TC==> O(N)
// SC==> O(N)
#include <bits/stdc++.h>
using namespace std;

void sumit(int i, int n) {
    if (i > n) return; // base condition
    cout << "sumit" << endl;
    sumit(i + 1, n); // recursive call with increment
}

int main() {
    int n;
    cout << "Enter the number: ";
    cin >> n;

    sumit(1, n); // initial call

    return 0;
}
