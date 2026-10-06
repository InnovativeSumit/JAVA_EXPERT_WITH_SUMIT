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
Node*  SortData(Node* head) {
    if(head == NULL || head->next == NULL)
      return head;

      Node* temp1= head;
      int cnt0 = 0;
      int cnt1 = 0;
      int cnt2 = 0;
    
       while(temp1!= NULL){
        if(temp1->data == 0) cnt0++;
        else if(temp1->data == 1) cnt1++;
        else  cnt2++;

        temp1=temp1->next;
       }

       Node* temp2 = head;
       while(temp2!= NULL){
        if(cnt0){
            temp2->data=0;
            cnt0--;
        } 
        else if(cnt1){
            temp2->data = 1;
            cnt1--;
        }
        else{
            temp2->data = 2;
            cnt2--;
        }
        temp2= temp2->next;
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
    vector<int> arr = {0,1,2,1,2,1,2,0,1};
    Node *head = convertArr2ll(arr);
    head = SortData(head);
    printLL(head);
    return 0;
}