// Recursive function to check if a string is a palindrome
// TC ==> O(N)
// SC ==> O(N)
#include <bits/stdc++.h>
using namespace std;
bool isPalindrome(string str, int i, int n) {
    if (i >= n / 2)
    return true;
    if (str[i] != str[n - i - 1])
    return false;
    return isPalindrome(str, i + 1, n); // Recurse to check next characters
}

int main() {
    string str = "madam";
    int n = str.length(); // string length is 5
    if (isPalindrome(str, 0, n))
        cout << "The string is a palindrome." << endl;
    else
        cout << "The string is not a palindrome." << endl;

    return 0;
}
