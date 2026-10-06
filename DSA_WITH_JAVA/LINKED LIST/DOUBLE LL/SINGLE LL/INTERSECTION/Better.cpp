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
// Time  : O(N + M)
// Space : O(1)
// moves longer list by d nodes, then finds intersection
Node* collisionpoint(Node* t1, Node* t2, int d) {
    while(d--) {
        t2 = t2->next;
    }

    while(t1 != t2) {
        t1 = t1->next;
        t2 = t2->next;
    }
    return t1;
}

Node* intersectionHash(Node* head1, Node* head2) {
    Node* t1 = head1;
    Node* t2 = head2;

    int n1 = 0, n2 = 0;

    while(t1 != NULL) {
        n1++;
        t1 = t1->next;
    }

    while(t2 != NULL) {
        n2++;
        t2 = t2->next;
    }

    if(n1 < n2)
        return collisionpoint(head1, head2, n2 - n1);
    else
        return collisionpoint(head2, head1, n1 - n2);
}

int main() {
    vector<int> a1 = {8,9,1,2,3};
    vector<int> a2 = {9,6,1,2,3};

    Node* head1 = convertArr2ll(a1);
    Node* head2 = convertArr2ll(a2);

    // create intersection at node with value 1
    head2->next->next = head1->next->next;

    Node* ans = intersectionHash(head1, head2);

    if(ans)
        cout << "Intersection at: " << ans->data << endl;
    else
        cout << "No intersection" << endl;

    return 0;
}
