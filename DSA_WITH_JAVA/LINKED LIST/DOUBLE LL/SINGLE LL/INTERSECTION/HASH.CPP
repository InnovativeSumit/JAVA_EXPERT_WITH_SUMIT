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

Node* intersectionHash(Node* head1, Node* head2) {
    unordered_set<Node*> st;

    while(head1 != NULL) {
        st.insert(head1);
        head1 = head1->next;
    }

    while(head2 != NULL) {
        if(st.find(head2) != st.end())
            return head2;
        head2 = head2->next;
    }
    return NULL;
}

int main() {
    vector<int> a1 = {8,9,1,2,3};
    vector<int> a2 = {9,6,1,2,3};

    Node* head1 = convertArr2ll(a1);
    Node* head2 = convertArr2ll(a2);

    // create intersection
    head2->next->next = head1->next->next;

    Node* ans = intersectionHash(head1, head2);

    if(ans)
        cout << "Intersection at: " << ans->data << endl;
    else
        cout << "No intersection" << endl;
}
