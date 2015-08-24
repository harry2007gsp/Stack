package com.harry;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.harry.stackLong.Stack;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hsingh on 8/21/15.
 */
public class MainActivity extends Activity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);

    }

    public void data(View view) {
        String input = "";
        String output = "";
        input = text.getText().toString();
        Reverser reverser = new Reverser(input);
        output = reverser.doRev();
        text.setText(output);
    }

}