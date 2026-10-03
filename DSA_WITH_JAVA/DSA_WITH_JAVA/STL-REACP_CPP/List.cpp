#include <bits/stdc++.h>
#include <list>
using namespace std;

void explainList()
{
    list<int> ls1;
    ls1.push_back(1);    // {1}
    ls1.emplace_back(2); // {1, 2}

    ls1.push_front(0);     // {0, 1, 2}
    ls1.emplace_front(-1); // {-1, 0, 1, 2}

    ls1.pop_back(); // {-1, 0, 1}
    ls1.pop_front(); // {0, 1}
}

void gptlist()
{
    list<int> ls;

    // Inserting elements at the back
    ls.push_back(1);    // List: {1}
    ls.emplace_back(2); // List: {1, 2}

    // Inserting elements at the front
    ls.push_front(0);     // List: {0, 1, 2}
    ls.emplace_front(-1); // List: {-1, 0, 1, 2}

    // Removing elements from the back
    ls.pop_back(); // List: {-1, 0, 1}
    ls.pop_back(); // List: {-1, 0}

    // Removing element from the front
    ls.pop_front(); // List: {0}

    // Re-inserting for more operations
    ls.push_back(10);
    ls.push_back(20);
    ls.push_back(30); // List: {0, 10, 20, 30}

    // Inserting using iterator
    auto it = ls.begin();
    advance(it, 2);    // Move iterator to 2nd position
    ls.insert(it, 15); // List: {0, 10, 15, 20, 30}

    // Erasing using iterator
    it = ls.begin();
    advance(it, 3); // Move to element 20
    ls.erase(it);   // List: {0, 10, 15, 30}

    // Size of the list
    cout << "Size of list: " << ls.size() << endl;

    // Traversing the list
    cout << "List contents: ";
    for (int val : ls)
    {
        cout << val << " ";
    }
    cout << endl;

    // Reverse the list
    ls.reverse(); // List reversed
    cout << "Reversed list: ";
    for (int val : ls)
    {
        cout << val << " ";
    }
    cout << endl;

    // Sort the list
    ls.sort(); // List sorted
    cout << "Sorted list: ";
    for (int val : ls)
    {
        cout << val << " ";
    }
    cout << endl;

    // Clear the list
    ls.clear();
    cout << "List after clear, size = " << ls.size() << endl;
}

int main()
{
    explainList();
    gptlist();
    return 0;
}