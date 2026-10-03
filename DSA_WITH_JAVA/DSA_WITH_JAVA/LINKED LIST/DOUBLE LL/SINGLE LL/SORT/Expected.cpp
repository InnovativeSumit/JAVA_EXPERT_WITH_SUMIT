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

//TC==> O(N)
//SC==>O(1)
Node* SortData(Node* head)
{
    if(head == NULL || head->next == NULL)
        return head;

    Node* zeroHead = new Node(-1);
    Node* oneHead  = new Node(-1);
    Node* twoHead  = new Node(-1);

    Node* zero = zeroHead;
    Node* one  = oneHead;
    Node* two  = twoHead;

    Node* temp = head;

    //  Distribute nodes
    while(temp != NULL)
    {
        if(temp->data == 0){
            zero->next = temp;
            zero = zero->next;
        }
        else if(temp->data == 1){
            one->next = temp;
            one = one->next;
        }
        else{
            two->next = temp;
            two = two->next;
        }
        temp = temp->next;
    }

    //  Connect lists
    zero->next = (oneHead->next) ? oneHead->next : twoHead->next;
    one->next  = twoHead->next;
    two->next  = NULL;

    //  New head
    Node* newHead = zeroHead->next;

    return newHead;
}



void printLL(Node* head)
{
    while(head != NULL){
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main()
{
    vector<int> arr = {0,1,2,1,2,1,2,0,1};
    Node *head = convertArr2ll(arr);
    head = SortData(head);
    printLL(head);
    return 0;
}