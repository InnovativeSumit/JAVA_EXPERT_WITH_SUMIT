#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node(int x) {
        data = x;
        next = NULL;
    }
};

// Convert array to linked list
Node* convertArr2ll(vector<int>& arr) {
    if (arr.size() == 0) return NULL;

    Node* head = new Node(arr[0]);
    Node* temp = head;

    for (int i = 1; i < arr.size(); i++) {
        temp->next = new Node(arr[i]);
        temp = temp->next;
    }
    return head;
}

void print(Node* head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

// TC => O(N)
// SC => O(N)
// Detect loop using hashing
bool detectLoop(Node* head) {
    unordered_map<Node*, int> mpp;
    Node* temp = head;

    while (temp != NULL) {
        if (mpp[temp] == 1) {
            return true;   
        }
        mpp[temp] = 1;
        temp = temp->next;
    }
    return false; 
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    Node* head = convertArr2ll(arr);
    // Creating a loop manually (5 -> 3)
    head->next->next->next->next->next = head->next->next;
    if (detectLoop(head))
        cout << "Loop detected\n";
    else
        cout << "No loop detected\n";

    return 0;
}
