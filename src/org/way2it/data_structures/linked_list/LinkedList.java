package org.way2it.data_structures.linked_list;

import org.w3c.dom.Node;

public class LinkedList {

    // Represents the first node of this list
    // Should be initialized when first value is added
    private Node head;

    // Represents the number of values that were added to this list
    private int length = 0;

    public LinkedList() {

    }

    // Should add new value to the end of the list and increment length
    public void add(String value) {
        Node newNode = new Node();
        Node currNode = head;
        if(head == null) {
            head = newNode;
            head.value = value;
        } else {
            while(currNode.next != null) {
                currNode = currNode.next;
            }
            newNode.value = value;
            currNode.next = newNode;
        }
        length++;
    }

    // Should add new value next to specified afterValue, increment length and return true
    // If afterValue is not present in list - do nothing and return false.
    public boolean addAfter(String value , String afterValue) {
        if(!contains(afterValue)) {
            return false;
        }
        Node newNode = new Node();
        Node currNode = head;
        while(!currNode.value.equals(afterValue)) {
            currNode = currNode.next;
            if(afterValue.equals(currNode.value)) {
                newNode.value = value;
                newNode.next = currNode.next;
                currNode.next = newNode;
                length++;
            }
        }
        return true;
    }

    // Should return true if value exists in this list, false - otherwise
    public boolean contains(String value) {
        Node currNode = head;
        for(int i = 0; i < length; i++) {
            if(value.equals(currNode.value)) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    // Should remove first occurrence of the specified value from this list and decrement the length
    // If value existed and was removed - return true, false - otherwise
    public boolean remove(String value) {
        if(!contains(value)) {
            return false;
        }
        Node currNode = head;
        if(currNode.value.equals(value)) {
            head = currNode.next;
        } else {
            while(!currNode.next.value.equals(value)) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
        }

        length--;
        return true;
    }

    public int getLength() {
        return length;
    }

    private static class Node {
        String value;
        Node next;
    }
}
