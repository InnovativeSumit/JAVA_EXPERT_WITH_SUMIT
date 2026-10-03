#include <iostream>
#include <string>
using namespace std;
int main()
{
    int dayNum;
    cout << "Enter a day number (1-7): ";
    cin >> dayNum;

    switch (dayNum)
    {
    case 1:
        cout << "Monday" << endl;
        break;
    case 2:
        cout << "Tuesday" << endl;
        break;
    case 3:
        cout << "Wednesday" << endl;
        break;
    case 4:
        cout << "Thursday" << endl;
        break;
    case 5:
        cout << "Friday" << endl;
        break;
    case 6:
        cout << "Saturday" << endl;
        break;
    case 7:
        cout << "Sunday" << endl;
        break;
    default:
        cout << "Invalid day number" << endl;
    }

    return 0;
}