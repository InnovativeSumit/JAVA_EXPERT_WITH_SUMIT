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

// TC => O(2N)
// SC => O(1) 

Node* reverse(Node* head){
   if(head == NULL || head->next == NULL){
    return head;
   }

   Node* newHead = reverse(head->next);
   Node* front = head->next;
   front->next = head;
   head->next = NULL;
   return newHead;

}

bool palindrome(Node* head){

    if(head == NULL || head->next == NULL ) 
    return true;

    Node* slow = head;
    Node* fast = head;

    while(fast->next != NULL && fast->next->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
    }

    Node* newHead =  reverse(slow->next);
    Node* first = head;
    Node* second = newHead;
    while(second!= NULL){
        if(first->data != second->data){
            reverse(newHead);
            return false;
        }
 
        first = first->next;
        second = second->next;
    }
    reverse(newHead);
    return true;
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
    vector<int>arr = {1,2,3,2,1};
    Node* head = CreateLL(arr);
    print(head);
    bool isPalindrome = palindrome(head);
    cout << (isPalindrome ? "Palindrome" : "Not Palindrome") << endl;

}