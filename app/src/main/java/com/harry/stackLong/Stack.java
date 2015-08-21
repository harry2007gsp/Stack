package com.harry.stackLong;

import android.util.Log;

public class Stack {
    private int maxElems;
    private long[] stackArray;
    private int topNelems; // top of stack

    public Stack(int max) {
        maxElems = max;
        stackArray = new long[max];
        topNelems = -1;
    }

    public void push(long j) {
        topNelems++;
        stackArray[topNelems] = j;
    }

    public long pop() {
        long value = stackArray[topNelems];
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
