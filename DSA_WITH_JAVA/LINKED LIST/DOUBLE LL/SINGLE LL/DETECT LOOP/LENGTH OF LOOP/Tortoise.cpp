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

int loopLength(Node* meet) {
    int cnt = 1;
    Node* temp = meet->next;

    while (temp != meet) {
        cnt++;
        temp = temp->next;
    }
    return cnt;
}

int detectLoopLength(Node* head) {
    Node* slow = head;
    Node* fast = head;
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;

        if (slow == fast) {
            return loopLength(slow);
        }
    }
    return 0; 
}
int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    Node* head = convertArr2ll(arr);
    // Create loop: 5 -> 3
    Node* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = head->next->next;
    int len = detectLoopLength(head);
    if (len > 0)
        cout << "Loop detected. Length = " << len << endl;
    else
        cout << "No loop detected\n";
    return 0;
}
