// ============================================================
// DOUBLY LINKED LIST (DLL) – DEFINITIONS & CHARACTERISTICS
// Language: C++
// Explanation written fully in COMMENT MODE
// ============================================================

// ------------------------------------------------------------
// DEFINITION:
// ------------------------------------------------------------
// A Doubly Linked List is a linear data structure in which
// each node contains three parts:
// 1) Pointer to the previous node
// 2) Data (value)
// 3) Pointer to the next node
//
// Unlike a Singly Linked List, traversal is possible
// in both forward and backward directions.

// ------------------------------------------------------------
// BASIC STRUCTURE OF A NODE (CONCEPTUAL):
// ------------------------------------------------------------
// [ prev | data | next ]
//
// prev → points to the previous node
// data → stores actual information
// next → points to the next node

// ------------------------------------------------------------
// KEY CHARACTERISTICS OF DOUBLY LINKED LIST:
// ------------------------------------------------------------

// 1) TWO-WAY TRAVERSAL
// - Nodes can be traversed from head to tail (forward)
// - Nodes can also be traversed from tail to head (backward)

// 2) EACH NODE HAS TWO POINTERS
// - prev pointer stores address of previous node
// - next pointer stores address of next node

// 3) MORE MEMORY USAGE
// - Compared to singly linked list, DLL uses extra memory
// - Reason: additional 'prev' pointer in each node

// 4) DYNAMIC SIZE
// - Size can grow or shrink at runtime
// - No fixed memory allocation like arrays

// 5) EFFICIENT INSERTION & DELETION
// - Insertion or deletion at beginning, middle, or end
//   can be done efficiently if node reference is known
// - No shifting of elements required

// 6) COMPLEX IMPLEMENTATION
// - More complex than singly linked list
// - Need to carefully update both prev and next pointers

// 7) HEAD AND TAIL CONCEPT
// - Head: first node (prev pointer is NULL)
// - Tail: last node (next pointer is NULL)

// ------------------------------------------------------------
// ADVANTAGES OF DOUBLY LINKED LIST:
// ------------------------------------------------------------

// - Bidirectional traversal possible
// - Easier deletion of a specific node
// - Useful in applications like:
//   * Browser forward/backward navigation
//   * Undo/Redo operations
//   * Music playlist navigation

// ------------------------------------------------------------
// DISADVANTAGES OF DOUBLY LINKED LIST:
// ------------------------------------------------------------

// - Extra memory required due to prev pointer
// - Slightly slower than singly linked list
//   because more pointer updates are required
// - More complex logic increases chance of bugs

// ------------------------------------------------------------
// COMPARISON WITH SINGLY LINKED LIST:
// ------------------------------------------------------------

// Singly Linked List:
// - One pointer (next)
// - One direction traversal
// - Less memory usage

// Doubly Linked List:
// - Two pointers (prev + next)
// - Two direction traversal
// - More memory usage but more flexibility

// ------------------------------------------------------------
// REAL-WORLD ANALOGY:
// ------------------------------------------------------------
// Imagine a train where:
// - Each coach knows which coach is ahead (next)
// - Each coach also knows which coach is behind (prev)
// This makes movement in both directions possible

// ------------------------------------------------------------
// TIME COMPLEXITY (GENERAL):
// ------------------------------------------------------------
// Insertion at head/tail: O(1)
// Deletion at head/tail: O(1)
// Search: O(n)
// Traversal: O(n)

// ------------------------------------------------------------
// END OF DOUBLY LINKED LIST THEORY
// ============================================================
