## **BFS Algorithm in Java**

### What is BFS?

* Breadth-First Search (BFS) is based on traversing nodes by adding the neighbors of each node to the traversal queue starting from the root node. The BFS for a graph is similar to that of a tree, with the exception that graphs may have cycles. In contrast to depth-first search, all neighbor nodes at a given depth are investigated before proceeding to the next level.

* BFS Algorithm
The following are the steps involved in employing breadth-first search to explore a graph:

1. Take the data for the graph's adjacency matrix or adjacency list.
2. Create a queue and fill it with items.
3. Activate the root node (meaning that get the root node at the beginning of the queue).
4. Dequeue the queue's head (or initial element), then enqueue all of the queue's nearby nodes from left to right. Simply dequeue the head and resume the operation if a node has no nearby nodes that need to be investigated. (Note: If a neighbor emerges that has previously been investigated or is in the queue, don't enqueue it; instead, skip it.)
Continue in this manner until the queue is empty.
<br>

### BFS Psuedocode
- create a queue Q 
- mark v as visited and put v into Q 
- while Q is non-empty 
-     remove the head u of Q 
-     mark and enqueue all (unvisited) neighbours of u