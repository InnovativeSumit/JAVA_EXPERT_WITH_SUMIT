// //Create a Single Linked list
#include<bits/stdc++.h>
using namespace std;

struct Node{

    public:
    int data;
    Node* next;

    public:

    Node(int data){
        this->data = data;
        next = nullptr;
    }

    Node (int data, Node* next1){
        this->data= data;
        this->next= next1;
    }

};

Node* CreateLL(vector<int>&arr){
    Node* head = new Node(arr[0]);
    Node* mover = head;

    for( int i = 1; i < arr.size() ; i++){
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;

}

// TC => O(N)
// SC => O(1)
Node* reverse(Node* head){

   Node* temp = head;
   Node* prev = NULL;

   while(temp!=NULL){
    Node* front = temp->next;
    temp->next = prev;
    prev = temp;
    temp = front;
   }

   return prev;
}


Node* print(Node* head){
    Node* temp1 = head;
    while(temp1!= NULL){
        cout<<temp1->data<<" ";
        temp1 = temp1->next;

    }
    cout<<endl;
}

int main(){
    vector<int>arr = {1,2,34,56,7,8,10,2,1};
    Node* head = CreateLL(arr);
    print(head);
    head = reverse(head);
    print(head);

}