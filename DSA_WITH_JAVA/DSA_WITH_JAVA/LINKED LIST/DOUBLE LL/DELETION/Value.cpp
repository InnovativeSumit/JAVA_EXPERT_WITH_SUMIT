#include <bits/stdc++.h>
using namespace std;

struct Node
{
public:
    int data;
    Node *next;
    Node *back;

public:
    Node(int data1, Node *next1, Node *back1)
    {
        data = data1;
        next = next1;
        back = back1;
    }

public:
    Node(int data1)
    {
        data = data1;
        next = nullptr;
        back = nullptr;
    }
};

Node* convertArr2Dll(vector<int> &arr)
{
    if (arr.size() == 0) return NULL;

    Node* head = new Node(arr[0]);
    Node* mover = head;

    for (int i = 1; i < arr.size(); i++) {
        Node* temp = new Node(arr[i]);
        temp->back = mover;        
        mover->next = temp;
        mover = temp;
    }
    return head;
}

Node* removesHead(Node* head)
{
    if (head == NULL || head->next == NULL) {
        delete head;
        return NULL;
    }

    Node* prev = head;
    head = head->next;

    head->back = nullptr;
    prev->next = nullptr;

    delete prev;
    return head;
}

Node* removeTail(Node* head)
{
    if (head == NULL || head->next == NULL) {
        delete head;
        return NULL;
    }

    Node* tail = head;
    while (tail->next != NULL) {
        tail = tail->next;
    }

    Node* newTail = tail->back;
    newTail->next = nullptr;
    tail->back = nullptr;

    delete tail;
    return head;
}

Node* removek(Node* head, int k)
{
    if (head == NULL || k <= 0) return head;

    int cnt = 1;
    Node* kNode = head;

    while (kNode != NULL && cnt < k) {
        cnt++;
        kNode = kNode->next;
    }

    if (kNode == NULL) return head;   

    Node* prev = kNode->back;
    Node* front = kNode->next;

    if (prev == NULL) {
        return removesHead(head);
    }
    else if (front == NULL) {
        return removeTail(head);
    }

    prev->next = front;
    front->back = prev;

    kNode->next = nullptr;
    kNode->back = nullptr;

    delete kNode;
    return head;
}

void deleteNode(Node* temp)
{
    if (temp == NULL) return;

    Node* prev = temp->back;
    Node* front = temp->next;

    // Case 1: only one node
    if (prev == NULL && front == NULL) {
        delete temp;
        return;
    }

    // Case 2: deleting head
    if (prev == NULL) {
        front->back = nullptr;
        temp->next = nullptr;
        delete temp;
        return;
    }

    // Case 3: deleting tail
    if (front == NULL) {
        prev->next = nullptr;
        temp->back = nullptr;
        delete temp;
        return;
    }

    // Case 4: deleting middle node
    prev->next = front;
    front->back = prev;

    temp->next = nullptr;
    temp->back = nullptr;
    delete temp;
}
void print(Node* head)
{
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};
    Node *head = convertArr2Dll(arr);
    deleteNode(head->next);
    print(head);

    return 0;
}
