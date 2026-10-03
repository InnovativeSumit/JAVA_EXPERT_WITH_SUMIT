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

// Find pairs with given sum (BRUTE FORCE - YOUR ALGO)
// TC => O(N^2)
// SC => O(1)
void findPairsWithSum(Node* head, int sum) {
    Node* temp1 = head;

    while (temp1 != NULL) {
        Node* temp2 = temp1->next;

        while (temp2 != NULL && temp1->data + temp2->data <= sum) {
            if (temp1->data + temp2->data == sum) {
                cout << "(" << temp1->data << ", " << temp2->data << ")\n";
            }
            temp2 = temp2->next;
        }
        temp1 = temp1->next;
    }
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5, 6, 7, 8};
    int sum = 9;
    Node* head = convertArr2DLL(arr);
    cout << "Pairs with sum " << sum << " are:\n";
    findPairsWithSum(head, sum);
    return 0;
}
