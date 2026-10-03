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
    if (arr.size() == 0) return NULL;

    Node* head = new Node(arr[0]);
    Node* temp = head;

    for (int i = 1; i < arr.size(); i++) {
        temp->next = new Node(arr[i]);
        temp = temp->next;
    }
    return head;
}

// Calculate loop length using hashing
int loopLength(Node* head) {
    unordered_map<Node*, int> mpp;
    Node* temp = head;
    int step = 0;

    while (temp != NULL) {
        if (mpp.find(temp) != mpp.end()) {
            return step - mpp[temp];
        }
        mpp[temp] = step;
        step++;
        temp = temp->next;
    }
    return 0; 
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    Node* head = convertArr2ll(arr);
    // Creating loop: 5 -> 3
    head->next->next->next->next->next = head->next->next;
    int len = loopLength(head);
    if (len > 0)
        cout << "Loop length is: " << len << endl;
    else
        cout << "No loop found\n";
    return 0;
}
