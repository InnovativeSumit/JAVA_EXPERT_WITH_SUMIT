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
    Node* head = new Node(arr[0]);
    Node* mover = head;
    for(int i =1; i<arr.size(); i++){
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}

Node* removesHead(Node* head){
    if(head==NULL || head->next==NULL) {
        return NULL;
    }
    Node* prev = head;
    head = head->next;

    head->back = nullptr;
    prev->next = nullptr;
    
    delete prev;
    return head;

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
    Node *head = convertArr2Dll(arr);
    head = removesHead(head);
    print(head);
    return 0;
}