// PRINT THE SUM OF N NUMBERS 
// TC==> O(N)
// SC==> O(N)
#include <bits/stdc++.h>
using namespace std;

void sumit(int i, int sum)
{
    if (i < 1){
    cout << "Sum: " << sum << endl; 
    return;
    } 
    sumit(i - 1, sum+i); // recursive call with decrement
    
}

int main()
{
    int n;
    cout << "Enter the number: ";
    cin >> n;

    sumit(n, 0); 

    return 0;
}