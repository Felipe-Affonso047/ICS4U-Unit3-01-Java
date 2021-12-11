/*
* This program is a stack class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-07
*/

import java.util.ArrayList;

public class MrCoxallStack {
    /**
    * Stack vareable.
    */
    private ArrayList<Integer> stack = new ArrayList<Integer>();

    /**
    * Function adds value to stack.
    *
    * @param pushValue
    */
    public void push(final int pushValue) {
        stack.add(0, pushValue);
    }

    /**
    * Prints stack.
    */
    public void showStack() {
        for (int counter = 0; counter < stack.size(); counter++) {
            System.out.println(stack.get(counter));
        }
    }
}
