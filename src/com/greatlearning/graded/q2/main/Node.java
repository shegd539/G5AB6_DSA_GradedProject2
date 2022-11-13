/**
 * 
 */
package com.greatlearning.graded.q2.main;

class Node
{
    int val;
    Node left, right;
    
    // Helper function that allocates a new node
    // with the given data and NULL left and right
    // pointers.
    Node(int item)
    {
        val = item;
        left = right = null;
    }
}
