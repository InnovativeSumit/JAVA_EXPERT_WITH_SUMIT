// Recursive function to reverse the array
// TC ==> O(N)
// SC ==> O(N)
#include <bits/stdc++.h>
using namespace std;
void reverseArray(int arr[], int i, int n) {
    if (i >= n / 2)
    return;
    swap(arr[i], arr[n - i - 1]); // Swap elements at index i and n - i - 1
    reverseArray(arr, i + 1, n); // Recurse with next index
}
int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    reverseArray(arr, 0, n); // Call function with i = 0 and n
    // Print reversed array
    cout << "Reversed array: ";
    for (int i = 0; i < n; i++)
    cout << arr[i] << " ";
    cout << endl;
    return 0;
}
