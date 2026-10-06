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


Node* convertArr2LL(vector<int>& arr) {
    if (arr.empty()) return NULL;

    Node* head = new Node(arr[0]);
    Node* temp = head;

    for (int i = 1; i < arr.size(); i++) {
        temp->next = new Node(arr[i]);
        temp = temp->next;
    }
    return head;
}

// Merge two sorted linked lists (Iterative - Two Pointer)
// TC => O(N + M)
// SC => O(1)
Node* mergeTwoSortedLists(Node* list1, Node* list2) {
    Node* t1 = list1;
    Node* t2 = list2;

    // Dummy node
    Node* dummy = new Node(-1);
    Node* temp = dummy;

    while (t1 != NULL && t2 != NULL) {
        if (t1->data <= t2->data) {
            temp->next = t1;
            t1 = t1->next;
        } else {
            temp->next = t2;
            t2 = t2->next;
        }
        temp = temp->next;
    }

    // Attach remaining nodes
    if (t1 != NULL)
        temp->next = t1;
    else
        temp->next = t2;

    return dummy->next;
}


void printLL(Node* head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    vector<int> arr1 = {1, 3, 5, 7};
    vector<int> arr2 = {2, 4, 6, 8,9};

    Node* list1 = convertArr2LL(arr1);
    Node* list2 = convertArr2LL(arr2);

    cout << "List 1:\n";
    printLL(list1);

    cout << "List 2:\n";
    printLL(list2);

    Node* mergedHead = mergeTwoSortedLists(list1, list2);
    cout << "Merged Sorted List:\n";
    printLL(mergedHead);

    return 0;
}
