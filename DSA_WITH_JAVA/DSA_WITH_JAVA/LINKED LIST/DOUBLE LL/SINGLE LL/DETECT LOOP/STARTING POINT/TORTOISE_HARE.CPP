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

Node* convertArr2ll(vector<int>& arr) {
    if (arr.empty()) return NULL;

    Node* head = new Node(arr[0]);
    Node* temp = head;

    for (int i = 1; i < arr.size(); i++) {
        temp->next = new Node(arr[i]);
        temp = temp->next;
    }
    return head;
}

// Find starting point of loop using Tortoise & Hare
// TC => O(N)
// SC => O(1)
Node* findStartingPoint(Node* head) {
    Node* slow = head;
    Node* fast = head;

    // Step 1: Detect loop
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;

        if (slow == fast)
            break;
    }

    // No loop
    if (fast == NULL || fast->next == NULL)
        return NULL;

    // Find starting point
    slow = head;
    while (slow != fast) {
        slow = slow->next;
        fast = fast->next;
    }

    return slow; // starting node of loop
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    Node* head = convertArr2ll(arr);

    // Creating loop: 5 -> 3
    if (head && head->next && head->next->next) {
        Node* temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = head->next->next;
    }

    Node* start = findStartingPoint(head);

    if (start != NULL) {
        cout << "Loop detected\n";
        cout << "Loop starts at node with data: " << start->data << endl;
    } else {
        cout << "No loop detected\n";
    }

    return 0;
}

