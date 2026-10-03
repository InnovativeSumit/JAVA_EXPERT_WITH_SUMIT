#include <iostream>
#include <deque>
using namespace std;

void explainDeque()
{
    deque<int> dq;

    // Inserting at the back
    dq.push_back(10);    // {10}
    dq.emplace_back(20); // {10, 20}

    // Inserting at the front
    dq.push_front(5);    // {5, 10, 20}
    dq.emplace_front(0); // {0, 5, 10, 20}

    // Accessing elements
    cout << "Front: " << dq.front() << endl; // 0
    cout << "Back: " << dq.back() << endl;   // 20

    // Removing elements
    dq.pop_back();  // {0, 5, 10}
    dq.pop_front(); // {5, 10}

    // Insert at specific position
    auto it = dq.begin();
    dq.insert(it + 1, 7); // {5, 7, 10}

    // Erase at specific position
    dq.erase(dq.begin()); // {7, 10}

    // Size of deque
    cout << "Size: " << dq.size() << endl;

    // Traversing the deque
    cout << "Deque elements: ";
    for (int val : dq)
    {
        cout << val << " ";
    }
    cout << endl;

    // Access using index
    cout << "Element at index 1: " << dq[1] << endl;

    // Clear all elements
    dq.clear();
    cout << "Deque cleared. Empty? " << (dq.empty() ? "Yes" : "No") << endl;
}
int main()
{
    explainDeque();
    return 0;
}