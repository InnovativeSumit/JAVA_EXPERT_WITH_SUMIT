// A Linked List is a linear data structure where elements (nodes)
// are not stored in contiguous memory locations like arrays.

// Each node in a linked list contains two parts:
// 1. Data        -> stores the value
// 2. Pointer     -> stores the address of the next node

// Structure of a Node:
// [ Data | Next Address ]

// Types of Linked Lists:
// 1. Singly Linked List    -> node points to next node only
// 2. Doubly Linked List    -> node points to next and previous nodes
// 3. Circular Linked List  -> last node points back to first node

// Advantages:
// - Dynamic size (can grow or shrink at runtime)
// - Efficient insertion and deletion (no shifting like arrays)

// Disadvantages:
// - Extra memory needed for pointers
// - No direct access (no indexing like arr[i])
// - Slower traversal compared to arrays

// Example representation:
// Head -> [10 | *] -> [20 | *] -> [30 | NULL]

// Here, Head stores the address of the first node

// // Linked Lists are used in many real-world and system-level applications
// where dynamic memory management and frequent insert/delete operations
// are required.

// 1. Dynamic Memory Allocation
//    - Used internally by malloc/new/free
//    - Memory blocks are linked together

// 2. Implementation of Stacks and Queues
//    - Stack using linked list (push/pop at head)
//    - Queue using linked list (enqueue at tail, dequeue at head)

// 3. Operating Systems
//    - Process scheduling (ready queue)
//    - Memory management
//    - File system directory structures

// 4. Undo / Redo Operations
//    - Text editors (Ctrl + Z / Ctrl + Y)
//    - Browser history navigation

// 5. Graphs and Trees
//    - Adjacency list representation of graphs
//    - Tree nodes are linked structures

// 6. Hash Tables
//    - Collision handling using chaining
//    - Each bucket is a linked list

// 7. Music / Video Players
//    - Playlist navigation (next / previous songs)

// 8. LRU Cache
//    - Doubly linked list + hash map
//    - Used in browsers, databases, OS caching

// 9. Polynomial Manipulation
//    - Each term stored as a node

// 10. Real-time Applications
//     - When array resizing is expensive
//     - When frequent insertions/deletions are needed


// struct node{
//     int data;
//     node* next;
//     node(int data1, node* next1){
//         data= data1;
//         next = next1;
//     }
// }

// // ================= MEMORY SPACE (LINKED LIST) =================

// Linked List nodes are stored in NON-CONTIGUOUS memory locations.
// This means nodes can be anywhere in RAM.

// Each node is created dynamically using heap memory (new / malloc).

// Example:
// Node1 at address 0x100
// Node2 at address 0x5F0
// Node3 at address 0xA20
// These addresses are NOT sequential.

// Each node stores:
// - Data part
// - Pointer part (address of next node)

// Memory Layout of a Node:
// [ DATA | NEXT POINTER ]

// The pointer connects nodes across different memory locations.

// ================= MEMORY ALLOCATION =================

// Arrays:
// - Stored in contiguous memory
// - Fast access using index
// - Fixed or costly resizing

// Linked Lists:
// - Stored in scattered memory
// - Access only through traversal
// - Dynamic size

// ================= MEMORY EFFICIENCY =================

// Extra memory is required for pointers:
// Singly Linked List  -> 1 pointer per node
// Doubly Linked List  -> 2 pointers per node

// Due to pointers, linked lists use MORE memory than arrays.

// ================= CACHE PERFORMANCE =================

// Arrays:
// - Better cache locality
// - Faster traversal

// Linked Lists:
// - Poor cache locality
// - Slower traversal due to pointer chasing

// ================= MEMORY FRAGMENTATION =================

// Linked lists can cause HEAP FRAGMENTATION
// because nodes are allocated and freed frequently.

// ================= SUMMARY =================

// ✔ Uses heap memory
// ✔ Non-contiguous storage
// ✔ Dynamic memory allocation
// ❌ Extra pointer overhead
// ❌ Slower access compared to arrays


// // ================= DIFFERENCE BETWEEN Node AND Node* =================

// Node
// -----
// - Node is a data type (structure or class).
// - It represents a single linked list node.
// - It stores actual data and pointer(s).
// - Example:
//   Node n;           // creates a node object
//   n.data = 10;

// Memory:
// - Stored wherever it is declared (stack or heap).

// Node*
// -----
// - Node* is a pointer to a Node.
// - It stores the ADDRESS of a Node, not the node itself.
// - Used to link nodes together.
// - Example:
//   Node* p = new Node();  // p points to a node in heap

// Memory:
// - Pointer stores an address (usually 4 or 8 bytes).
// - The actual node is stored separately in memory.

// ================= WHY Node* IS USED IN LINKED LIST =================

// - Nodes are dynamically allocated in heap.
// - Each node must store the address of the next node.
// - That address is stored using Node*.

// Example:
// struct Node {
//     int data;
//     Node* next;   // pointer to next node
// };

// ================= SIMPLE ANALOGY =================

// Node     -> Actual house
// Node*    -> House address

// ================= SUMMARY =================

// Node      = actual object (data + links)
// Node*     = reference/address to a Node
// Node* is essential for dynamic data structures
