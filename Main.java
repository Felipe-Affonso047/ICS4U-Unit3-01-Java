/*
* This program test the stack class
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-07
*/

import java.util.Random;

final class Main {
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static void main(final String[] args) {
        MrCoxallStack stack = new MrCoxallStack();

        System.out.println("Inicial Stack:");
        stack.showStack();

        System.out.println("Add 10:");
        stack.push(10);

        stack.showStack();

        System.out.println("Add 27:");
        stack.push(27);

        stack.showStack();

        System.out.println("\nDone.");
    }
}
