// PRINT THE NUMBER FROM 1 TO  N  USING recursion
// TC==> O(N)
// SC==> O(N)
#include <bits/stdc++.h>
using namespace std;

void sumit(int i, int n) {
    if (i >= n) return; // base condition
    cout << i << endl;
    sumit(i + 1, n); // recursive call with increment
}

int main() {
    int n;
    cout << "Enter the number: ";
    cin >> n;

    // sumit(-8, n); // initial call
    sumit(0, n); // initial call
    // sumit(1, n); // initial call
    // sumit(8, n); // initial call
    


    return 0;
}
