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

// Floyd’s Cycle Detection
// TC => O(N)
// SC => O(1)
bool detectLoop(Node* head) {
    Node* slow = head;
    Node* fast = head;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;           // move 1 step
        fast = fast->next->next;    // move 2 steps

        if (slow == fast)
            return true;
    }
    return false;
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    Node* head = convertArr2ll(arr);
    // Safely create loop: 5 -> 3
    if (head && head->next && head->next->next) {
        Node* temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = head->next->next;
    }
    if (detectLoop(head))
        cout << "Loop detected\n";
    else
        cout << "No loop detected\n";
    return 0;
}
