// PRINT THE FACTORIAL OF A NUMBER USING RECURSION 
// TC==> O(N)
// SC==> O(N)
#include <bits/stdc++.h>
using namespace std;

int fact(int n)
{
    if (n==0 || n==1) return 1;
    return n*fact(n-1); // recursive call with decrement
    
}

int main()
{
    int n;
    cout << "Enter the number: ";
    cin >> n;
    int fact1 = fact(n);
    cout << "FACTORIAL IS : " << fact1 << endl; 

    return 0;
}