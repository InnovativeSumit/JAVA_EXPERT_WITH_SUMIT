#include <bits/stdc++.h>
using namespace std;

// Doubly Linked List Node
struct Node {
    int data;
    Node* next;
    Node* prev;

    Node(int x) {
        data = x;
        next = NULL;
        prev = NULL;
    }
};

// Convert array to Sorted Doubly Linked List
Node* convertArr2DLL(vector<int>& arr) {
    if (arr.empty()) return NULL;

    Node* head = new Node(arr[0]);
    Node* temp = head;

    for (int i = 1; i < arr.size(); i++) {
        Node* newNode = new Node(arr[i]);
        temp->next = newNode;
        newNode->prev = temp;
        temp = newNode;
    }
    return head;
}

// Find tail of DLL
Node* findTail(Node* head) {
    Node* tail = head;
    while (tail->next != NULL)
        tail = tail->next;
    return tail;
}

// Find pairs with given sum (Two Pointer Approach)
// TC => O(N)
// SC => O(1)
void findPairs(Node* head, int k) {
    if (head == NULL) return;

    Node* left = head;
    Node* right = findTail(head);

    while (left != NULL && right != NULL && left->data < right->data) {
        int sum = left->data + right->data;

        if (sum == k) {
            cout << "(" << left->data << ", " << right->data << ")\n";
            left = left->next;
            right = right->prev;
        }
        else if (sum < k) {
            left = left->next;
        }
        else {
            right = right->prev;
        }
    }
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int k = 10;

    Node* head = convertArr2DLL(arr);

    cout << "Pairs with sum " << k << " are:\n";
    findPairs(head, k);

    return 0;
}
