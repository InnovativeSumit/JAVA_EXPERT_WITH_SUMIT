// remove nth node from the end
#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *next;

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

Node* remove(Node* head, int k)
{
    if(head == NULL)
        return NULL;

    int cnt = 0;
    Node* temp = head;

    // Count length
    while(temp != NULL){
        cnt++;
        temp = temp->next;
    }

    // Remove head
    if(cnt == k){
        Node* newHead = head->next;
        delete head;
        return newHead;
    }

    int res = cnt - k;
    temp = head;

    // Reach node just before deletion
    while(res > 1){
        temp = temp->next;
        res--;
    }

    Node* deleteNode = temp->next;
    temp->next = temp->next->next;
    delete deleteNode;

    return head;
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
    vector<int> arr = {11, 12, 13, 14, 15};
    Node *head = convertArr2ll(arr);

    head = remove(head, 4);
    print(head);

    return 0;
}
