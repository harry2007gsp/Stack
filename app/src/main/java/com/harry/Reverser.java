package com.harry;

/**
 * Created by hsingh on 8/21/15.
 */
public class Reverser {
    private String input;
    private String output;

    public Reverser(String in) {
        input = in;
    }
    public String doRev() {
        int stackSize = input.length();
        StackCharacter stackCharacter = new StackCharacter(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stackCharacter.push(ch);
        }
        output = "";
        while (!stackCharacter.isEmpty()) {
            char ch = stackCharacter.pop();
            output = output+ch;
        }
        return output;
    }
}
