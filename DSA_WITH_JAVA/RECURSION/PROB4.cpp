// PRINT THE NUMBER FROM N TO  1 USING BACKTRACKING
// TC==> O(N)
// SC==> O(N)
#include <bits/stdc++.h>
using namespace std;

void sumit(int i, int n)
{
    if (i > n)
    return; // base condition
    sumit(i + 1, n);   // recursive call with increment
    cout << i << endl; // print after the recursive call
}

int main()
{
    int n;
    cout << "Enter the number: ";
    cin >> n;

    sumit(1, n); // initial call

    return 0;
}
