#include <iostream>
#include <stack> 
//LIFO structure
// TO ==>O(1) for push, pop, top
using namespace std;

void explainStack()
{
    stack<int> st;

    // Inserting elements (only at the top)
    st.push(1);    // Stack: {1}
    st.push(2);    // Stack: {1, 2}
    st.emplace(3); // Stack: {1, 2, 3}

    // Accessing the top element
    cout << "Top element: " << st.top() << endl; // 3

    // Removing top element
    st.pop(); // Stack becomes: {1, 2}

    // Size of the stack
    cout << "Size of stack: " << st.size() << endl;

    // Checking if stack is empty
    cout << "Is stack empty? " << (st.empty() ? "Yes" : "No") << endl;

    // Traversing the stack (NOTE: no iterators, must pop)
    cout << "Stack contents (LIFO order): ";
    while (!st.empty())
    {
        cout << st.top() << " "; // Print top
        st.pop();                // Remove top
    }
    cout << endl;

    // Stack is now empty again
}

int main()
{
    explainStack();
    return 0;
}
