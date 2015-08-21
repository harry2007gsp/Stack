package com.harry;

import android.util.Log;

/**
 * Created by hsingh on 8/21/15.
 */
public class StackCharacter {
    private int maxElems;
    private char[] stackArray;
    private int topNelems; // top of stack

    public StackCharacter(int max) {
        maxElems = max;
        stackArray = new char[max];
        topNelems = -1;
    }

    public void push(char j) {
        topNelems++;
        stackArray[topNelems] = j;
    }

    public char pop() {
        char value = stackArray[topNelems];
        topNelems--;
        return value;
    }

    public long peek() {
        return stackArray[topNelems];
    }

    public boolean isEmpty() {
        return (topNelems == -1);
    }

    public boolean isFull() {
        return (topNelems == maxElems - 1);
    }

    public void display() {
        for (int i = 0; i <= topNelems; i++) {
            Log.d("test", String.valueOf(stackArray[i]));
        }
    }
}
