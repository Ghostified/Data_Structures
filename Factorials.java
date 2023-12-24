/*
 * Factorials are an illustration of recursion
 */
public class Factorials {
    
    public static void main(String[] Args) {
        factorial (7);
        System.out.println(factorial(10));
    }

    private static int factorial(int num) {

        //base case
        if ( num < 1) return 1;

        //recursive case
        return num * factorial(num - 1);
    }
}
