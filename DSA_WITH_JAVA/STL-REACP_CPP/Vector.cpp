#include <bits/stdc++.h>
#include <vector>
using namespace std;

void explainVector()
{
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);

    vector<pair<int, int>> v1;
    v1.push_back({1, 2});
    v1.emplace_back(3, 4);

    vector<pair<char, int>> c1;
    c1.push_back({'a', 2});
    c1.emplace_back('b', 4);

    vector<int> v2(5, 100);    // 5 elements, each initialized to 100
    cout << v2.size() << endl; // 5

    vector<int> v3(5); // 5 elements, each initialized to 0

    vector<int> v4(5, 200); // 5 elements, each initialized to 200

    vector<int> v5(v2); // copy constructor, v5 will have the same elements as v2

    vector<int>::iterator it = v2.begin();
    it++;
    cout << *it << " ";

    it = it + 2;
    cout << *it << " ";

    vector<int>::iterator it = v.end();
    vector<int>::reverse_iterator it = v.rend();
    vector<int>::reverse_iterator it = v.rbegin();

    cout << v[0] << " " << v.at(0) << " " << v.front() << " " << v.back() << endl;

    /*
    v.begin()==> Returns an **iterator** ==> Points to the **first element** of the vector
    v.front()==>  Returns a **reference** ==> Directly gives the **first element's value**
    v.rbegin()==> Returns a **reverse iterator** ==> Points to the **last element** of the vector


    v.end()==> Returns an **iterator** ==> Points to the **position after the last element** of the vector
    v.back()==> Returns a **reference** ==> Directly gives the **last element's value**
    v.rend()==> Returns a **reverse iterator** ==> Points to the **position before the first element** of the vector

    v[0]==> Returns a **reference** ==> Directly gives the **first element's value**
    v.at(0)==> Returns a **reference** ==> Directly gives the **first element's value**

    */

    for (vector<int>::iterator it = v.begin(); it != v.end(); ++it)
    {
        cout << *it << " ";
    }

    for (auto it = v.begin(); it != v.end(); ++it)
    {
        cout << *it << " ";
    }

    for (auto it : v)
    {
        cout << it << " ";
    }
    vector<int> v10 = {10, 23, 45, 67, 78};
    v.insert(v.begin() + 1, 100); // Insert 100 at index 1
    // 10 100 23 45 67 78
    v.insert(v.begin() + 2, 2, 200); // Insert 200 two times at index 2
    // 10 100 200 200 23 45 67 78
    vector<int> v11(2, 100); // Create a vector with two 100s// {100 100}

    vector<int> copy(2, 50);                       // Create a vector with two 50
    v.insert(v.begin(), copy.begin(), copy.end()); // Insert range at the beginning // {50 50 10 100 200 200 23 45 67 78}

    v.erase(v.begin() + 1);
    // 10 23 45 67 78
    v.erase(v.begin() + 2, v.begin() + 4);
    // 45 anf 47 erase and we get 10 23 78
    //  Erase range from index 2 to 4 (exclusive) [strat, end)
    v.insert(v.begin() + 2, v.begin() + 1, v.begin() + 3); // inserted elements at indices 1 and 2 before index 2.

    v.pop_back(); // Remove last element
    // v1.swap(v);   // Swap contents with another vector (ERROR: different types)
    vector<pair<int, int>> v1_copy;
    v1.swap(v1_copy); // Swap contents with another vector of same type
    cout << "After swap, v1 contains: ";
    v.clear(); // Clear all elements
    cout << v.empty() << endl;

    vector<int> vi;
    vi.push_back(10);          // Add to end
    vi.emplace_back(20);       // Faster version of push_back
    vi.insert(vi.begin(), 5);  // Insert at beginning
    vi.emplace(vi.begin(), 2); // Emplace at beginning
    vi.pop_back();             // Remove last element

    vector<int> extra = {30, 40};
    vi.insert(vi.end(), extra.begin(), extra.end()); // Insert range
    vi.erase(vi.begin());                            // Erase first element
    vi.erase(vi.begin(), vi.begin() + 1);            // Erase range
    vi.clear();                                      // Clear all elements
    vi = {1, 2, 3, 4, 5};                            // Assign values
    vi.resize(7);                                    // Resize (default fill with 0)
    vi.assign(5, 100);                               // Assign 5 elements of value 100

    // Element Access
    cout << "vi[2] = " << vi[2] << endl;
    cout << "at(3) = " << vi.at(3) << endl;
    cout << "front = " << vi.front() << endl;
    cout << "back = " << vi.back() << endl;
    int *dataPtr = vi.data();
    cout << "data[1] = " << *(dataPtr + 1) << endl;

    // Iterators
    cout << "Forward iteration: ";
    for (vector<int>::iterator it = vi.begin(); it != vi.end(); ++it)
        cout << *it << " ";
    cout << endl;

    cout << "Reverse iteration: ";
    for (vector<int>::reverse_iterator rit = vi.rbegin(); rit != vi.rend(); ++rit)
        cout << *rit << " ";
    cout << endl;

    // Utility
    vector<int> v2 = {100, 200};
    vi.swap(v2); // Swap contents

    cout << "After swap, vi contains: ";
    for (int SUMIT : vi)
        cout << SUMIT << " ";
    cout << endl;
}

int main()
{
    explainVector();
    return 0;
}