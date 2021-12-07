/*
* This program is a stack class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-07
*/

import java.util.ArrayList;

public class MrCoxallStack {
    ArrayList<Integer> stack = new ArrayList<Integer>();

    public void push(final int pushValue) {
        stack.add(pushValue);
    }

    public void showStack() {
        System.out.println(stack);
    }
}
