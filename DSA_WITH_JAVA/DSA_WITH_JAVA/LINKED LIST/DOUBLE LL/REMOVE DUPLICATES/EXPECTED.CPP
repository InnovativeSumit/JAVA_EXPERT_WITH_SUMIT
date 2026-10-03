// TC -> O(N)
// SC -> O(1)

#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node* back;

    Node(int data1) {
        data = data1;
        next = NULL;
        back = NULL;
    }
};

// Convert array to Doubly Linked List
Node* convertArr2Dll(vector<int>& arr) {
    if (arr.empty()) return NULL;

    Node* head = new Node(arr[0]);
    Node* mover = head;

    for (int i = 1; i < arr.size(); i++) {
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        temp->back = mover;   
        mover = temp;
    }
    return head;
}

// Remove duplicates from SORTED DLL
Node* removeDuplicates(Node* head) {
    Node* temp = head;

    while (temp != NULL && temp->next != NULL) {
        Node* nextNode = temp->next;

        while (nextNode != NULL && nextNode->data == temp->data) {
            Node* duplicate = nextNode;
            nextNode = nextNode->next;
            delete duplicate;    
        }

        temp->next = nextNode;
        if (nextNode != NULL)
            nextNode->back = temp;

        temp = temp->next;
    }
    return head;
}

// Print DLL
void print(Node* head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    vector<int> arr = {1, 1, 2, 3, 3, 4, 5, 5};
    Node* head = convertArr2Dll(arr);

    head = removeDuplicates(head);
    print(head);

    return 0;
}
