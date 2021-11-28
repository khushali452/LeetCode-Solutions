/*
705. Design HashSet

Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 

Example 1:

Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
 

Constraints:

0 <= key <= 106
At most 104 calls will be made to add, remove, and contains.
*/

class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class MyHashSet {
    /** Initialize your data structure here. */
    Node head , tail;
    public MyHashSet() {
        head = tail = null;
    }
    
    public void add(int key) {
        Node temp = new Node(key);
        
        Node p = head;
        while(p != null){
            if(p.data == key)return;
            p = p.next;
        }
        
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }
    
    public void remove(int key) {
        Node p = head, q = null;
        while(p != null && p.data != key){
            q = p;
            p = p.next;
        }
        
        if(p == null)return;
        if(head.data == key){
            head = head.next;
        }else{
            q.next = p.next;
        }
        
        if(p == tail)tail = q;
        p.next = null;
    }
    
    
    public boolean contains(int key) {
        Node p =head;
        while(p!=null){
            if(p.data == key)return true;
            p = p.next;
        }
        return false;
    }
    
}
