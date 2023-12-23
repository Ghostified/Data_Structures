/*
 * Implementing recurssion to find the powers 
 * e.g x^y
 */
public class Powers {
    public static void main(String[]Args) {

        power(2,8);
        System.out.println(power(2,8));
    }
    public static int power (int base, int exponent) {
        //base case
        if (exponent < 1) return 1;

        //recursive case
        return base * power(base , exponent -1);
    }
}
