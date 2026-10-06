 #include <bits/stdc++.h>
using namespace std;

// Singly Linked List Node
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

// Reverse a linked list
Node* reverseLinkedList(Node* head) {
    Node* prev = NULL;
    Node* curr = head;

    while (curr != NULL) {
        Node* nextNode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextNode;
    }
    return prev;
}

// Get K-th node from current position
Node* getKthNode(Node* temp, int k) {
    k = k - 1;
    while (temp != NULL && k > 0) {
        temp = temp->next;
        k--;
    }
    return temp;
}

// Reverse nodes in K groups
// TC => O(N)
// SC => O(1)
Node* kReverse(Node* head, int k) {
    Node* temp = head;
    Node* prevLast = NULL;

    while (temp != NULL) {
        Node* kthNode = getKthNode(temp, k);

        // If remaining nodes < k, attach as it is
        if (kthNode == NULL) {
            if (prevLast)
                prevLast->next = temp;
            break;
        }

        Node* nextNode = kthNode->next;
        kthNode->next = NULL;

        // Reverse current group
        reverseLinkedList(temp);

        // Update head for first group
        if (temp == head) {
            head = kthNode;
        } else {
            prevLast->next = kthNode;
        }

        prevLast = temp;
        temp = nextNode;
    }

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
    vector<int> arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    Node* head = convertArr2LL(arr);
    cout << "Original List:\n";
    printLL(head);
    head = kReverse(head, k);
    cout << "Reversed in K Groups:\n";
    printLL(head);
    return 0;
}
