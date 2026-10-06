#include <iostream>
using namespace std;

int main()
{
    int num, last;
    cout << "Enter a number: ";
    cin >> num;
    int count = 0;
    int temp = num;
    cout << "Digits of the number are: ";
    while (temp > 0)
    {
        last = temp % 10;
        cout << last << " "; // Print each digit (from right to left)
        if (last == 1)
        {
            count++;
        }
        temp = temp / 10;
    }
    cout << endl;
    cout << "Total count of digit '1' is: " << count << endl;
    return 0;
}
