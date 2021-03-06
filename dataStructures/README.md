# Linked List

A library for the linked list.

## Challenges

Creating a Linked List class allowing for a collection of values to be updated efficiently. Should create a Node class to represent each point of the collection. The Linked List class should provide methods to insert new Nodes in the head position and search the Nodes for a specific value. The LinkedList should pretty print.

## Approach & Efficiency

First I created a linkedList class then a node class. The insert method is used to insert a head into the empty or "null" node. Next the includes method is used to check whether or not there is a head, then continue. Lastly the toSTring method stringifies the nodes and displays them.

Time Efficiency:
  - insert : O(1)
  - includes + toString: O(n)
  - append : 
  - insertBefore : 
  - insertAfter : 
  - kthFromEnd : O(n)
  - zipList : 

Space Efficiency:
  - insert + toString: O(n)
  - includes : O(n)
  - append : 
  - insertBefore : 
  - insertAfter : 
  - kthFromEnd : O(1)
  - zipList : 

## Methods

LinkedList Methods:
  - insert : Takes an integer and assigns it to be the new head. The new integer is now the head, and the previous head is the nextnode
  - includes : Takes an integer and checks for the value amung the nodes.
  - toString : Returns a string with the linked list. Shows what we did!
  - append : Appends a new integer to the front / head of our linkedlist.
  - insertbefore : The integer checks for a value we set, once that value is found, the new value is inserted before it.
  - insertafter : This was a duplicate of insert before, except we just inserted after.
  - kthFromEnd : 