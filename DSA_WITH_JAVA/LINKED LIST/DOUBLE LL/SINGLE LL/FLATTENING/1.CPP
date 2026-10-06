#include <bits/stdc++.h>
using namespace std;

/**************************************************
 * Node Definition
 **************************************************/
struct Node {
    int data;
    Node* next;
    Node* child;

    Node(int x) {
        data = x;
        next = NULL;
        child = NULL;
    }
};

/**************************************************
 * Merge two sorted linked lists using CHILD pointer
 * TC => O(N)
 * SC => O(1)
 **************************************************/
Node* merge(Node* list1, Node* list2) {
    Node* dummy = new Node(-1);
    Node* res = dummy;

    while (list1 != NULL && list2 != NULL) {
        if (list1->data <= list2->data) {
            res->child = list1;
            list1 = list1->child;
        } else {
            res->child = list2;
            list2 = list2->child;
        }
        res = res->child;
        res->next = NULL;   // IMPORTANT
    }

    if (list1) res->child = list1;
    else res->child = list2;

    return dummy->child;
}

/**************************************************
 * Flatten Linked List
 * TC => O(N * M)
 * SC => O(M) (recursion stack)
 **************************************************/
Node* flattenLinkedList(Node* head) {
    // Base case
    if (head == NULL || head->next == NULL)
        return head;

    // Recursively flatten the right list
    Node* mergedHead = flattenLinkedList(head->next);

    // Merge current list with flattened right list
    head = merge(head, mergedHead);

    return head;
}

/**************************************************
 * Utility: Print flattened list
 **************************************************/
void printList(Node* head) {
    while (head) {
        cout << head->data << " ";
        head = head->child;
    }
    cout << endl;
}

/**************************************************
 * MAIN FUNCTION (Demo)
 **************************************************/
int main() {

    /* Creating the same structure as example:
        1 -> 4 -> 7 -> 9 -> 20
        |    |    |    |
        2    5    8    12
        |    |
        3    6
    */

    Node* head = new Node(1);
    head->child = new Node(2);
    head->child->child = new Node(3);

    head->next = new Node(4);
    head->next->child = new Node(5);
    head->next->child->child = new Node(6);

    head->next->next = new Node(7);
    head->next->next->child = new Node(8);

    head->next->next->next = new Node(9);
    head->next->next->next->child = new Node(12);

    head->next->next->next->next = new Node(20);

    Node* flatHead = flattenLinkedList(head);

    cout << "Flattened List:\n";
    printList(flatHead);

    return 0;
}
