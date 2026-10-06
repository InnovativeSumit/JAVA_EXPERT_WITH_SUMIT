// PRINT THE NUMBER FROM 1 TO  N USING BACKTRACKING
// TC==> O(N)
// SC==> O(N)
#include <bits/stdc++.h>
using namespace std;

void sumit(int i, int n)
{
    if (i < 1)
    return; // base condition
    sumit(i - 1, n); // recursive call with decrement
    cout<<i<<endl; //using backtracking 
}

int main()
{
    int n;
    cout << "Enter the number: ";
    cin >> n;

    sumit(n, n); // initial call

    return 0;
}