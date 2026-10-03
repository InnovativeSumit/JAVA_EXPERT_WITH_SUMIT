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
Node* convertArr2LL(vector<int>& arr) {
    if (arr.empty()) return NULL;

    Node* head = new Node(arr[0]);
    Node* temp = head;

    for (int i = 1; i < arr.size(); i++) {
        temp->next = new Node(arr[i]);
        temp = temp->next;
    }
    return head;
}


Node* findNthNode(Node* temp, int k) {
    int cnt = 1;
    while (temp != NULL) {
        if (cnt == k) return temp;
        cnt++;
        temp = temp->next;
    }
    return NULL;
}

// Rotate Linked List to the Right by k positions
// TC => O(N)
// SC => O(1)
Node* rotate(Node* head, int k) {
    if (head == NULL || k == 0)
        return head;
        
    Node* tail = head;
    int len = 1;
    while (tail->next != NULL) {
        tail = tail->next;
        len++;
    }

    k = k % len;
    if (k == 0)
        return head;
    tail->next = head;
    Node* newLastNode = findNthNode(head, len - k);
    head = newLastNode->next;
    newLastNode->next = NULL;
    return head;
}


void printLL(Node* head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5, 6};
    int k = 2;
    Node* head = convertArr2LL(arr);
    cout << "Original List:\n";
    printLL(head);
    head = rotate(head, k);
    cout << "Rotated List:\n";
    printLL(head);

    return 0;
}
