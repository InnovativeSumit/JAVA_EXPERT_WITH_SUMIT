#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node(int x) {
        data = x;
        next = NULL;
    }
};

Node* convertArr2ll(vector<int>& arr) {
    Node* head = new Node(arr[0]);
    Node* temp = head;

    for(int i = 1; i < arr.size(); i++) {
        temp->next = new Node(arr[i]);
        temp = temp->next;
    }
    return head;
}

// Two Pointer Switching Method
// Time  : O(N + M)
// Space : O(1)
Node* intersectionPoint(Node* firsthead, Node* secondhead) {

    if(firsthead == NULL || secondhead == NULL)
        return NULL;

    Node* temp1 = firsthead;
    Node* temp2 = secondhead;

    while(temp1 != temp2) {
        temp1 = (temp1 == NULL) ? secondhead : temp1->next;
        temp2 = (temp2 == NULL) ? firsthead  : temp2->next;
    }
    return temp1;  // either intersection node or NULL
}

int main() {
    // Common part (intersection)
    vector<int> common = {1, 2, 3};
    Node* commonHead = convertArr2ll(common);

    // First linked list: 8 -> 9 -> 1 -> 2 -> 3
    vector<int> a1 = {8, 9};
    Node* head1 = convertArr2ll(a1);
    Node* temp = head1;
    while(temp->next) temp = temp->next;
    temp->next = commonHead;

    // Second linked list: 9 -> 6 -> 1 -> 2 -> 3
    vector<int> a2 = {9, 6};
    Node* head2 = convertArr2ll(a2);
    temp = head2;
    while(temp->next) temp = temp->next;
    temp->next = commonHead;

    Node* ans = intersectionPoint(head1, head2);

    if(ans)
        cout << "Intersection at: " << ans->data << endl;
    else
        cout << "No intersection" << endl;

    return 0;
}
