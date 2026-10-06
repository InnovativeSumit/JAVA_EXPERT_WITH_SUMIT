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
//SC==>O(N)
Node* oddEvenList(Node* head) {
    if(head == NULL || head->next == NULL)
      return head;

    vector<int> arr;
    Node* temp1 = head;
    while(temp1!= NULL && temp1->next != NULL){
        arr.push_back(temp1->data);
        temp1= temp1->next->next;
    }

    if(temp1 != NULL){
        arr.push_back(temp1->data);
    }

    Node* temp2 = head->next;
     while(temp2!= NULL && temp2->next != NULL){
        arr.push_back(temp2->data);
        temp2= temp2->next->next;
    }
   
    if(temp2 != NULL){
        arr.push_back(temp2->data);
    }

    int i =0;
    Node* temp3 = head;

    while(temp3 != NULL){
        temp3->data = arr[i];
        i++;
        temp3 = temp3->next;
    }
return head;
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
    vector<int> arr = {1, 2, 3, 4, 5};
    Node *head = convertArr2ll(arr);
    head = oddEvenList(head);
    printLL(head);
    return 0;
}