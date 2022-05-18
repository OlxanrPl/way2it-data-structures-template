package org.way2it.data_structures.binary_tree;

import org.way2it.data_structures.linked_list.LinkedList;

public class BinaryTree {
    // Represents the first node of this tree
    // Should be initialized when first value is added
    private Node root;
    private int size = 0;

    public BinaryTree() {

    }

    // Should add new value to the tree according to binary tree rules:
    // Values that are less than or equal to the value in the current node, should be placed in the left subtree
    // Values that are greater than the value in the current node - should be placed in the right subtree
    public void add(int value) {
        Node newNode = new Node();
        if(root == null) {
            root = newNode;
            root.value = value;
            size++;
        } else {
            addTree(value , root);
        }
    }

    private void addTree(int tValue , Node currRoot) {
        if(currRoot.value > tValue) {
            if(currRoot.left == null) {
                Node newNod = new Node();
                newNod.value = tValue;
                currRoot.left = newNod;
                size++;
            } else {
                addTree(tValue , currRoot.left);
            }
        } else {
            if(currRoot.right == null) {
                Node newNod = new Node();
                newNod.value = tValue;
                currRoot.right = newNod;
                size++;
            } else {
                addTree(tValue , currRoot.right);
            }
        }
    }

    // Should remove specified value from tree and return true
    // If value does not exist in this tree - return false
    public boolean remove(int value) {
        if(contains(value)) {
            return removeTree(value , root , root);
        } else {
            return false;
        }
    }

    private Node findMinElement(Node root) {
        if(root.left == null) {
            return root;
        }
        return findMinElement(root.left);
    }

    private boolean removeTree(int tValue , Node currRoot , Node preRoot) {

        if(currRoot.value == tValue) {
            if(currRoot.right == null && currRoot.left == null) {          // tree leaf
                if(preRoot.left == currRoot) {
                    preRoot.left = null;
                } else {
                    preRoot.right = null;
                }
                currRoot = null;
                size--;
                return true;
            } else if(currRoot.right == null && currRoot.left != null) { // children on the left
                if(preRoot.left == currRoot) {
                    preRoot.left = currRoot.left;
                } else {
                    preRoot.right = currRoot.left;
                }
                currRoot = null;
                size--;
                return true;
            } else if(currRoot.right != null && currRoot.left == null) { //children on the right

                if(preRoot.left == currRoot) {
                    preRoot.left = currRoot.right;
                } else {
                    preRoot.right = currRoot.right;
                }
                currRoot = null;
                size--;
                return true;
            } else {                                 // two children
                var newRoot = findMinElement(currRoot.right);  //min element from right tree
                if(preRoot != currRoot) {
                    if(preRoot.left == currRoot) {         // is not the Head!!!
                        preRoot.left = newRoot;
                    } else {
                        preRoot.right = newRoot;
                    }
                    newRoot.left = currRoot.left;
                    currRoot = null;
                    size--;
                } else {                                                          // is the Head!!!
                    var hValue = newRoot.value;
                    remove(hValue);
                    currRoot.value = hValue;
                }
                return true;
            }
        } else {
            if(currRoot.value > tValue) {
                if(currRoot.left == null) {
                    return false;
                } else {
                    return removeTree(tValue , currRoot.left , currRoot);
                }
            } else {
                if(currRoot.right == null) {
                    return false;
                } else {
                    return removeTree(tValue , currRoot.right , currRoot);
                }
            }
        }
    }

    // Should return true if this tree contains specified value, false - otherwise
    public boolean contains(int value) {
        return contTree(value , root);
    }

    private boolean contTree(int tValue , Node currRoot) {
        if(currRoot.value == tValue) {
            return true;
        } else {
            if(currRoot.value > tValue) {
                if(currRoot.left == null) {
                    return false;
                } else {
                    return contTree(tValue , currRoot.left);
                }
            } else {
                if(currRoot.right == null) {
                    return false;
                } else {
                    return contTree(tValue , currRoot.right);
                }

            }
        }
    }

    public int getSize() {
        return size;
    }

    private static class Node {
        int value;
        Node left;
        Node right;
    }
}
