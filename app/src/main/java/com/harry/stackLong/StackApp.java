package com.harry.stackLong;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.harry.R;
import com.harry.stackLong.Stack;


public class StackApp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void data(View view) {
        Stack stack = new Stack(10); // make new stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        if (!stack.isFull()) {
            stack.push(110);
        } else {
            Log.d("test", "full");
        }

        stack.display();
        Log.d("test", "*****************************");
        while (!stack.isEmpty()) {
            long value = stack.pop();
            Log.d("test", String.valueOf(value));
        }
        Log.d("test", "*****************************");

    }

}
