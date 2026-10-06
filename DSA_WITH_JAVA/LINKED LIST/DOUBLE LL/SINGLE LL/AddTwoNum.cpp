#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *next;

    Node(int data1, Node *next1)
    {
        data = data1;
        next = next1;
    }

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

    for(int i = 1; i < arr.size(); i++){
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}

Node* addTwonum(Node* num1, Node* num2)
{
    Node* dummyhead = new Node(-1);
    Node* curr = dummyhead;

    Node* temp1 = num1;
    Node* temp2 = num2;
    int carry = 0;

    while(temp1 != nullptr || temp2 != nullptr){
        int sum = carry;

        if(temp1) sum += temp1->data;
        if(temp2) sum += temp2->data;

        carry = sum / 10;
        curr->next = new Node(sum % 10);
        curr = curr->next;

        if(temp1) temp1 = temp1->next;
        if(temp2) temp2 = temp2->next;
    }

    if(carry){
        curr->next = new Node(carry);
    }

    return dummyhead->next;
}

void print(Node* head)
{
    while(head){
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main()
{
    vector<int> arr1 = {2, 4, 3};   // represents 342
    vector<int> arr2 = {5, 6, 4};   // represents 465

    Node* num1 = convertArr2ll(arr1);
    Node* num2 = convertArr2ll(arr2);

    Node* result = addTwonum(num1, num2);
    print(result);

    return 0;
}
