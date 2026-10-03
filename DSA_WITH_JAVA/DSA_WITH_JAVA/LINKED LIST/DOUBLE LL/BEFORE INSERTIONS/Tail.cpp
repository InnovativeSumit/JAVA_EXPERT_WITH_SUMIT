#include <bits/stdc++.h>
using namespace std;

struct Node
{
public:
    int data;
    Node *next;
    Node* back;

public:
    Node(int data1, Node *next1 , Node* back1)
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
    if(arr.size() == 0) return NULL;

    Node* head = new Node(arr[0]);
    Node* mover = head;

    for(int i = 1; i < arr.size(); i++){
        Node* temp = new Node(arr[i]);
        temp->back = mover;        
        mover->next = temp;
        mover = temp;
    }
    return head;
}

Node* insertHead(Node* head , int val)
{
    if(head == NULL){
        return new Node(val);
    }

    Node* newHead = new Node(val, head, nullptr);
    head->back = newHead;
    return newHead;
}

Node* insertBeforeKthElement(Node* head , int k, int val)
{
    if(k == 1 ){
        return insertHead(head, val);
    }

    Node* temp = head;
    int cnt = 0;
    while(temp != NULL){
        cnt++;
        if(cnt == k) break;
        temp = temp->next;
    }

    Node* prev = temp->back;
    Node* newNode = new Node(val, temp, prev);

    prev->next = newNode;
    temp->back = newNode;
    return head;
}

void insertBeforeNode(Node* node , int val){
    Node* prev = node->back;
    Node* newNode = new Node(val ,node, prev);
    prev->next =  newNode;
    node->back = newNode;
}

void print(Node* head)
{
    while(head != NULL){
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}


int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};
    Node *head = convertArr2Dll(arr);
    // head = insertBeforeKthElement(head, 3, 34);
    insertBeforeNode(head->next->next, 99);
    print(head);
    return 0;
}
