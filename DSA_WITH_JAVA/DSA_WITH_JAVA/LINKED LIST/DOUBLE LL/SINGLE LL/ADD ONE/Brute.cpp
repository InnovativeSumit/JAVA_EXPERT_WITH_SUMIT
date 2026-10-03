// TC => O(3N)
// SC => O(1) 
#include <bits/stdc++.h>
using namespace std;

struct Node {
public:
    int data;
    Node* next;

    Node(int data) {
        this->data = data;
        next = nullptr;
    }

    Node(int data, Node* next1) {
        this->data = data;
        this->next = next1;
    }
};


Node* CreateLL(vector<int>& arr) {
    if (arr.size() == 0) return nullptr;

    Node* head = new Node(arr[0]);
    Node* mover = head;

    for (int i = 1; i < arr.size(); i++) {
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}


// TC => O(N)
// SC => O(N) (recursive stack)
Node* reverse(Node* head) {
    if (head == NULL || head->next == NULL) {
        return head;
    }

    Node* newHead = reverse(head->next);
    Node* front = head->next;
    front->next = head;
    head->next = NULL;
    return newHead;
}


// Add 1 to number represented by linked list
Node* addOne(Node* head) {
    head = reverse(head);

    Node* temp = head;
    int carry = 1;

    while (temp != NULL) {
        temp->data = temp->data + carry;

        if (temp->data < 10) {
            carry = 0;
            break;
        } else {
            temp->data = 0;
            carry = 1;
        }
        temp = temp->next;
    }

    head = reverse(head);

    if (carry == 1) {
        Node* newNode = new Node(1);
        newNode->next = head;
        return newNode;
    }

    return head;
}

void print(Node* head) {
    Node* temp = head;
    while (temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

int main() {
    vector<int> arr = {1, 2, 3};
    Node* head = CreateLL(arr);
    print(head);

    head = reverse(head);
    print(head);

    head = addOne(head);
    print(head);

    return 0;
}
