
// TC => O(N)
// SC => O(N) (recursive stack)
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

int addHelper(Node* temp){
    if(temp == NULL){
        return 1;
    }

    int carry = addHelper(temp->next);
    temp->data+= carry;
    
    if(temp->data < 10) return 0;
    temp->data = 0;
    return 1;
}

Node* addOne(Node* head){
 int carry = addHelper(head);
 if (carry == 1){
    Node* newNode = new Node(1);
    newNode->next = head;
    head = newNode;
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

    
    head = addOne(head);
    print(head);

    return 0;
}
