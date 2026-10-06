//given an array nums of integers, return how many of them contain an even number of digits.
#include <iostream>
using namespace std;
int main()
{
    int num[] = {12, 345, 2, 6, 7896}; 
    int n = sizeof(num) / sizeof(num[0]);
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int digits = 0;
        int x = num[i];

        // Count digits
        while (x > 0) {
            x /= 10;
            digits++;
        }

        // Check if digit count is even
        if (digits % 2 == 0) {
            sum++;
        }
    }
    
    cout << "the total num of didgit is:  " << sum<< endl;

    

    return 0;
}