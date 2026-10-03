#include <iostream>
#include <queue>
// FIFO structure
// TO ==> O(1) for push, pop, front, back
using namespace std;

void explainQueue()
{
    queue<int> q;

    // Inserting elements (at the back)
    q.push(1);    // Queue: {1}
    q.push(2);    // Queue: {1, 2}
    q.emplace(3); // Queue: {1, 2, 3}

    // Accessing elements
    cout << "Front element: " << q.front() << endl; // 1
    cout << "Back element: " << q.back() << endl;   // 3

    // Removing element from front
    q.pop(); // Queue becomes: {2, 3}

    // Size of the queue
    cout << "Size of queue: " << q.size() << endl;

    // Checking if queue is empty
    cout << "Is queue empty? " << (q.empty() ? "Yes" : "No") << endl;

    // Traversing the queue (only way is to pop elements)
    cout << "Queue contents (FIFO order): ";
    while (!q.empty())
    {
        cout << q.front() << " ";
        q.pop();
    }
    cout << endl;
}
int main()
{
    explainQueue();
    return 0;
}