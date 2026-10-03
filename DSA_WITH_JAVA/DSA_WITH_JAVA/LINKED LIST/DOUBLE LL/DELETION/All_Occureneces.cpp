#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node* back;

    Node(int data1) {
        data = data1;
        next = nullptr;
        back = nullptr;
    }
};

Node* convertArr2Dll(vector<int> &arr) {
    Node* head = new Node(arr[0]);
    Node* mover = head;

    for (int i = 1; i < arr.size(); i++) {
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        temp->back = mover;        // 🔧 FIX
        mover = temp;
    }
    return head;
}

Node* removesOccureneces(Node* head, int k) {
    Node* temp = head;
    while (temp != NULL) {
        if (temp->data == k) {
            if (temp == head) {
                head = temp->next;
                if (head != NULL) head->back = NULL;
            } else {
                temp->back->next = temp->next;
                if (temp->next != NULL)
                    temp->next->back = temp->back;
            }
            Node* nextnode = temp->next;
            delete temp;          
            temp = nextnode;
        }
        else {
            temp = temp->next;
        }
    }
    return head;
}

void print(Node* head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    vector<int> arr = {1, 6, 2, 3, 6, 4, 5, 6};
    Node* head = convertArr2Dll(arr);
    head = removesOccureneces(head, 6);
    print(head);
    return 0;
}
