package org.way2it.data_structures.list;

import java.util.stream.IntStream;

public class List {

    // Represent values in this list
    private String[] values = new String[4];

    // Represent the number of values that were added to this list

    private int length = 0;

    public List() {

    }

    // Should add new value to the end of the list, increment length and extend array by x2 if needed
    public void add(String value) {

        if(values.length <= length) {
            String[] buffer = values.clone();
            values = new String[length * 2];
            System.arraycopy(buffer , 0 , values , 0 , buffer.length);
        }
        values[length] = value;
        length++;

    }

    // Should add new value at the specified index, moving other values to the right,
    // increment length and extend array by x2 if needed

    public void addAtIndex(String value , int index) {

        if(values.length <= length) {
            String[] buffer = values.clone();
            values = new String[length * 2];
            System.arraycopy(buffer , 0 , values , 0 , buffer.length);
        }
        int j = 0;
        String[] tmpList = new String[values.length];
        for(int i = 0; i < tmpList.length; i++) {
            if(i == index) {
                tmpList[i] = value;
            } else {
                tmpList[i] = values[j];
                j++;
            }
        }
        values = tmpList.clone();
        length++;
    }

    // Should return a value at specified index, or null if index is out of list bounds

    public String get(int index) {

        if(index > length) {
            return null;
        } else {
            return values[index];
        }
    }

    // Should return the index of the first occurrence of specified value in list
    // If the value does not exist - return -1

    public int indexOf(String value) {

        int bound = values.length;
        for(int i = 0; i < bound; i++) {
            if(get(i) == value) {
                return i;
            }
        }
        return -1;

    }

    // Should remove the value at specified index, decrementing the length of this list and moving next values to the left

    public void remove(int index) {

        int j = 0;
        String[] tmpList = new String[values.length - 1];
        for(int i = 0; i < values.length; i++) {
            if(i != index) {
                tmpList[j] = values[i];
                j++;
            }
        }
        values = tmpList.clone();
        length--;
    }

    public int getLength() {

        return length;
    }
}
