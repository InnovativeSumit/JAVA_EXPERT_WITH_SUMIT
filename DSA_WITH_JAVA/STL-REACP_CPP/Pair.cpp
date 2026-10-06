#include <bits/stdc++.h>
#include <utility>   // for std::pair
#include <algorithm> // for swap
using namespace std;

void explainapair()
{
    pair<int, int> p = {1, 2};
    cout << p.first << " " << p.second << endl;

    pair<int, pair<int, int>> p1 = {1, {2, 3}};
    cout << p1.first << " " << p1.second.first << " " << p1.second.second << endl;

    pair<int, int> arr[] = {{1, 2}, {3, 4}, {5, 6}};
    cout << arr[0].first << " " << arr[0].second << endl;
    cout << arr[1].second << endl;
}

void gptpair()
{
    // Basic pair declaration and initialization
    pair<int, int> p = {1, 2};
    cout << "Basic pair: " << p.first << " " << p.second << endl;

    // Nested pair
    pair<int, pair<int, int>> p1 = {1, {2, 3}};
    cout << "Nested pair: " << p1.first << " " << p1.second.first << " " << p1.second.second << endl;

    // Array of pairs
    pair<int, int> arr[] = {{1, 2}, {3, 4}, {5, 6}};
    cout << "Array of pairs - arr[0]: " << arr[0].first << " " << arr[0].second << endl;
    cout << "Array of pairs - arr[1].second: " << arr[1].second << endl;

    // Make pair using make_pair
    pair<string, int> p2 = make_pair("Apple", 10);
    cout << "make_pair: " << p2.first << " " << p2.second << endl;

    // Comparing pairs (lexicographical comparison)
    pair<int, int> p3 = {1, 2};
    pair<int, int> p4 = {1, 3};
    if (p3 < p4)
    {
        cout << "p3 is less than p4" << endl;
    }

    // Assigning one pair to another
    pair<int, int> p5;
    p5 = p4;
    cout << "Assigned pair p5: " << p5.first << " " << p5.second << endl;

    // Swapping two pairs
    pair<int, int> p6 = {7, 8};
    cout << "Before swap: p5 = (" << p5.first << "," << p5.second << "), p6 = (" << p6.first << "," << p6.second << ")" << endl;
    swap(p5, p6);
    cout << "After swap:  p5 = (" << p5.first << "," << p5.second << "), p6 = (" << p6.first << "," << p6.second << ")" << endl;

    // Modifying pair values
    p6.first = 100;
    p6.second = 200;
    cout << "Modified p6: " << p6.first << " " << p6.second << endl;
}

int main()
{
    explainapair();
    gptpair();
}