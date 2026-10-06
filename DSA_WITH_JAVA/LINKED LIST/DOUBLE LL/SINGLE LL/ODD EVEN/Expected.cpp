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
Node* oddEvenList(Node* head) {
    if(head == NULL || head->next == NULL)
      return head;

      Node* odd = head;
      Node* even = head->next;
      Node* evenHead = head->next;

        while(even != NULL && even->next != NULL){
        odd->next = even->next;   // link odd nodes
        odd = odd->next;

        even->next = odd->next;  // link even nodes
        even = even->next;
        }
        odd->next = evenHead;

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