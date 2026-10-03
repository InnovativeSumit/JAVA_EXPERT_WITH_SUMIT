#include <bits/stdc++.h>
using namespace std;

struct Node
{
public:
    int data;
    Node *next;

public:
    Node(int data1, Node *next1)
    {
        data = data1;
        next = next1;
    }

public:
    Node(int data1)
    {
        data = data1;
        next = nullptr;
    }
};

Node* convertArr2ll(vector<int> &arr)
{
    Node* head = new Node(arr[0]);
    Node* mover = head;
    for(int i =1; i<arr.size(); i++){
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}

// Node* insertHead(Node* head, int val){
//     Node* temp = new Node(val,head);
//     return temp;
// }

Node* insertHead(Node* head, int val){
    return  new Node(val,head);
}

void print(Node* head){
    while(head!= NULL){
        cout<<head->data<<" ";
        head = head->next;
    }
    cout<<endl;
}


int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};
    Node *head = convertArr2ll(arr);
    // head = insertHead(head, 11);
    head = new Node(101,head);
    print(head);
    return 0;
}