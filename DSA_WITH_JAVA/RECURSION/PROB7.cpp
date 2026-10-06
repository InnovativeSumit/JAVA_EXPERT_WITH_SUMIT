// PRINT THE SUM OF N NUMBERS USING RECURSION
// TC==> O(N)
// SC==> O(N) 
#include <bits/stdc++.h>
using namespace std;

int sum(int n)
{
    if (n==0) return 0;
    return n+ sum(n-1); // recursive call with decrement
    
}

int main()
{
    int n;
    cout << "Enter the number: ";
    cin >> n;
    int sum1 =sum(n);
    cout << "Sum: " << sum1 << endl; // initial call

    return 0;
}