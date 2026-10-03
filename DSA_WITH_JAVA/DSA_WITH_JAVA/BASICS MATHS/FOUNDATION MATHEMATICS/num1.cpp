//Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
#include <iostream>
using namespace std;
int main()
{

    int n;
    cout<<"enter a num ";
    cin>>n;
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        int num1 = i;
        while (num1 > 0)
        {
            int last = num1 % 10;
            if (last == 1)
            {
                count++;
            }
        }
        num1=num1/10;
    }
    cout<<" figuts"<< count;
    return 0;
}

/*
int countDigitOne(int n) {
         long long count = 0;
        long long divisor = 1;
        while (divisor <= n) {
            long long higher = n / (divisor * 10);
            long long current = (n / divisor) % 10;
            long long lower = n % divisor;

            if (current > 1) {
                count += (higher + 1) * divisor;
            } else if (current == 1) {
                count += higher * divisor + lower + 1;
            } else {
                count += higher * divisor;
            }

            divisor *= 10;
        }
        return count;
    }*/