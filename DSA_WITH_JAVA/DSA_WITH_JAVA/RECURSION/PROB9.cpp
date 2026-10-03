// Recursive function to reverse the array
// TC==> O(N)
// SC==> O(N)
#include <bits/stdc++.h>
using namespace std;
void reverseArray(int arr[], int l, int r) {
    if (l >= r)
    return;
    swap(arr[l], arr[r]);          // Swap elements at index l and r
    reverseArray(arr, l + 1, r - 1); // Recurse with narrowed range
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    reverseArray(arr, 0, n - 1); 
    // Print reversed array
    cout << "Reversed array: ";
    for (int i = 0; i < n; i++)
    cout << arr[i] << " ";
    cout << endl;
    return 0;
}
