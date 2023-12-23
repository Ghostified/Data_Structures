/*
 * Recursion = when a method calls itself, when a thing is defined of itself, wikipedia
 * Recursion repeats a procedure, iteration repeats a process
 * It applys the result of a procedure to a procedure
 *  Easy to read and write and debug
 *  Slow and uses alot of memory
 */

public class Recursion {
    public static void main(String[] Args) {

        walk(5);
        walk2(10);
    }
    private static void walk (int steps) {
        for (int i = 0; i < steps; i++ )
        System.out.println("You take a step: ");
    }

    private static void walk2(int steps) {
        //base case , steps
        if (steps < 1) return;
        System.out.println("Ypu  take a step!");

        //recursive case,  steps
        walk (steps - 1);
    }

    
}
