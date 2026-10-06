// CHECK A GIVEN STRING IS A PALINDROME OR NOT
// TC ==> O(N)
// SC ==> O(N)
#include <bits/stdc++.h>
#include <string.h>
using namespace std;
bool isPalindrome(string str, int left, int right) {
    if (left >= right) return true; // Base case: all characters checked
    if (str[left] != str[right]) return false; // Mismatch found
    return isPalindrome(str, left + 1, right - 1); // Recur for inner substring
}

int main() {
    string str = "radar";
    if (isPalindrome(str, 0, str.length() - 1))
        cout << str << " is a palindrome." << endl;
    else
        cout << str << " is not a palindrome." << endl;
    return 0;
}
