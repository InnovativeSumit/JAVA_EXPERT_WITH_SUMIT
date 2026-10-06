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

// Print linked list (only for non-loop lists)
void print(Node* head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

// Detect loop using hashing
bool detectLoop(Node* head) {
    unordered_map<Node*, int> mpp;
    Node* temp = head;

    while (temp != NULL) {
        if (mpp[temp] == 1)
            return true;
        mpp[temp] = 1;
        temp = temp->next;
    }
    return false;
}

// Find starting point of loop using hashing
Node* findStartingPoint(Node* head) {
    unordered_map<Node*, int> mpp;
    Node* temp = head;

    while (temp != NULL) {
        if (mpp[temp] == 1) {
            return temp;   // loop starting node
        }
        mpp[temp] = 1;
        temp = temp->next;
    }
    return NULL; // no loop
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    Node* head = convertArr2ll(arr);

    // Creating a loop manually (5 -> 3)
    head->next->next->next->next->next = head->next->next;

    if (detectLoop(head)) {
        cout << "Loop detected" << endl;

        Node* start = findStartingPoint(head);
        cout << "Loop starts at node with data: " << start->data << endl;
    } else {
        cout << "No loop detected" << endl;
    }

    return 0;
}
